package repository;

import admin.Employee;

public class EmployeeDB {

	
	private Employee[] empdb;
	private int index=0;
	
	public EmployeeDB(int size)
	{
		empdb=new Employee[size];
	}
	
	public void addEmployee(Employee e)
	{
		if(index<empdb.length)
		{
		empdb[index++] = e;
		System.out.println("employee added succesfully");
		}
		else
		{
			System.out.println("Database is full,cannot add employee");
		}
	}
	
	public void viewEmployeeRecords()
	{
		for(Employee e: empdb)
		{
			if(e!=null)
			{
				System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getExp());
			}
		}
	}
	
	public Employee getEmployee(int id)
	{
		Employee emp=null;
				for(Employee e : empdb)
				{
					if(e!=null && e.getId()==id)
					{
						emp =e;
						System.out.println("employee found in db");
						break;
					}
				}
				return emp;
	}
}
