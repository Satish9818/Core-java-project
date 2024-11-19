package arraylist;

public class Employee {

	private int e_id;
	private String e_name;
	private double e_sal;
	private String e_designation;
	private long e_phoneno;
	
	
	public Employee(int e_id, String e_name, double e_sal, String e_designation, long e_phoneno) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_sal = e_sal;
		this.e_designation = e_designation;
		this.e_phoneno = e_phoneno;
	}


	public int getE_id() {
		return e_id;
	}


	public void setE_id(int e_id) {
		this.e_id = e_id;
	}


	public String getE_name() {
		return e_name;
	}


	public void setE_name(String e_name) {
		this.e_name = e_name;
	}


	public double getE_sal() {
		return e_sal;
	}


	public void setE_sal(double e_sal) {
		this.e_sal = e_sal;
	}


	public String getE_designation() {
		return e_designation;
	}


	public void setE_designation(String e_designation) {
		this.e_designation = e_designation;
	}


	public long getE_phoneno() {
		return e_phoneno;
	}


	public void setE_phoneno(long e_phoneno) {
		this.e_phoneno = e_phoneno;
	}


	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_sal=" + e_sal + ", e_designation=" + e_designation
				+ ", e_phoneno=" + e_phoneno + "]";
	}
	
	
	}
	
	
