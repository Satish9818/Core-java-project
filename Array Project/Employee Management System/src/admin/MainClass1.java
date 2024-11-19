package admin;

import repository.EmployeeDB;

public class MainClass1 {

	public static void main(String[] args) {
		EmployeeDB edb=new EmployeeDB(3);
		
		Employee e1=EmployeeCreation.create("ram", 35000.00, 1.4);
		Employee e2=EmployeeCreation.create("Shyam", 25000.00, 3.4);
		Employee e3=EmployeeCreation.create("shiva", 15000.00, 2.7);
		Employee e4=EmployeeCreation.create("hari", 55000.00, 4);
		
		
		edb.addEmployee(e1);
		edb.addEmployee(e2);
		edb.addEmployee(e3);
		edb.addEmployee(e4);
		
		edb.viewEmployeeRecords();

		
		Employee e=edb.getEmployee(1001);
		System.out.println(e);
	
	}

}
