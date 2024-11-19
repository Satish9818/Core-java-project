package admin;

public class EmployeeCreation {

	private static int initId=1001;
	public static Employee create(String name,double salary,double exp)
	{
		return new Employee(initId++, name, salary, exp);
	}
}
//Single Task/responsibility