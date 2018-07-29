import java.util.Random;

public class Sorter 
{
	private int[] array;
	
	public Sorter(int arraySize)
	{
		array = new int[arraySize];
		Random random = new Random();
		for(int i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt(501);
		}
	}
	
	public void display()
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(i + "  " + array[i]);
		}
	}
	
	public int getSize()
	{
		return array.length;
	}
	
	public void delete(int position)
	{
		long startTime = System.currentTimeMillis();
		int[] tempArray = new int[array.length - 1];
		for(int i = 0; i < position; i++)
		{
			tempArray[i] = array[i];
		}
		for(int i = position; i < tempArray.length; i++)
		{
			tempArray[i] = array[i + 1];
		}
		array = tempArray;
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Elapsed time: " + timeElapsed + "ms");
	}
	
	public void insert(int position, int value)
	{
		long startTime = System.currentTimeMillis();
		int[] tempArray = new int[array.length + 1];
		for(int i = 0; i <= position; i++)
		{
			tempArray[i] = array[i];
		}
		array[position] = value;

		for(int i = position + 1; i < tempArray.length; i++)
		{
			tempArray[i] = array[i - 1];
		}
		array = tempArray;
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Elapsed time: " + timeElapsed + "ms");
	}
}
