import java.util.Arrays;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		drawNoseCone();
		drawRocketBodyPart(null, false);
		drawRocketBodyPart(Arrays.asList("These are", "some lines", "of text!"), false);
		drawRocketBodyPart(null, true);
		drawRockerBooster();
		drawFlames();
	}

	public static void drawNoseCone()
	{
		for(int i = 0; i < 7; i++) 
		{
			String resultLine = "";
			for(int j = 0; j < (6 - i); j++)
			{
				resultLine += " ";
			}

			resultLine += "/";

			for(int j = 0; j < i; j++)
			{
				resultLine += "  ";
			}

			resultLine += "\\";

			System.out.println(resultLine);
		}
	}

	public static void drawRocketBodyPart(List<String> lines, boolean finalBodyPart)
	{
		System.out.println("+------------+");
		if(lines != null)
		{
			for(int i = 0; i < lines.size(); i++)
			{
				int lineLength = lines.get(i).length();
				if(lineLength >= 12)
				{
					System.out.println("|" + lines.get(i).substring(0, 12) + "|");
				}
				else
				{
					String result = "";
					int spaceDecide = (12 - lineLength);
					boolean isEven = spaceDecide % 2 == 0 ? true : false;
					if(isEven)
					{
						for(int j = 0; j < (spaceDecide / 2); j++)
						{
							result += " ";
						}
						result += lines.get(i);
						for(int j = 0; j < (spaceDecide / 2); j++)
						{
							result += " ";
						}
					}
					else
					{
						for(int j = 0; j < (spaceDecide / 2); j++)
						{
							result += " ";
						}
						result += lines.get(i);
						for(int j = 0; j < (spaceDecide / 2) + 1; j++)
						{
							result += " ";
						}
					}
					System.out.println("|" + result + "|");
				}
			}
		}
		else
		{
			for(int i = 0; i < 3; i++)
			{
				System.out.println("|            |");
			}
		}
		if(finalBodyPart)
		{
			System.out.println("+------------+");
		}
	}

	public static void drawRockerBooster()
	{
		for(int i = 0; i < 4; i++)
		{
			String resultLine = "";
			for(int j = 0; j < (5 - i - 1); j++)
			{
				resultLine += " ";
			}

			resultLine += "/";

			for(int j = 0; j < (i + 2); j++)
			{
				resultLine += "--";
			}

			resultLine += "\\";

			System.out.println(resultLine);
		}
	}

	public static void drawFlames()
	{
		System.out.println(" |          |");
		System.out.println(" /          /");
		System.out.println(" \\         /");
		System.out.println("  \\       /");
		System.out.println("   \\      \\");
		System.out.println("   /      /");
		System.out.println("   \\      \\");
		System.out.println("    \\     /");
		System.out.println("    /    /");
		System.out.println("    \\   /");
		System.out.println("     \\  \\");
		System.out.println("     /  /");
		System.out.println("     \\ /");
		System.out.println("      v");
	}
}
