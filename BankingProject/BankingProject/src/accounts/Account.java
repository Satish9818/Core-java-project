package accounts;
//writing java bean class structure
public class Account {
	//member variable must be private in here
	private long account_no;
	private String username;
	private String password;
	private double balance;
	//creating a public constructor
	public Account(long account_no, String username, String password, double balance) {
		super();
		this.account_no = account_no;
		this.username = username;
		this.password = password;
		this.balance = balance;
	}
	//writing the public getter method to view the private member variable
	//and using setter method to set the value to private member variable
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	

}
