import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		List<String> roster = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter command: ");
		String input = "";
		while(input.equals(""))
		{
			System.out.println("Please choose a command.");
			System.out.println("add - Add new names to the roster.");
			System.out.println("disp - Display the roster.");
			System.out.println("find - Search the roster.");
			System.out.println("ins - Insert a name in the roster.");
			System.out.println("rem - Remove a name from the roster.");
			System.out.println("exit - Exit program.");
			input = scanner.nextLine();
			switch(input.toLowerCase())
			{
			case "add":
				System.out.print("How many names would you like to add? ");
				int amount = -1;
				while(amount <= 0)
				{
					try
					{
						amount = Integer.parseInt(scanner.nextLine());	
					}
					catch(Exception e)
					{
						System.out.println("That's an invalid number, please try again.");
					}
				}
					if(amount <= 0)
					{
						System.out.println("That's an invalid number, please try again.");
					}
					else
					{
						for(int i = 0; i < amount; i++)
						{
							System.out.print("Enter name to add: ");
							String newName = scanner.nextLine();
							roster.add(newName);
							System.out.println(newName + " has been added to the roster!");
					}
				}
				input = "";
				break;
			case "disp":
				if(roster.size() != 0)
				{
					for(int i = 0; i < roster.size(); i++)
					{
						System.out.println((i + 1) + ") " + roster.get(i));
					}
				}
				else
				{
					System.out.println("Error! There's nothing in the roster to display.");
				}
				input = "";
				break;
			case "find":
				if(roster.size() != 0)
				{
					String toFind = scanner.nextLine();
					List<Integer> indexes = new ArrayList<Integer>();
					for(int i = 0; i < roster.size(); i++)
					{
						if(roster.get(i).equalsIgnoreCase(toFind))
						{
							indexes.add(i);
						}
					}
					if(indexes.size() > 0)
					{
					System.out.print("The name " + toFind + " was found at index" + (indexes.size() > 1 ? "es" : "") + " ");
					String indexFormatted = (indexes.size() > 1 ? "" : indexes.get(0) + "");
					if(indexes.size() > 1)
					{
						for(int i = 0; i < indexes.size(); i++)
						{
							indexFormatted += indexes.get(i) + (i == indexes.size() - 1 ? "" : ", " + (i == indexes.size() - 2 ? "and " : ""));
						}
					}
					System.out.print(indexFormatted + ".\n");
					}
					else
					{
						System.out.println("Person not found in roster.");
					}
				}
				else
				{
					System.out.println("Error! There's nothing in the roster to find.");
				}
				input = "";
				break;
			case "ins":
				if(roster.size() != 0)
				{
					System.out.print("Enter name to insert: ");
					String nameToInsert = scanner.nextLine();
					System.out.print("Enter index to insert at: ");
					int indexToInsertAt = -1;
					while(indexToInsertAt < 0 && indexToInsertAt >= roster.size())
					{
						indexToInsertAt = (Integer.parseInt(scanner.nextLine()));
						if(!(indexToInsertAt < 0 && indexToInsertAt >= roster.size()))
						{
							roster.add(indexToInsertAt, nameToInsert);
							System.out.println(nameToInsert + " has been inserted into to the roster at index " + indexToInsertAt + "!");
						}
						else
						{
							System.out.println("The specified index is invalid!");
						}
					}
				}
				else
				{
					System.out.println("Error! There's nothing in the roster to insert around.");
				}
				input = "";
				break;
			case "rem":
				if(roster.size() != 0)
				{
					boolean isInt = false;
					int index = -1;
					String scannerInput = scanner.nextLine();
					try
					{
						index = Integer.parseInt(scannerInput);
						isInt = true;
					}
					catch(Exception e) {}
					if(isInt && index >= 0)
					{
						System.out.println("Removing " + roster.get(index) + " at index " + index + ".");
						roster.remove(index);
					}
					else
					{
						if(roster.contains(scannerInput))
						{
							System.out.println("Removing " + scannerInput + ".");
							roster.remove(scannerInput);
						}
						else
						{
							System.out.println("The roster does not contain that name.");
						}
					}
				}
				else
				{
					System.out.println("Error! There's nothing in the roster to remove.");
				}
				input = "";
				break;
			case "exit":
				System.out.println("Goodbye!");
				break;
			default:
				input = "";
				break;
			}
		}
		scanner.close();
	}
}