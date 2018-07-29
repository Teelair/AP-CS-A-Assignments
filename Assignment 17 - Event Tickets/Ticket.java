public abstract class Ticket 
{
	private static double basePrice = 7.00;
	private int ticketNumber;
	private boolean isPlayoffGame;
	
	public Ticket(boolean isPlayoffGame)
	{
		ticketNumber = Main.lastTicketNumber + 1;
		this.isPlayoffGame = isPlayoffGame;
		Main.lastTicketNumber = ticketNumber;
	}
	
	public double getPrice()
	{
		return basePrice;
	}
	
	public int getTicketNumber()
	{
		return ticketNumber;
	}

	public String getType()
	{
		return "Generic";
	}
	
	public boolean isPlayoffGame()
	{
		return isPlayoffGame;
	}
}
