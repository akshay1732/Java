package com.Java.basics;

public class NonAccessModifiers {
	
	
	/*
	Java provides a number of non-access modifiers to achieve many other functionalities.

	The static modifier for creating class methods and variables.
	The final modifier for finalizing the implementations of classes, methods, and variables.
	The abstract modifier for creating abstract classes and methods.
	The synchronized and volatile modifiers, which are used for threads.
	
	 */

	
	/* Static Modifier - static variables/methods can be accessed by all methods and are only 
	  initialized once. They do need a object of the class.
	
	*/
	
	
	private static int numInstances = 0;
	
	protected static int getCount()
		{
		return numInstances;
		}

	private static void addInstance() 
		{
		    numInstances++;
		}

	public static void main(String[] arguments) {
		  System.out.println("Starting with " + getCount() + " instances");

		    for (int i = 0; i < 500; ++i) {
		    	  addInstance();
		     }
		     System.out.println("Created " + getCount() + " instances");

	}
		   
		   
	//Final Modifier
		   //Final Class connot be extended
		   
		 final int value = 10; 
		 static final String TITLE = "Manager";
		 public static final int BOXWIDTH = 6;
		 
		 //final methods cannot be overridden or modified in subclasses
		 
		  public final void changeName() {
		      // body of method
		   }
		
	   
		   
}






