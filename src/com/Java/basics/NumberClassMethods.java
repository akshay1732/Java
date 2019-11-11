package com.Java.basics;

public class NumberClassMethods {

	
	/*****************Subclasses of Number Class***********************
	 * Float
	 * Double
	 * Integer
	 * Byte
	 * Long
	 * Short
	 * BigDecimal
	 * BigInteger
	 * 
	 * */
	
	
	static Float x=350.125f;
	static Double d=5000.5d;
	static Integer i=5;
	static String name = "123";
	
	public static void main(String[] args) {
		
		
		System.out.println("******************Methods of Number Classes************************");
		
		
		//************************XXXValue(); no parameters************************
		
		System.out.println("***********************xxxValue() Method************************");
		int a=0;
		a=d.intValue();
		System.out.println("intValue "+a);
		
		double b;
		b=i.doubleValue();
		System.out.println("doubleValue "+b);
		
		byte c=0;
		c=x.byteValue();
		System.out.println("byteValue "+c);
		
		int n=0;
		n=Integer.parseInt(name);
		System.out.println(n);
		
		
		//*********************************compareTo()***********************************
		
		/* parameters - Byte, Double, Integer, Float, Long, or Short. Return value -
		 * -1,0,1
		 */
		
		
		
		System.out.println("*********************compareTo() Method************************");
		String mystring="zxcv";
		Integer x = 5; 
	    System.out.println("X is Greater "+x.compareTo(3));
	    System.out.println("X is Equal "+x.compareTo(5));
	    System.out.println("X is Less "+x.compareTo(8));
	    
		/*
		 * If both the strings are equal then this method returns 0 else it returns
		 * positive or negative value. The result is positive if the first string is
		 * lexicographically greater than the second string else the result would be
		 * negative.
		 */
	   
	    System.out.println(mystring.compareTo("zxcv")); 
	    
	    
	    //*********************************== Operator**********************************
	    
	    //use == operator for primitive data types 
	    
	    System.out.println("********************** == Operator ***************************");
	    
	    int var1=10;
	    int var2=10;
	    
	    if (var1==var2) 
	    {
	    	System.out.println("Ints are Equal");
	    }
	    
	    char var3='A';
	    char var4='A';
	    
	    if(var3==var4)
	    	
	    {
	    	System.out.println("Chars are Equal");
	    }
	    
	    
	    
	    
	    //***************************** equals() method**********************************
	    
	    //Used for class objects
	    System.out.println("**********************equals() Method*************************");
	    
	    
	    //******************Integers***********************
	   
	    
	    Integer car1=  Integer.valueOf(128);        //Integers are interned from -128 to 127
	    Integer car2=  Integer.valueOf(128); 
	    
	    if (car1.equals(car2)) 
	    {
	    	System.out.println("Integers objects are Equal.");
	    }
	    else {
	    	System.out.println("Integers objects are not Equal.");
	    }
	    
	    
	    //********************Strings**********************
	    
		/*
		 * String Literals - These are interned so it may point to existing memory
		 * location if defined by String one="mystring";
		 */
	    
	    String car3=new String("My Car");  //New Object pointing to new memory location
	    String car4=new String("My Car"); 
	    
	   
	    
	    if(car3.equals(car4))
	    	
	    {
	    	System.out.println("Strings are Equal.\n"+car3+" " +car4);
	    }
	    
	    else
	    {
	    	System.out.println("Strings are not Equal.\n"+car3+" " +car4);
	    }
		
		
		
		

	}

}
