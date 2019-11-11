package com.Java.basics;

public class VariableTypes {
	
	// Class variables (Global Variables) 
	//Created with static keyword only created once per class
	static  int var1=0;
	static final int var2=100;
	static final VariableTypes one=new  VariableTypes();
	static VariableTypes two=new  VariableTypes();
	
	//Instance Variables (created every time new object is created)
	int c=0,d=0;  

	public static void main(String[] args) {
		
		//LocaL Variables (Inside Methods and cannot be static) 
		
		int a=0,b=0; 
		a=1;
		b=2;
		
		
		//Calling static variables
		var1=10;
		one.changevalue();
		two.changevalue();
		
		//Calling Instance variables (Requires object creation)
		one.c=3;
		one.d=4;
	
		two.c=11;
		two.d=12;
		
		System.out.printf("%d %d %d %d %d %d %d %d",a,b,var1,var2,one.c,one.d,two.c,two.d);
		int one=0;
		System.out.println("\n"+one);
		

	}
	
	//change static variable value
	public void changevalue() {
		var1=var1+10;
		
	}

}


