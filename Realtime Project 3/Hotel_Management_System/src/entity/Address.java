package entity;

public class Address {

	private int h_No;
	private String street;
	private long pincode;
	private String dst;
	private String state;

	public Address(int h_No, String street, long pincode, String dst, String state) {
		super();
		this.h_No = h_No;
		this.street = street;
		this.pincode = pincode;
		this.dst = dst;
		this.state = state;
	}

	public int getH_No() {
		return h_No;
	}

	public void setH_No(int h_No) {
		this.h_No = h_No;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getDst() {
		return dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [h_No=" + h_No + ", street=" + street + ", pincode=" + pincode + ", dst=" + dst + ", state="
				+ state + "]";
	}

}
