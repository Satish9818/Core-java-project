package app;
import accounts.*;
import transactions.*;

public class MainClass {

	public static void main(String[] args) {
		AccountCreation ac1=new AccountCreation();
		Account a1=ac1.createAccount(981863612,"Satish Pokharel","Satish123",25000.00);
		
		AccountCreation ac2=new AccountCreation();
		Account a2=ac2.createAccount(736594912,"Prateek dawande","Pratik@123",20000.00);
		
		DepositTransaction d1=new DepositTransaction();
		FundTransfer f1=new FundTransfer();
		ViewAccountBalance v1=new ViewAccountBalance();
		WithdrawTransaction w1=new WithdrawTransaction();
		
		v1.viewBalance(a1);
		
		d1.deposit(a1,100000.00);
		
		w1.withdraw(a1, 5000.00);
		
		f1.transfer(a1, a2, 5000.00);
		
		v1.viewBalance(a1);
		
		v1.viewBalance(a2);
		
		
		
		
		
		
		
		
	}

}
