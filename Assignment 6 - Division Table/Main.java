public class Main 
{
	public static void main(String[] args)
	{
		for(double i = 10; i >= 1; i--)
		{
			System.out.printf((i == 10 ? "  " : "") + "%9.0f " + (i == 1 ? "\n" : ""), i);
		}
		for(double i = 10; i >= 1; i--)
		{
			for(double j = 10; j >= 1; j--)
			{
				double result = i / j;
				if(j == 10)
				{
					System.out.printf("%2.0f", i);
				}
				System.out.printf("%9.4f " + (j == 1 ? "\n" : ""), result);
			}
		}
	}
}
