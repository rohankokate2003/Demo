package com.inheritance;

public class PartTimeEmp {
	private double hr;
	
	void displayDetails(String name,int eid,double hr) {
		super(name,eid,hr);
		
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("hourly rate : " + hr);
			
		
	}

}
