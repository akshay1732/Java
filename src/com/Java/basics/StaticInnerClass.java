package com.Java.basics;

public class StaticInnerClass {

	
 static class Nested_Demo 
	{
		public void my_method() 
		{
			   System.out.println("This is my nested class");
		}
	}
			   
	
	
	
	public static void main(String args[]) {
		StaticInnerClass.Nested_Demo nested = new StaticInnerClass.Nested_Demo();
		
		nested.my_method();
	}
	


}

	


