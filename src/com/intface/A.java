package com.intface;

public interface A {
	public static final int a=1;
	static final int b=2;
	final int c=3;
	int d=4;
	
	public abstract int m1();
	
	abstract String m2();
	
    int m3();
    
    public static void SkippEMI() {
    	System.out.println("NO EMI for 3 months");
    }
    
    public default void m4() {
    	System.out.println(222);
    }

}
