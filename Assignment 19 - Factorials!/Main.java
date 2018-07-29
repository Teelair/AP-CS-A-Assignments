import java.util.Scanner;

public class Main 
{
	public static String numbers = "0123456789";
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to my recursive Factorial Calculator!");
		System.out.println("Please enter a value between 0 and 20 inclusive.");
		System.out.println("Or type \"exit\" at any time to terminate the calculator.");
		String input = "";
		while(input.equals(""))
		{
			int toFactorial = 0;
			while(toFactorial < 1 || toFactorial > 20)
			{
				String factorialIn = scanner.nextLine();
				if(factorialIn.equals("exit"))
				{
					System.out.println("Goodbye!");
					scanner.close();
					return;
				}
				if(factorialIn.length() < 1 || factorialIn.length() > 2 || !numbers.contains(factorialIn.substring(0, 1)) || !numbers.contains(factorialIn.substring(1)))
				{
					System.out.println("Invalid input! Please enter a value between 0 and 20 inclusive.");
					break;
				}
				toFactorial = Integer.parseInt(factorialIn);
				if(toFactorial > 20)
				{
					System.out.println("Invalid input! Please enter a value between 0 and 20 inclusive.");
					break;
				}
				else
				{
					System.out.println(toFactorial + "!" + " is " + getFactorial(toFactorial, 1));
					System.out.println("Please enter a value between 0 and 20 inclusive.");
					System.out.println("Or type \"exit\" at any time to terminate the calculator.");
				}
			}
		}
		scanner.close();
	}

	public static long getFactorial(double term, long runningTotal)
	{
		if(term == 0)
		{
			return 0;
		}
		if(term == 1)
		{
			return runningTotal;
		}
		if(term > 1)
		{
			runningTotal *= term;
		}
		return getFactorial(term - 1, runningTotal);
	}
}
