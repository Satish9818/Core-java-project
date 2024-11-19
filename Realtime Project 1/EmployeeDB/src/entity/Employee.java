package entity;

public class Employee {

	private int eid;
	private String ename;
	private String edesignation;
	private double esal;
	private long ephno;
	private int eage;
	public Employee(int eid, String ename, String edesignation, double esal, long ephno, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesignation = edesignation;
		this.esal = esal;
		this.ephno = ephno;
		this.eage = eage;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public long getEphno() {
		return ephno;
	}
	public void setEphno(long ephno) {
		this.ephno = ephno;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesignation=" + edesignation + ", esal=" + esal
				+ ", ephno=" + ephno + ", eage=" + eage + "]";
	}
}
	
	