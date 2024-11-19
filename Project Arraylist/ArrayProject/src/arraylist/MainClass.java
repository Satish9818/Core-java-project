package arraylist;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Employee> l1=new ArrayList<Employee>();
		
		l1.add(new Employee(123,"Darshan",25000.00,"Programming trainer",283628221));
		l1.add(new Employee(122,"Sharath",35000.00,"SQL Trainer",212338221));
		l1.add(new Employee(121,"Keshava",55000.00,"CEO",123456789));
		l1.add(new Employee(120,"Nagabhishek",30000.00,"Java trainer",235590642));
		l1.add(new Employee(119,"faizan",10000.00,"Java trainer",235591231));
		
		double max=l1.get(0).getE_sal();
		
		for(Employee element:l1)
		{
			if(max<element.getE_sal())
			{
				max=element.getE_sal();
			}
		}
		
		for(Employee element:l1)
		{
			if(max==element.getE_sal())
			{
				System.out.println(element);
			}
		}
	}

}
