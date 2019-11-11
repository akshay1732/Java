package com.Java.oops;

public class AbstractionTest extends Abstraction {
	
	
	private double salary;
	
		public static void main(String [] args) 
	
		{
		 AbstractionTest s = new AbstractionTest("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		 Abstraction e = new AbstractionTest("John Adams", "Boston, MA", 2, 2400.00);
	     System.out.println("\nCall mailCheck using Salary reference:");
	     s.mailCheck();
	     System.out.println("\nCall mailCheck using Employee reference:");
	     e.mailCheck();
	   
	    // e.setSalary(5000);
	     System.out.println(s.computePay());
	   
	      
		}
	
		
		
	
//*************************************************************************//
	
		public AbstractionTest(String name, String address, int number,double salary) 
		{
			super(name, address, number);
			setSalary(salary);
		}

	
		public void mailCheck() 
		{
			
			System.out.println("Within mailCheck of Salary class:");
			System.out.println("Mailing check to " +getName()+ " with salary " +salary);
		}
	
	
		public double computePay() 
		{
			System.out.println("\nComputing salary pay for " +getName());
			return salary/52;
			
		}

		 
		public void setSalary(double newSalary) 
		 {
		      if(newSalary >= 0.0) {
		         salary = newSalary;
		      }
		 }
		

}
