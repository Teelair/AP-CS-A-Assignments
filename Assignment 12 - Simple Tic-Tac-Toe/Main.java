import java.util.Random;
import java.util.Scanner;

public class Main 
{
	public static int turn = -1;
	public static char[][]board = new char[3][3];

	enum Team
	{
		X,
		O,
		None
	}

	public static void main(String[] args)
	{
		char noneChar = getTeamMarker(Team.None);
		for(int x = 0; x < 3; x++)
		{
			for(int y = 0; y < 3; y++)
			{
				board[x][y] = noneChar;
			}
		}
		System.out.println("Welcome to my Tic Tac Toe game!");
		System.out.println("To determine who goes first, let's do a coinflip. Heads or tails?");
		String input = "";
		Scanner scanner = new Scanner(System.in);
		while(input.equals(""))
		{
			String nextLine = scanner.nextLine();
			input = ((nextLine.equalsIgnoreCase("heads") || nextLine.equalsIgnoreCase("tails")) ? nextLine : "");
			if(input.equals(""))
			{
				System.out.println("Invalid input, try again!");
			}
		}
		Random random = new Random();
		int choice = random.nextInt(2);
		if(input.toLowerCase().equals("heads") && choice == 0)
		{
			turn = 0;
			System.out.println("X's turn first!");
			printBoard();
			promptUser(scanner, Team.X);
		}
		else if(input.toLowerCase().equals("tails") && choice == 1)
		{
			turn = 0;
			System.out.println("X's turn first!");
			printBoard();
			promptUser(scanner, Team.X);
		}
		else
		{
			turn = 1;
			System.out.println("O's turn first!");
			printBoard();
			promptUser(scanner, Team.O);
		}
		scanner.close();
	}

	public static void promptUser(Scanner scanner, Team team)
	{
		System.out.println("Give me a coordinate pair of where you'd like to go! Ex: (2, 1)");
		String input = "";
		while(input.equals(""))
		{
			input = scanner.nextLine();
			if(input.contains("(") || input.contains(")") || input.contains(" "))
			{
				input = input.replace("(", "");
				input = input.replace(")", "");
				input = input.replace(" ", "");
			}
			if(!input.contains(","))
			{
				System.out.println("Invalid input, please input something like (1, 2)!");
				input = "";
			}
			else
			{
				String[] pointArgs = input.split(",");
				int x = -1;
				int y = -1;
				try
				{
					x = Integer.parseInt(pointArgs[0]);
					y = Integer.parseInt(pointArgs[1]);
				}
				catch(Exception e)
				{
					System.out.println("Invalid input, please input something like (1, 2)!");
					input = "";
				}

				if((x != -1 && y != -1) && (x >= 1 && x <= 3) && (y >= 1 && y <= 3))
				{
					if(!isMarked(new int[] { (x - 1), (y - 1) }))
					{
						markPoint(team, new int[] { (x - 1), (y - 1) });
						printBoard();
						int wins = countWins(team);
						if(wins > 0)
						{
							System.out.println("Game Over, " + team + " won" + (wins > 1 ? " twice!" : "!"));
						}
						else
						{
							if(!isBoardFull(board))
							{
								turn = (turn == 0 ? 1 : 0);
								promptUser(scanner, getTeamFromTurn(turn));
							}
							else
							{
								System.out.println("Game over! It's a draw.");
							}
						}
					}
					else
					{
						System.out.println("That point is already marked, please try again!");
						input = "";
					}
				}
				else
				{
					System.out.println("Invalid input, please input something like (1, 2)!");
					input = "";
				}
			}
		}
	}

	public static Team getTeamFromTurn(int turn)
	{
		return (turn == 0 ? Team.X : Team.O);
	}
	
