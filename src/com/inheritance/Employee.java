package com.inheritance;

public class Employee {
	String name;
	int eid;
	double sal;
	
	Employee(String name,int eid, double sal){
		
	}
	
	void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("EmpId : " + eid);
		System.out.println("Salary : " + sal);
	}

}
