public class Main 
{
	public static void main(String[] args)
	{
		Account firstAcc = new Account();
		Account secondAcc = new Account();
		Account thirdAcc = new Account();
		
		firstAcc.acctID = "T001";
		secondAcc.acctID = "T002";
		thirdAcc.acctID = "T003";
		
		firstAcc.balance = 1000;
		secondAcc.balance = 1000;
		thirdAcc.balance = 1000;
		
		firstAcc.interestRate = 0.03;
		secondAcc.interestRate = 0.04;
		thirdAcc.interestRate = 0.05;
		
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Year " + i + ":");
			firstAcc.printAcctDetails();
			secondAcc.printAcctDetails();
			thirdAcc.printAcctDetails();
			
			firstAcc.balance += (firstAcc.balance * firstAcc.interestRate);
			secondAcc.balance += (secondAcc.balance * secondAcc.interestRate);
			thirdAcc.balance += (thirdAcc.balance * thirdAcc.interestRate);
		}
	}
}
