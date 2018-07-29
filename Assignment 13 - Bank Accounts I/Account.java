import java.text.NumberFormat;

public class Account 
{
	public String acctID;
	public double balance;
	public double interestRate;
	
	public void printAcctDetails()
	{
		System.out.println("   ID: " + acctID + ", Balance: " + NumberFormat.getCurrencyInstance().format(balance) + ", Rate: " + interestRate);
	}
}