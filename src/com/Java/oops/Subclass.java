package com.Java.oops;

public class Subclass extends Inheritance {
	
	int num=20;

	public static void main(String[] args) {
		
		
		 int a = 20, b = 10;
		 Subclass subdemo = new Subclass(24);
		 
		 //using the object of the subclass you can access the members of a superclass.
		 
		 
	      subdemo.addition(a, b);
	      subdemo.Subtraction(a, b);
	      subdemo.multiplication(a, b);
		
		/* note-using the object of the superclass you can only access the members of a
		 * superclass. 
		 */
		
	     //calls display method of subclass 
	      subdemo.display();
	      System.out.println("Value of the variable named num in sub class:"+ subdemo.num);
	      
	      
	    //cannot use 'super' in static method so create instance of superclass  
	      Inheritance superdemo = new Inheritance(20);
	      System.out.println("");
	      superdemo.display();
	      
	     //calling same variable using subclass and superclass objects
	      subdemo.getAge();
	      superdemo.getAge();
	      
	      
	    //Instance of Keyword
	      System.out.println("");
	     System.out.println(subdemo instanceof Inheritance); 
		
	}
	
	
////***************************Methods**************************************//
	
	public void display()
	{
	      System.out.println("\nThis is the display method of subclass");
	      
	      //***********  The super keyword*********************//
	      //calls display method of superclass
	      super.display();
	      System.out.println("\nvalue of the variable named num in super class:"+ super.num);
	 }
	
//**************************************************************************//
	 public void multiplication(int x, int y) 
	 {
	      z = x * y;
	      System.out.println("The product of the given numbers:"+z); 
	  }
	 
//**************************************************************************//	 
	 //subclass Constructor
	 Subclass(int age) 
	 {
		//calling superclass constructor from subclass
	      super(age);
	   }
	 
	 
//***************************************************************************//
	 public void getAge() 
	 {
	   System.out.println("\nThe value of the variable named age in super class is: " +age);
	 }
	
//***************************************************************************//	
	 
	
	 
	 
	 
	 
	
}
