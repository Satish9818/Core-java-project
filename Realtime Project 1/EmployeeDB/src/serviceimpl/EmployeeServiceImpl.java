package serviceimpl;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import service.EmployeeService;
public class EmployeeServiceImpl implements EmployeeService {
	Scanner ip=new Scanner(System.in);
	
	ArrayList<Employee> l1=new ArrayList<Employee>();
	public void addEmp() {
		System.out.println("Enter Employee Details");
		System.out.println("Enter Employee id: ");
		int eid=ip.nextInt();
		System.out.println("Enter Employee Name: ");
		ip.nextLine();
		String ename=ip.nextLine();
		System.out.println("Enter Employee Designation: ");
		String edesignation=ip.nextLine();
		System.out.println("Enter Employee Salary: ");
		double esal=ip.nextDouble();
		System.out.println("Enter Employee Phoneno: ");
		long ephno=ip.nextLong();
		System.out.println("Enter Employee Age: ");
		int eage=ip.nextInt();
		
		l1.add(new Employee(eid,ename,edesignation,esal,ephno,eage));
		System.out.println("Employee Added Successfully.....");
	}
	@Override
	public void getAllEmp() {
		System.out.println("Searching.........!!!!!!");
		System.out.println("=====Employee Details========");
		if(l1.size()==0) {//l1.isEmpty()
			System.out.println("IDIOT THERE ARE NO EMPLOYEES......... ");
		}
		else
		{
			for(Employee emp:l1)
			{
				System.out.println(emp);
			}
		}
		
	}
	
	public void getEmpByEid()
	{
		System.out.println("=========Searching employee==========");
		System.out.println("Enter Employee id: ");
		int sid=ip.nextInt();
		boolean flag=false;
		for(Employee ele:l1) {
			if(ele.getEid()==sid)
			{
				System.out.println("Employee found");
				System.out.println(ele);
				flag=true;
				break;
			}
			
		}
		 if(flag==false)
			{
				System.out.println("Employee not found");
			}
		
		
		
		
	}
	@Override
	public void findEmpByRangeSal() {
		
		System.out.println("Finding Employee Salary In the given Range");
		System.out.println("Enter the First Salary Range");
		double findsal1=ip.nextDouble();
		System.out.println("Enter the Second Salary Range ");
		double findsal2=ip.nextDouble();
		boolean flag=false;
		
		for(Employee ele:l1)
		{
			if(ele.getEsal()>=findsal1 && ele.getEsal()<=findsal2)
			{
				System.out.println("Range Found.........");
				System.out.println(ele);
				flag=true;
				
			}
		}
		if(flag==false) {
		System.out.println("No Employee Found.............");
		}
		
		
	}
	@Override
	public void updateEmpByEid() {
		// TODO Auto-generated method stub
		System.out.println("----------------Update Employee---------------------");
		System.out.println("Enter Employee ID");
		int eid1 = ip.nextInt();
		boolean p=false;   //Employee e=null
		for (Employee ele : l1) {
			if (ele.getEid() == eid1) {
				System.out.println("Employee Id Match");
				System.out.println(ele);
				p=true;  //e=ele
				break;
			}
		}
		if(p) {//if(e!=null)
			System.out.println("====================Options========================");
			System.out.println("1. Update Name\n2. Update Designation\n3. Update Salary\n4. Update Phone Number\n5. Update Age");
			int uo = ip.nextInt();
			switch (uo) {
			case 1:
				System.out.println("Enter New Name: ");
				ip.nextLine();
				String newName = ip.nextLine();
				for (Employee ele : l1) {
					if (ele.getEid() == eid1) {
						ele.setEname(newName);
					}
				}
				System.out.println("Update Successfull :)");
				break;
			case 2:
				System.out.println("Enter New Designation: ");
				ip.nextLine();
				String newdesig = ip.next();
				for (Employee ele : l1) {
					if (ele.getEid() == eid1) {
						ele.setEdesignation(newdesig);
					}
				}
				System.out.println("Update Successfull :)");
				break;
			case 3:
				System.out.println("Enter New Salary: ");
				double newSal = ip.nextDouble();
				for (Employee ele : l1) {
					if (ele.getEid() == eid1) {
						ele.setEsal(newSal);
					}
				}
				System.out.println("Update Successfull :)");
				break;
			case 4:
				System.out.println("Enter New Phone Number: ");
				long newPhno = ip.nextLong();
				for (Employee ele : l1) {
					if (ele.getEid() == eid1) {
						ele.setEphno(newPhno);
					}
				}
				System.out.println("Update Successfull :)");
				break;
			case 5:
				System.out.println("Enter New Designamtion: ");
				int newAge = ip.nextInt();
				for (Employee ele : l1) {
					if (ele.getEid() == eid1) {
						ele.setEage(newAge);
					}
				}
				System.out.println("Update Successfull :)");
				break;
			default:
				System.out.println("Invalid Option :(");
			}	
		}else {
			System.out.println("Employee ID Not Found :(");
		}
		
		
		
		

	}

	@Override
	public void getEmpBySal() {
		System.out.println("-------------------Employee Details By Salary------------------------");
		System.out.println("Enter Salary: ");
		double sal=ip.nextDouble();
		boolean p=false;
		for(Employee ele:l1) {
			if(ele.getEsal()==sal) {
				System.out.println("Employee Salary Match Found :)");
				System.out.println(ele);
				p=true;

			}
		}
		if(p==false) {
			System.out.println("Employee Salary Match Not Found :(");
		}
		
	}

	@Override
	public void findEmpByDesgn() {
		System.out.println("-------------------Employee Details By Designation------------------------");
		System.out.println("Enter Employee Designation: ");
		
		String desig=ip.next();
		boolean p=false;
		for(Employee ele:l1) {
			if(ele.getEdesignation().equalsIgnoreCase(desig)) {
				System.out.println("Employee Designation Match Found :)");
				System.out.println(ele);
				p=true;
				
			}
		}
		if(p==false) {
			System.out.println("Employee Designation Match Not Found :(");
		}
		
	}

	@Override
	public void findEmpByAge() {
		System.out.println("-------------------Employee Details By Age------------------------");
		System.out.println("Enter Employee Age: ");
		
		int age=ip.nextInt();
		boolean p=false;
		for(Employee ele:l1) {
			if(ele.getEage()==age) {
				System.out.println("Employee Age Match Found :)");
				System.out.println(ele);
				p=true;
				break;
			}
		}
		if(p==false) {
			System.out.println("Employee Age Match Not Found :(");
		}
		
	}
	
	
	public void removeEmpById()
	{
		System.out.println("============MENU TO REMOVE EMPLOYEE=================");
		System.out.println("Enter the Employee ID");
		int empid=ip.nextInt();
		boolean flag=false;
//		
//		for(Employee ele:l1)
//		{
//			if(ele.getEid()==empid)
//			{
//				System.out.println("Employee ID matched");
//				
//					l1.remove(ele);
//					System.out.println("Employee Removed Successfully....");
//					break;
//					
//			}
//	}
		
		for(int i=0;i<l1.size();i++)
		{
			if(empid==l1.get(i).getEid())
			{
				System.out.println("Employee Found");
				System.out.println("Removing Employee Details");
				l1.remove(i);
				System.out.println("Employee Removed........");
				flag=true;
				break;
				
			}
		}
		if(flag==false)
		{
			System.out.println("Employee Not Found....");
		}

	}
	
	
	}
