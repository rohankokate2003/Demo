package com.abstractclass;

public abstract class AmAbs implements AmI{
	abstract void getPrice();
	
	@Override
	public String payment() {
		return "payment successful";
		
	}

	public boolean loginCheck(String un, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

}
