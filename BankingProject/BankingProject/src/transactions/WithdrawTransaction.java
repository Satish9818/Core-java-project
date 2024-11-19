package transactions;
//importing the package accounts to get access in transaction package
import accounts.*;

public class WithdrawTransaction {
//withdrawing class to withdraw the amount
	public boolean withdraw(Account acc1,double withdrawamount)
	{
		
		
		if(withdrawamount<acc1.getBalance())
		{
			System.out.println("Successful transaction running........................");
			acc1.setBalance(acc1.getBalance()-withdrawamount);
			System.out.println("Withdraw Successful............................");
			return true;
		}
		else
		{
			System.out.println("withdraw failed.......insufficient balance");
			return false;
		}
	}
}
