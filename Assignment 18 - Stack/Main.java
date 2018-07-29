import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Stack stack = new Stack();
		boolean running = true;
		boolean sentenceReverser = false;
		System.out.println("Welcome to my Stack program!");
		while(running)
		{
			if(sentenceReverser)
			{
				System.out.println("If you enter a phrase, I'll reverse the order of the words.");
			}
			System.out.println("Commands:");
			if(!sentenceReverser)
			{
				System.out.println("push - Add an integer to the stack");
				System.out.println("pop - Remove an integer from the stack and display it");
			}
			System.out.println("exit - Exit the program");
			System.out.println((sentenceReverser ? "downgrade - Downgrade back down to default." : "upgrade - Upgrade into Sentence Reverser!") + "\n");
			System.out.println("Please enter a " + (sentenceReverser ? "phrase or " : "") + "command: ");
			String input = scanner.nextLine();
			switch(input.toLowerCase())
			{
			case "push":
				if(!sentenceReverser)
				{
					System.out.println("What value do you want to push?");
					boolean valid = false;
					while(!valid)
					{
						try
						{
							int toPush = Integer.parseInt(scanner.nextLine());
							stack.push(toPush);
							valid = true;
						}
						catch(Exception e)
						{
							System.out.println("Error: Please provide a valid number for input!");
						}
					}
				}
				else
				{
					System.out.println(stack.getReverseSentence(input));
				}
				break;
			case "pop":
				if(!sentenceReverser)
				{
					Object popped = stack.pop();
					System.out.println(popped != null ? ("Popped value: " + popped) : "Error: The stack is empty! Please push a value first.");
				}
				else
				{
					System.out.println(stack.getReverseSentence(input));
				}
				break;
			case "exit":
				System.out.println("Goodbye!");
				return;
			case "upgrade":
				System.out.println("Successfully upgraded! Welcome to the amazing Stack Sentence Reverser!");
				sentenceReverser = true;
				break;
			case "downgrade":
				sentenceReverser = false;
				break;
			default:
				if(sentenceReverser)
				{
					System.out.println(stack.getReverseSentence(input));
				}
				else
				{
					System.out.println("That doesn't seem to be a command, please try again!");
				}
				break;
			}
		}
		scanner.close();
	}
}
