import java.text.NumberFormat;

public class Account 
{
	private String acctID;
	private double balance;
	private double interestRate;
	
	public Account()
	{
		
	}
	
	public void setAcctID(String acctID)
	{
		this.acctID = acctID;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public  void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	
	public void accrueInterest()
	{
		balance += (balance * interestRate);
	}
	
	public void printAcctDetails()
	{
		System.out.println("   ID: " + acctID + ", Balance: " + NumberFormat.getCurrencyInstance().format(balance) + ", Rate: " + interestRate);
	}
}