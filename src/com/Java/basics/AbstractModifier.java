package com.Java.basics;

public abstract class AbstractModifier {

	/* ***Abstract class***
	 * Abstract class is class that cannot be Initialized (Cannot create object of abstract class)
	 *
	 * If a class is declared as abstract then the sole purpose is for the class to be extended.
	 * 
	 * If a class contains one or more abstract methods it must be declared abstract.
	
	 */
	public static int a=100;
	protected static double price;
	private String model;
		   
	/* ***Abstract Method***
	An abstract method is a method declared without any implementation. 
	The methods body (implementation) is provided by the subclass. 
	Abstract methods can never be final or strict.

	Any Subclass must implement all the abstract methods of the super class, 
	unless the subclass is also an abstract class.
	
	If a class contains one or more abstract methods, 
	then the class must be declared abstract. 
	
	An abstract class does not need to contain abstract methods.	    	    
	 */
	public String passmodel() {
		return model;
	}	   
	public abstract void goFast();   
	public abstract void changeColor();
		
	

}

class subclass extends AbstractModifier{
	
public static void main(String[] args) {
		
		System.out.println("Abstract Class");
		a=500;
		price=0.01;
		
}
	
	public void goFast(){
		System.out.println("Abstract Method in Subclass");
	}
	
	public void changeColor(){
		System.out.println("Abstract Method in Subclass");
		
	}
}
