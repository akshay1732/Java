package com.Java.basics;


interface Message {
	   String greet();
				}




public class AnonymousInnerClassArgument {

		   // method which accepts the object of interface Message
		   public static void displayMessage(Message m) {
			   System.out.println(m.greet());
			   System.out.println("This is an example of anonymous inner class as an argument");  
		   }

		  
		   public static void main(String args[]) 
		   {
		      

		      // Passing an anonymous inner class as an argument
		      displayMessage(new Message() 
		      {	public String greet() 
		    	  {
		            return "Hello";
		    	  }
		      });
		   
		   
		   
		   }//Main Method Ends
		   
		   
}//AnonymousInnerClassArgument Ends


