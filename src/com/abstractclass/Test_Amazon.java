package com.abstractclass;

public class Test_Amazon {
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.loginCheck("Rohan",123);
		a.addCart("Save to Cart");
		System.out.println(a.payment());
	}

}
