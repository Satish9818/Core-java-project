package transactions;
import accounts.*;
public class FundTransfer {

	public boolean transfer(Account froacc,Account toacc,double transferamount)
	{
		if(transferamount<froacc.getBalance())
		{
			System.out.println("successful fundtransfer.............");
			froacc.setBalance(froacc.getBalance()-transferamount);
			toacc.setBalance(toacc.getBalance()+transferamount);
			return true;
		}
		else
		{
			System.out.println("failed transfer");
			return false;
		}
	}
}
