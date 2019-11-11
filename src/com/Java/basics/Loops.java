package com.Java.basics;

public class Loops {
	static int x=0;
	
	
	
	public static void main(String[] args) {
		
		//While Loop

		while(x<=4) {
			System.out.println("This is while loop");
			x++;
		}
		
		
		
		//For Loop
		
		for (x=0;x<=4;x++) {
			System.out.println("This is For loop");
		}
		
		
		//Do while Loop
		x=0;
		do {
			
			System.out.println("This is do while loop");
			x++;
			}
		while(x<=4);
		
		
		//Break statement - stops the loop
		//Continue statement - skips to next iteration
		
		int [] numbers = {10, 20, 30, 40, 50};

		for(int x : numbers )
		{
			if(x==20) 
			{
			  continue;  
			}
			if(x==40)
			{
		        break;
			}
		   System.out.println(x);
		}
		
		
		
		//Enhanced for loop for Arrays
		
		
		int [] integers = {10, 20, 30, 40, 50};

	      for(int x : integers ) {
	         System.out.printf( "%d ",x );
	         
	      }
	     System.out.print("\n");
	      String [] names = {"James", "Larry", "Tom", "Lacy"};

	      for( String name : names ) {
	         System.out.printf( "%s ",name );
	         
	      }
		
	}

}
