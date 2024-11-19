package admin;

public class Employee {

	private final int id;
	private String name;
	private double salary;
	private double exp;
	
	
	
	public Employee(int id, String name, double salary, double exp) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exp = exp;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public int getId() {
		return id;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", exp=" + exp + "]";
	}
	
}
