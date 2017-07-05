package com.meghana;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
	Person p1 = new Person("meghana","kagita","20","10,000");
	Person p2 = new Person("Anudeep","Annavarapu","25","15,000");
	Person p3 = new Person("anusha","badisha","20","10,000");
	Person p4 = new Person("swetha","gupta","20","10,000");
	
	List<Person> listAll=new ArrayList<Person>();
	listAll.add(p1);
	listAll.add(p2);
	listAll.add(p3);
	listAll.add(p4);
	
 System.out.println("Before Sorting with LastName:::");
PrintAll(listAll);	
Collections.sort(listAll,(o1,o2)-> o1.getLastName().compareTo(o2.getLastName()));
System.out.println("After Sorting with LastName:::");
PrintAll(listAll);
System.out.println("Before Sorting with FirstName:::");
PrintAll(listAll);	
Collections.sort(listAll,(o1,o2)-> o1.getFirstName().compareTo(o2.getFirstName()));
System.out.println("After Sorting with FirstName:::");
PrintAll(listAll);	
System.out.println("Before Sorting with Age:::");
PrintAll(listAll);	
Collections.sort(listAll,(o1,o2)-> o1.getAge().compareTo(o2.getAge()));
System.out.println("After Sorting with Age:::");
PrintAll(listAll);	
System.out.println("Before Sorting with Salary:::");
PrintAll(listAll);	
Collections.sort(listAll,(o1,o2)-> o1.getSalary().compareTo(o2.getSalary()));
System.out.println("After Sorting with Salary:::");
PrintAll(listAll);	

	}

	private static void PrintAll(List<Person> listAll) {
		for(Person person:listAll)
		{
			System.out.println(person);
		}
	}


}
