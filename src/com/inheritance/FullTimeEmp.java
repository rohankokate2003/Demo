package com.inheritance;

public class FullTimeEmp extends Employee {
	
	
	private double sal;
	public FullTimeEmp(String name,int eid,double hr) {
		super(name,eid, hr);
	}
	
	void displayDetails(double salary) {
		super.displayDetails();
		System.out.println("sal :" + sal);
		
	}

}
