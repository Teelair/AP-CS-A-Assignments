public class Main 
{
	public static void main(String[] args)
	{
		countUp();
		takeOneDown();
	}
	
	public static void countUp()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void takeOneDown()
	{
		for(int i = 99; i > 0; i-=3)
		{
			System.out.println(i + " bottles of coke on the wall, " + i + " bottles of coke,");
			System.out.println("Take 3 down, drink them down,");
			System.out.println((i - 3) + " bottles of coke on the wall.");
		}
	}
}
