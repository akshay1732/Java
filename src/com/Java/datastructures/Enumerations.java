package com.Java.datastructures;
import java.util.Vector;
import java.util.Enumeration;


public class Enumerations {




	   public static void main(String args[]) {
	      Enumeration<String> days;
	      Vector<String> dayNames = new Vector<String>();
	      
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      days = dayNames.elements();
	      
	      while (days.hasMoreElements()) {
	         System.out.println(days.nextElement()); 
	      }
	      
		/*
		 * for(String a:dayNames) { System.out.println(a); }
		 */
	   }
	   
	   
	/*boolean hasMoreElements( )
	 * 
	 * When implemented, it must return true while there are still more elements to
	 * extract, and false when all the elements have been enumerated.
	 */
	   
	   
		
	/* Object nextElement( )
	 * 
	 * This returns the next object in the enumeration as a generic Object
	 * reference.
	 */

}