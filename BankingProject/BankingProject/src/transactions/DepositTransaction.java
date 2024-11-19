package transactions;
//importing the package accounts to get access in transaction package
	import accounts.*;

public class DepositTransaction {

	//depositing class to deposit the amount
		public void deposit(Account acc1,double depositamount)
		{
			System.out.println("Successful transaction running........................");
			acc1.setBalance(acc1.getBalance()+depositamount);
			
			
		
			System.out.println("Deposit Successful............................");
			
			}
			
		
	}

