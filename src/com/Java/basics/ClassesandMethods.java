package com.Java.basics;

public class ClassesandMethods {

	static ClassesandMethods one=new ClassesandMethods(); // Class variables with static keyword 
															//only created once 
	
	int c=0,d=0;  //Instance Variables (created everytime new object is created)
	
	public static void main(String[] args) {
		
		int a=0,b=0; //LocaL Variables
		a=1;
		b=2;
		//Calling Instance variables
		one.c=3;
		one.d=4;
		
	
		
		System.out.println("MainMethod");
		System.out.printf("%d%d%d%d",a,b,one.c,one.d);
		
		
		one.method2();
		one.method3();

	}

	
	void method2() {
		
		
		
		
		System.out.println("\nMethod2"); 
	}
	
void method3() {
		
		System.out.println("\nMethod3"); 
	}
	
}
