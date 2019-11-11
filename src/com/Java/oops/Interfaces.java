package com.Java.oops;

public class Interfaces implements InterfaceBase 
{

	 public static void main(String args[]) 
	 {
		   Interfaces m = new Interfaces();
	      m.eat();
	      m.travel();
	 }
	
	 
	 
	 
	 
	public void eat() 
	{
		      System.out.println("Mammal eats");
	}

	public void travel() 
	{
		      System.out.println("Mammal travels");
	} 

	public int noOfLegs() 
	{
		  return 0;
	}

		  
} 