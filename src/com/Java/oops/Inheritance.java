package com.Java.oops;

public class Inheritance {

	
	  int z,age,num=10;
		
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:"+z);
	   }
		
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	   }
	
	   
	   // display method of superclass
	   public void display() {
	      System.out.println("This is the display method of superclass");
	   }
	   
	   
	   Inheritance(int age) {
		      this.age = age; 		 
		   }
	   
	   public void getAge() 
		 {
		   System.out.println("The value of the variable named age in super class is: " +age);
		 }
}
