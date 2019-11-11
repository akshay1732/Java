package com.Java.basics;

public class ConditionalStatements {
	
	//Conditional If Else statement
	
	/*
	 * if(Boolean_expression) { 
	 * Executes when the Boolean expression is true
	 * }else { 
	 *  Executes when the Boolean expression is false }
	 */
	
	public static void main(String args[]) {
	int x = 30;
		if( x < 20 ) 
		{
			System.out.print("This is if statement");
		}
		else
		{
			System.out.println("This is else statement");
		}
		
		
		
		//Switch Case statement
		
		
		switch( x ) {
		   case 10 :
		      System.out.println("x=10");
		      break; // optional
		   
		   case 20 :
		      System.out.println("x=20");
		      break; 
		   
		      
		   // You can have any number of case statements.
		   default : 
			   System.out.println("x=30");
		}
			
		
		String abc=(x==30)? "True":"False";
		System.out.println(abc);

	}

}
