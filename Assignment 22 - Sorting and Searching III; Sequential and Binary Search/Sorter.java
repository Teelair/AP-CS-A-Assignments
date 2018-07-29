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

	public void delete(int position, boolean silent)
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
		if(!silent) { System.out.println("Elapsed time: " + timeElapsed + "ms"); }
	}

	public void insert(int position, int value, boolean silent)
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
		if(!silent) { System.out.println("Elapsed time: " + timeElapsed + "ms"); }
	}

	public void insSort()
	{
		long startTime = System.currentTimeMillis();
		for (int i = 1; i < array.length; i++) 
		{
			for(int j = i; j > 0; j--)
			{
				if(array[j] < array[j - 1])
				{
					insert(j - 1, array[j], true);
					delete(j, true);
					insert(j, array[j - 1], true);
					delete(j - 1, true);
				}
			}
		}
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Elapsed time: " + timeElapsed + "ms");
	}

	public void selSort()
	{
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < array.length - 1; i++)
		{
			int index = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j] < array[index]) 
				{
					index = j;
				}
			}
			int min = array[index];
			insert(index, array[i], true);
			delete(index, true);
			insert(i, min, true);
			delete(i, true);
		}
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Elapsed time: " + timeElapsed + "ms");
	}

	public void scramble()
	{
		long startTime = System.currentTimeMillis();
		Random random = new Random();
		for(int i = array.length - 1; i >= 0; i--)
		{
			int toSwitch = random.nextInt(array.length);
			int temp = array[toSwitch];
			insert(toSwitch, array[i], true);
			delete(toSwitch, true);
			insert(i, temp, true);
			delete(i, true);
		}
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Elapsed time: " + timeElapsed + "ms");
	}

	public int sequentialSearch(int toSearch)
	{
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == toSearch)
			{
				long endTime = System.currentTimeMillis();
				long timeElapsed = endTime - startTime;
				System.out.println("Elapsed time: " + timeElapsed + "ms");
				return i;
			}
		}
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Elapsed time: " + timeElapsed + "ms");
		return -1;
	}

	public int binarySearch(int toSearch)
	{
		long startTime = System.currentTimeMillis();
		int min = 0;
		int max = array.length - 1;
		int half = (max - min) / 2;
		while(array[half] != toSearch)
		{
			if(array[half] > toSearch)
			{
				max = half;
			}
			else
			{
				min = half;
			}
			half = min + (max - min) / 2;
			if(array[half] == toSearch)
			{
				long endTime = System.currentTimeMillis();
				long timeElapsed = endTime - startTime;
				System.out.println("Elapsed time: " + timeElapsed + "ms");
				return half;
			}
			if((max - min) < 2 && array[half] != toSearch)
			{
				long endTime = System.currentTimeMillis();
				long timeElapsed = endTime - startTime;
				System.out.println("Elapsed time: " + timeElapsed + "ms");
				return -1;
			}
		}
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Elapsed time: " + timeElapsed + "ms");
		return -1;
	}
}
