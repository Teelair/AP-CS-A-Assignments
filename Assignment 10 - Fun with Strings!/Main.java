import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		String input = "";
		System.out.println("Give me some input to reverse and count vowels for!");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		
		System.out.println("Reversed String: " + reversedString(input));
		System.out.println("Vowels: " + countVowels(input));
		System.out.println("Input " + (containsThe(input) ? "contains" : "does not contain") + " \"the.\"");
		System.out.println("Give me an index between 0 and " + (input.length() - 1) + ", and I'll tell you the character at that spot.");
		System.out.println(input.charAt(scanner.nextInt()));
		scanner.close();
	}
	
	public static String reversedString(String input)
	{
		String output = "";
		char[] convertedInput = input.toCharArray();
		for(int i = convertedInput.length - 1; i >= 0; i--)
		{
			output += convertedInput[i];
		}
		return output;
	}
	
	public static int countVowels(String input)
	{
		char[] convertedInput = input.toLowerCase().toCharArray();
		int vowelAmount = 0;
		for(char ch : convertedInput)
		{
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowelAmount++;
			}
		}
		return vowelAmount;
	}
	
	public static boolean containsThe(String input)
	{
		input = input.toLowerCase();
		if(input.startsWith("the "))
		{
			return true;
		}
		if(input.contains(" the "))
		{
			return true;
		}
		if(input.endsWith(" the"))
		{
			return true;
		}
		if(input.substring(input.length() - 5, input.length() - 1).equalsIgnoreCase(" the"))
		{
			return true;
		}
		return false;
	}
}
