package com.abstractclass;

public interface AmI {
	public boolean loginCheck(String un,String pwd);
	abstract String addCart(String object);
	String payment();

}
