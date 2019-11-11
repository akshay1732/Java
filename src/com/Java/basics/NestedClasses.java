package com.Java.basics;

public class NestedClasses {
	
	
	
	public static void main(String[] args) {
		
		// Instantiating the outer class 
	      Outer_Demo outer = new Outer_Demo();
	      
	    // Accessing the display_Inner() method.
	      System.out.println(outer.display_Inner());
	      Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
	      int n= inner.print();
	      System.out.println(n);
	}

}


class Outer_Demo {
   int num;
   
   // private variable of the outer class
   private int num2 = 175;  
   
   // inner class
   	public class Inner_Demo 
   	{
   		public int print() 
   		{
   			System.out.println("This is an Nested class");
   			return num2;
   		}
   	}
   
   
   
   
   // Accessing the inner class from the method within
   
   	int display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      int b=inner.print();
      return b;
      
   	}
}