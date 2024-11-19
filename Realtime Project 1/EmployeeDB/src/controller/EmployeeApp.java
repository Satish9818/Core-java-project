package controller;

import java.util.Scanner;

import service.EmployeeService;
import serviceimpl.EmployeeServiceImpl;

public class EmployeeApp {

	public static void main(String[] args) {
		
		EmployeeService e=new EmployeeServiceImpl();
		Scanner ip=new Scanner(System.in);
		System.out.println("=========WELCOME TO EMPLOYEE DATABASE=======");
		while(true)
		{
			System.out.println("==========MENU========");
			System.out.println("1.Add Employee\n2.Display all Employee Details\n3.Search Employee\n"
					+ "4.Find the Salary Range\n5.Get Employee details by salary\n6.Get Employee details by designation"
					+ "\n7.Get Employee by age\n8.Update Employee\n9.Remove Employee\n10.exit");
			System.out.println("Please enter your option");
			
			int op=ip.nextInt();
		
			switch(op) {
			case 1:e.addEmp();break;
			case 2:e.getAllEmp();break;
			case 3:e.getEmpByEid();break;
			case 4:e.findEmpByRangeSal();break;
			case 5:e.getEmpBySal();break;
			case 6:e.findEmpByDesgn();break;
			case 7:e.findEmpByAge();break;
			case 8:e.updateEmpByEid();break;
			case 9:e.removeEmpById();break;
			case 10:System.out.println("=====THANK YOU VISIT AGAIN======");
				   System.exit(0);
			default:System.out.println("======Invalid Option=======");
			}
		}

	

}
}