public class StudentTicket extends Ticket
{
	private boolean isPlayoffGame;
	public StudentTicket(boolean isPlayoffGame) 
	{
		super(isPlayoffGame);
		this.isPlayoffGame = isPlayoffGame;
	}
	
	public double getPrice()
	{
		return ((super.getPrice() + (isPlayoffGame ? 3 : 0)) * .5625);
	}
	
	public String getType()
	{
		return "Student Reserved";
	}
}
