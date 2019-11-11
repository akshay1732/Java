package com.Java.basics;

public class Enums {
	
	
	/* ENUMS
	 * Enums restrict a variable to have one of only a few predefined values. 
	 * The values in this enumerated list are called enums.
	 */
	
	static enum juicesize{Small,large,Medium}
	static juicesize size1;
	  juicesize size2;

	public static void main(String[] args) {
		
		
		size1=juicesize.Medium;
		System.out.println(size1);
		
		Enums new1=new Enums();
		new1.glass();
			
		
		
	}
	
	public void glass() {
	
		
		size2=juicesize.Small;
		System.out.println(size2);
		System.out.println("Method2");
					
		}
	
	
	
	}


