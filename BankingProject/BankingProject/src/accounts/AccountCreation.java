package accounts;

public class AccountCreation {
	//creating class in account package
	//purpose:responsible to create an account object and return it

	public Account createAccount(long account_no,String username,String password,double balance)
	{
		Account a1=new Account(account_no,username,password,balance);
		return a1;
	}
}
