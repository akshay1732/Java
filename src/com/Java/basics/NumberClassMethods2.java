package com.Java.basics;

public class NumberClassMethods2 {

	public static void main(String args[]) {
		
		
			   
	//******************************valueOf () Method***********************************
		
		//Create objects from primitive data types or constants
		
		System.out.println("****************** valueOf () Method************************");
			  
			  char z='A';
		      Integer i =Integer.valueOf(9);
		      Double d = Double.valueOf(z); 			//Characters are auto converted into int
		      Float f = Float.valueOf("80");               
		      Integer i2 = Integer.valueOf("F",16); 		//16 is Base of integer

		      System.out.println(i); 
		      System.out.println(d);
		      System.out.println(f);
		      System.out.println(i2);
		      
		      
		    
		      
		      
		      
	 //******************************toString() Method********************************
		      
		//Convert Number objects to strings
			
		System.out.println("****************** toString() Method************************");
		
		Float f2=5.00f;
		Byte b1=4;
		String str = f2.toString();
		String str2=b1.toString();
		
		System.out.println(str);
		System.out.println(str2);
		
		
		  
		  
	//******************************parseXXX() Method********************************
	      
		//Convert Strings to primitive data types
			
		System.out.println("****************** parseXXX() Method************************");	  
		  
		  
		String name="100";
		int n=Integer.parseInt(name);
		System.out.println(n);
		
		byte b2=Byte.parseByte(name, 2);
		System.out.println(b2);
		
		
		
		  
	//******************************abs() Method********************************
	      
		//returns absolute values - Belongs to math class
					
		System.out.println("*********************** abs() Method************************");	  
				 	  
		Integer i1 = -8;
	    double d1 = -100d;
	    float f1 = -90;

	    
	    
	    System.out.println(Math.abs(i1));
	    System.out.println(Math.abs(d1));     
	    System.out.println(Math.abs(f1));  
		  
		  
	    
		  
	 //******************************Math class Methods********************************
	      
	  	//returns absolute values - Belongs to math class
	  					
	  	System.out.println("***********************Math class Method************************");	  
	  		//********ceil()********
	  	
	     double d2 = -100.675;
	     float f3 = -90;    

	      System.out.println(Math.ceil(d2));
	      System.out.println(Math.ceil(f3)); 

	      System.out.println(Math.floor(d2));
	      System.out.println(Math.floor(f3)); 
		  
		  
		/*******************************Other Math Class methods******************************
		 * 
		 * floor() Returns the largest integer that is less than or equal to the
		 * argument. Returned as a double.
		 * 
		 * 
		 * rint() Returns the integer that is closest in value to the argument. 
		 * Returned as a double.
		 * 
		 * 
		 * round() Returns the closest long or int, as indicated by the method's return
		 * type to the argument.
		 * 
		 * 
		 * min() Returns the smaller of the two arguments.
		 * 
		 * 
		 * max() Returns the larger of the two arguments.
		 * 
		 * 
		 * exp() Returns the base of the natural logarithms, e, to the power of the
		 * argument.
		 * 
		 * 
		 * log() Returns the natural logarithm of the argument.
		 * 
		 * pow() Returns the value of the first argument raised to the power of the
		 * second argument.
		 * 
		 * 
		 * sqrt() Returns the square root of the argument.
		 * 
		 * 
		 * sin() Returns the sine of the specified double value.
		 * 
		 * cos() Returns the cosine of the specified double value.
		 * 
		 * 
		 * tan() Returns the tangent of the specified double value.
		 * 
		 * 
		 * atan2() Converts rectangular coordinates (x, y) to polar coordinate (r,theta) and
		 * returns theta.
		 * 
		 * 
		 * toDegrees() Converts the argument to degrees.
		 * 
		 * toRadians() Converts the argument to radians.
		 * 
		 * random() Returns a random number.Returned as a double.
		 *
		 *
		 */
	      
		   }
		

}


