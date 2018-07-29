import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		System.out.println("Welcome to my search and sorter!");
		System.out.println("How big would you like your array to be?");
		int arraySize = -1;
		while(arraySize < 0)
		{
			String sizeLine = scanner.nextLine();
			try
			{
				arraySize = Integer.parseInt(sizeLine);
				if(arraySize < 0)
				{
					System.out.println("That isn't a valid size, please try again!");
				}
			}
			catch(Exception e)
			{
				System.out.println("That isn't a valid size, please try again!");
			}
		}
		Sorter sorter = new Sorter(arraySize);
		while(running)
		{
			System.out.println("Here are a list of commands you may execute:");
			System.out.println("- Display - Display the contents of the array.");
			System.out.println("- Delete <prompt: Position> - Delete the specified element from the array.");
			System.out.println("- Insert <prompt: Value> <prompt: Position> - Inserts a value at the specified position.");
			System.out.println("- InsSort - Executes an insertion sort.");
			System.out.println("- SelSort - Executes a selection sort.");
			System.out.println("- Scramble - lsamscrbe het ryara. (Scrambles the array.)");
			System.out.println("- Exit - Exits the program.");
			String input = scanner.nextLine();
			if(input.equalsIgnoreCase("display"))
			{
				sorter.display();
			}
			else if(input.equalsIgnoreCase("delete"))
			{
				if(sorter.getSize() != 0)
				{
					System.out.println("What position?");
					int position = -1;
					while(position < 0 || position >= sorter.getSize())
					{
						String newIn = scanner.nextLine();
						try
						{
							position = Integer.parseInt(newIn);
							if(position < 0 || position >= sorter.getSize())
							{
								System.out.println("That isn't a valid position, please try again!");
							}
						}
						catch(Exception e)
						{
							System.out.println("That isn't a valid position, please try again!");
						}
					}
					sorter.delete(position, false);
				}
				else
				{
					System.out.println("There are no elements in the array to delete!");
				}
			}
			else if(input.equalsIgnoreCase("insert"))
			{
				System.out.println("What position?");
				int position = -1;
				while(position < 0 || position >= sorter.getSize())
				{
					String newIn = scanner.nextLine();
					try
					{
						position = Integer.parseInt(newIn);
						if(position < 0 || position >= sorter.getSize())
						{
							System.out.println("That isn't a valid position, please try again!");
						}
					}
					catch(Exception e)
					{
						System.out.println("That isn't a valid position, please try again!");
					}
				}
				
				System.out.println("What value?");
				boolean assigned = false;
				int value = -1;
				while(!assigned)
				{
					String newIn = scanner.nextLine();
					try
					{
						value = Integer.parseInt(newIn);
						assigned = true;
					}
					catch(Exception e)
					{
						System.out.println("That isn't a valid value, please try again!");
					}
				}
				sorter.insert(position, value, false);
			}
			else if(input.equalsIgnoreCase("inssort"))
			{
				sorter.insSort();
			}
			else if(input.equalsIgnoreCase("selsort"))
			{
				sorter.selSort();
			}
			else if(input.equalsIgnoreCase("scramble"))
			{
				sorter.scramble();
			}
			else if(input.equalsIgnoreCase("exit"))
			{
				running = false;
			}
			else
			{
				System.out.println("That isn't a valid command, please try again!");
			}
		}
		scanner.close();
	}
}