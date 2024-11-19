package transactions;
import accounts.*;

public class ViewAccountBalance {

	public void viewBalance(Account acc1)
	{
		System.out.println("showing the balance");
		System.out.println("The total balance is "+acc1.getBalance());
	}
}
