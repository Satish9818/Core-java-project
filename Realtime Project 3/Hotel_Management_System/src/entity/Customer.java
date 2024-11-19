package entity;

public class Customer {

	private long cid;
	private String cname;
	private long cphno;
	private String cemail;
	private Address caddress;
	private double camt;
	private int cage;

	public Customer(long cid, int age, String cname, long cphno, String cemail, Address caddress) {
		this.cid = cid;
		this.cname = cname;
		this.cphno = cphno;
		this.cemail = cemail;
		this.caddress = caddress;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getCphno() {
		return cphno;
	}

	public void setCphno(long cphno) {
		this.cphno = cphno;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public Address getCaddress() {
		return caddress;
	}

	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}

	public double getCamt() {
		return camt;
	}

	public void setCamt(double camt) {
		this.camt = camt;
	}

	public int getCage() {
		return cage;
	}

	public void setCage(int cage) {
		this.cage = cage;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cphno=" + cphno + ", cemail=" + cemail + ", caddress="
				+ caddress + "cage" + cage + " camount"+ camt+"]";
	}

}
