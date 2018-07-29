import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Please provide 8 numbers.");
		double[] numbers = new double[8];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 8; i++)
		{
			numbers[i] = scanner.nextDouble();
		}

		System.out.println("\nMean: " + calculateMean(numbers));
		System.out.println("Lowest: " + findLowestNumber(numbers));
		System.out.println("Highest: " + findHighestNumber(numbers) + "\n");

		System.out.println("Which index do you want to see the value of?");
		int index = -1;
		while(!(index > 0 && index < 7))
		{
			index = scanner.nextInt();
			if(index > 0 && index < 7)
			{
				System.out.println(numbers[index]);
			}
			else
			{
				System.out.println("Invalid index, please try again.");
			}
		}
		scanner.close();
	}

	public static double calculateMean(double[] numbers)
	{
		double total = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			total += numbers[i];
		}
		return (total / numbers.length);
	}

	public static double findLowestNumber(double[] numbers)
	{
		double lowest = numbers[0];
		for(int i = 1; i < numbers.length; i++)
		{
			if(numbers[i] < lowest)
			{
				lowest = numbers[i];
			}
		}
		return lowest;
	}

	public static double findHighestNumber(double[] numbers)
	{
		double highest = numbers[0];
		for(int i = 1; i < numbers.length; i++)
		{
			if(numbers[i] > highest)
			{
				highest = numbers[i];
			}
		}
		return highest;
	}
}
