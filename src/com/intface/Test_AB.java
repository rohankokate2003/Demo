package com.intface;

public class Test_AB {
	public static void main(String[] args) {
		
		B b1=new B();
		System.out.println(b1.m3());
		System.out.println(b1.m2());
		
		A obji=new B();
		
		A.SkippEMI();
		
		b1.m4();
		
		
	}

}