	public static void printBoard()
	{	
		System.out.println(  "    1   2   3");
		System.out.println(  "  ┌───┬───┬───┐");
		System.out.printf(1 + " │ %s │ %s │ %s │\n", board[0][0], board[1][0], board[2][0]);
		System.out.println(  "  ├───┼───┼───┤");
		System.out.printf(2 + " │ %s │ %s │ %s │\n", board[0][1], board[1][1], board[2][1]);
		System.out.println(  "  ├───┼───┼───┤");
		System.out.printf(3 + " │ %s │ %s │ %s │\n", board[0][2], board[1][2], board[2][2]);
		System.out.println(  "  └───┴───┴───┘");
	}

	public static boolean isMarked(int[] point)
	{
		return !(board[point[0]][point[1]] == ' ');
	}
	
	public static boolean isMarkedByTeam(int[] point, Team team)
	{
		return (board[point[0]][point[1]] == getTeamMarker(team));
	}

	public static void markPoint(Team team, int[] point)
	{
		if(!isMarked(point))
		{
			board[point[0]][point[1]] = getTeamMarker(team);
		}
	}

	public static char getTeamMarker(Team team)
	{
		switch(team)
		{
		case X:
			return 'X';
		case O:
			return 'O';
		case None:
			return ' ';
		default:
			return ' ';
		}
	}
	
	public static int countWins(Team team)
	{
		int wins = 0;
		int[] topLeftCorner = new int[] { 0, 0 };
		int[] topMiddle = new int[] { 1, 0 };
		int[] topRightCorner = new int[] { 2, 0 };
		
		int[] middleLeft = new int[] { 0, 1 };
		int[] middle = new int[] { 1, 1 };
		int[] middleRight = new int[] { 2, 1 };
		
		int[] bottomLeftCorner = new int[] { 0, 2 };
		int[] bottomMiddle = new int[] { 1, 2 };
		int[] bottomRightCorner = new int[] { 2, 2 };
		if(isGroupMarkedByTeam(topLeftCorner, topMiddle, topRightCorner, team))
		{
			wins++;
		}
		if(isGroupMarkedByTeam(middleLeft, middle, middleRight, team))
		{
			wins++;
		}
		if(isGroupMarkedByTeam(bottomLeftCorner, bottomMiddle, bottomRightCorner, team))
		{
			wins++;
		}
		if(isGroupMarkedByTeam(topLeftCorner, middleLeft, bottomLeftCorner, team))
		{
			wins++;
		}
		if(isGroupMarkedByTeam(topMiddle, middle, bottomMiddle, team))
		{
			wins++;
		}
		if(isGroupMarkedByTeam(topRightCorner, middleRight, bottomRightCorner, team))
		{
			wins++;
		}
		if(isGroupMarkedByTeam(topLeftCorner, middle, bottomRightCorner, team))
		{
			wins++;
		}
		if(isGroupMarkedByTeam(topRightCorner, middle, bottomLeftCorner, team))
		{
			wins++;
		}
		return wins;
	}
	
	public static boolean isBoardFull(char[][] board)
	{
		int[] topLeftCorner = new int[] { 0, 0 };
		int[] topMiddle = new int[] { 1, 0 };
		int[] topRightCorner = new int[] { 2, 0 };
		
		int[] middleLeft = new int[] { 0, 1 };
		int[] middle = new int[] { 1, 1 };
		int[] middleRight = new int[] { 2, 1 };
		
		int[] bottomLeftCorner = new int[] { 0, 2 };
		int[] bottomMiddle = new int[] { 1, 2 };
		int[] bottomRightCorner = new int[] { 2, 2 };
		if(isMarked(topLeftCorner) && isMarked(topMiddle) && isMarked(topRightCorner) &&
		   isMarked(middleLeft) && isMarked(middle) && isMarked(middleRight)  &&
		   isMarked(bottomLeftCorner) && isMarked(bottomMiddle) && isMarked(bottomRightCorner))
		{
			return true;
		}
		return false;
	}
	
	public static boolean isGroupMarkedByTeam(int[] point1, int[] point2, int[] point3, Team team)
	{
		return (isMarkedByTeam(point1, team) && isMarkedByTeam(point2, team) && isMarkedByTeam(point3, team));
	}
}
