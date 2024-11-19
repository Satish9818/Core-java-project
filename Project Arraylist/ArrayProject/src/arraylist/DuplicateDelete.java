package arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicateDelete {

	public static void main(String[] args) {
		
	
	ArrayList<Integer> l1=new ArrayList<Integer>();
	
	
	l1.add(10);
	l1.add(100);
	l1.add(20);
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(50);
	l1.add(40);
	l1.add(30);
	l1.add(14);
	l1.add(15);
	l1.add(16);
	l1.add(14);
	
	LinkedHashSet<Integer> s1=new LinkedHashSet<Integer>();
	
	System.out.println(l1);
	
}
}