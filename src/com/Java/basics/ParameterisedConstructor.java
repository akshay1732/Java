package com.Java.basics;

public class ParameterisedConstructor {
	
	   int x;
	   // Following is the constructor
	   ParameterisedConstructor(int i) 
	   {
	      x = i;
	   }
	
	   //You would call constructor to initialize objects as follows
	  
	   public static void main(String args[])
	   {
		   ParameterisedConstructor t1 = new ParameterisedConstructor( 10 );
		   ParameterisedConstructor t2 = new ParameterisedConstructor( 20 );
	      System.out.println(t1.x + " " + t2.x);
	   }
}

