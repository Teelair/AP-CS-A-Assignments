import java.text.NumberFormat;

public class Main 
{
	public static int lastTicketNumber = 0;
	
	public static void main(String[] args)
	{
		Ticket[] regularSeasonTickets = generateTickets(false);
		System.out.println("Regular Season: \n");
		for(Ticket t : regularSeasonTickets)
		{
			generateTicketInfo(t);
		}

		Ticket[] playoffTickets = generateTickets(true);
		System.out.println("Playoffs: \n");
		for(Ticket t : playoffTickets)
		{
			generateTicketInfo(t);
		}
	}
	
	public static Ticket[] generateTickets(boolean playoffs)
	{
		Ticket[] tickets = new Ticket[3];
		tickets[0] = new WalkupTicket(playoffs);
		tickets[1] = new ReservedTicket(playoffs);
		tickets[2] = new StudentTicket(playoffs);
		return tickets;
	}
	
	public static void generateTicketInfo(Ticket ticket)
	{
		System.out.println("Ticket type: " + ticket.getType());
		System.out.println("Ticket number: " + ticket.getTicketNumber());
		System.out.println("Price: " + NumberFormat.getCurrencyInstance().format(ticket.getPrice()) + (ticket.getType().equalsIgnoreCase("Student Reserved") ? " (ID Required)" : "") + "\n");
	}
}
