package com.abstractclass;

public class Amazon extends AmAbs{
	void getPrice() {
		
	}
	
	@Override
	public boolean loginCheck(String un,String pwd) {
	return true;
	}
	
	@Override
	public String addCart(String str) {
		return str;
	}

	public void loginCheck("Rohan",123) {
		// TODO Auto-generated method stub
		
	}
	

}
