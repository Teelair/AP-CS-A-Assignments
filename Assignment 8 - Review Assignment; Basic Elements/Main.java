import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to my calculator! Here are the base functions it can handle:");
		while(true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("  - Addition (+)");
			System.out.println("  - Subtraction (-)");
			System.out.println("  - Multiplication (*)");
			System.out.println("  - Division (/)");
			System.out.println("  - Power/Exponents (^)");
			System.out.println("  - Factorials (!)");
			System.out.println("  - Even Checker (E)");
			System.out.println("  - Odd Checker (O)\n");
			System.out.println("What operation would you like to do? (Pick a character between the parenthesis up above.)");

			String input = "";
			while(input.equals(""))
			{
				input = getOperator(scanner);
			}

			boolean specialOperator = (input.equals("!") || input.equals("E") || input.equals("O"));

			System.out.println("Please input your " + (!specialOperator ? "first " : "") + "term.");
			double term1 = Integer.MIN_VALUE;
			while(term1 == Integer.MIN_VALUE)
			{
				term1 = getTerm(scanner);
			}
			if(!specialOperator)
			{
				System.out.println("Please input your second term.");
				double term2 = Integer.MIN_VALUE;
				while(term2 == Integer.MIN_VALUE)
				{
					term2 = getTerm(scanner);
				}

				System.out.println(term1 + getDialogBasedOnOperator(input) + term2 + " is " + performOperationBasedOnOperator(input, term1, term2));
			}
			else
			{
				double result = performOperationBasedOnSpecialOperator(input, term1);
				System.out.printf("%1.0f%s%s\n", term1, getDialogBasedOnSpecialOperator(input, (input.equals("!") ? true : result == 1 ? true : false)), (input.equals("!") ? result : ""));
			}
		}
		
	}

	public static String getDialogBasedOnOperator(String operator)
	{
		switch(operator)
		{
		case "+":
			return " added to ";
		case "-":
			return " subtract ";
		case "*":
			return " multiplied by ";
		case "/":
			return " divided by ";
		case "^":
			return " to the power of ";
		default:
			return null;
		}
	}

	public static double performOperationBasedOnOperator(String operator, double term1, double term2)
	{
		switch(operator)
		{
		case "+":
			return term1 + term2;
		case "-":
			return term1 - term2;
		case "*":
			return term1 * term2;
		case "/":
			return term1 / term2;
		case "^":
			return Math.pow(term1, term2);
		default:
			return 0;
		}
	}

	public static String getDialogBasedOnSpecialOperator(String operator, boolean trueStatement)
	{
		switch(operator)
		{
		case "!":
			return " factorial is ";
		case "E":
			return " is" + (trueStatement ? "" : "n\'t") + " even.";
		case "O":
			return " is" + (trueStatement ? "" : "n\'t") + " odd.";
		default:
			return null;
		}
	}

	public static double performOperationBasedOnSpecialOperator(String operator, double term)
	{
		switch(operator)
		{
		case "!":
			return factorial(term);
		case "E":
			return isEven(term) ? 1 : 0;
		case "O":
			return isEven(term) ? 0 : 1;
		default:
			return 0;
		}
	}

	public static boolean isEven(double inputToCheck)
	{
		return inputToCheck % 2 == 0;
	}

	public static long factorial(double term)
	{
		long result = 1;
		for(double i = term; i >= 1; i--)
		{
			result *= i;
		}
		return result;
	}
	
	public static String getOperator(Scanner scanner)
	{
		String input = scanner.nextLine();
		if(!(input.equals("+") || input.equals("-") || input.equals("/") || input.equals("*") || input.equals("^") || input.equals("!")|| input.equals("E") || input.equals("O")))
		{
			return "";
		}
		else
		{
			return input;
		}
	}

	public static double getTerm(Scanner scanner)
	{
		return scanner.nextDouble();
	}
}
