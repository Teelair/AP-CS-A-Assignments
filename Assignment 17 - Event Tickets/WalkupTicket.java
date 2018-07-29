public class WalkupTicket extends Ticket
{
	private boolean isPlayoffGame;
	public WalkupTicket(boolean isPlayoffGame) 
	{
		super(isPlayoffGame);
		this.isPlayoffGame = isPlayoffGame;
	}
	
	public double getPrice()
	{
		return super.getPrice() + (isPlayoffGame ? 3 : 0);
	}
	
	public String getType()
	{
		return "Walkup";
	}
}
