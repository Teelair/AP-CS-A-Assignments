public class Main 
{
	public static void main(String[] args)
	{
		Account firstAcc = new Account();
		firstAcc.setAcctID("T001");
		firstAcc.setBalance(1000);
		firstAcc.setInterestRate(0.03);
		
		Account secondAcc = new Account();
		secondAcc.setAcctID("T002");
		secondAcc.setBalance(1000);
		secondAcc.setInterestRate(0.04);
		
		Account thirdAcc = new Account();
		thirdAcc.setAcctID("T003");
		thirdAcc.setBalance(1000);
		thirdAcc.setInterestRate(0.05);
		
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Year " + i + ":");
			firstAcc.printAcctDetails();
			secondAcc.printAcctDetails();
			thirdAcc.printAcctDetails();
			
			firstAcc.accrueInterest();
			secondAcc.accrueInterest();
			thirdAcc.accrueInterest();
		}
	}
}
