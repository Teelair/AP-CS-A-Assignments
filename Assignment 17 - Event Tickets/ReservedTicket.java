public class ReservedTicket extends Ticket
{
	private boolean isPlayoffGame;
	public ReservedTicket(boolean isPlayoffGame) 
	{
		super(isPlayoffGame);
		this.isPlayoffGame = isPlayoffGame;
	}

	public double getPrice()
	{
		return ((super.getPrice() + (isPlayoffGame ? 3 : 0)) * .75);
	}
	
	public String getType()
	{
		return "Reserved";
	}
}
