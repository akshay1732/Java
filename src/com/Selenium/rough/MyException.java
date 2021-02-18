package com.Selenium.rough;

@SuppressWarnings("serial")
public class MyException extends Exception{
	
	MyException(String s){
		
		super(s);
		
	}
	
	void check() throws MyException {
		
		System.out.println("Check");
		
		
	}

	public static void main(String[] args) {
		
		MyException m = new MyException("Akshay");
		try {
			m.check();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
