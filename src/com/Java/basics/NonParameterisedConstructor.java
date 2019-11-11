package com.Java.basics;

public class NonParameterisedConstructor {

		   int num=0;
		   
		   NonParameterisedConstructor() 
		   {  
		      num = 100;
		   }
		
	//	You would call constructor to initialize objects as follows

		
		   public static void main(String args[]) {
			   
			   NonParameterisedConstructor t1 = new NonParameterisedConstructor();
			   NonParameterisedConstructor t2 = new NonParameterisedConstructor();
		      System.out.println(t1.num + " " + t2.num);
		   }


}