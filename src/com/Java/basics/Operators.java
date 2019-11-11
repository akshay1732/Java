package com.Java.basics;

public class Operators {
	
	
	

	public static void main(String[] args) {
		
		int a,b;
		a=10;
		b=20;
		
		
		
		//Arithmetic Operators
		
		//Addition
		System.out.println(a+b);
		//Subtraction
		System.out.println(b-a);
		//Multiplication
		System.out.println(a*b);
		//Division
		System.out.println(b/a);
		//Mod
		System.out.println(b%a);
		//Increment
		System.out.println(++b);
		//Increment
		System.out.println(--b);
		
		
		
		
		
		//Relational Operators
		boolean flag=false;
		
		//Equal to
		flag = a==b;
		System.out.println(flag);
		
		//Not Equal to
		flag = a!=b;
		System.out.println(flag);
		
		//greater than
		flag = a>b;
		System.out.println(flag);
		
		//less than
		flag = a<b;
		System.out.println(flag);
		
		//greater than or equal to
		flag = a>=b;
		System.out.println(flag);

		//less than or equal to
		flag = a<=b;
		System.out.println(flag);
		
		
		
		
		//Bitwise Operators
		
		a=60;b=13;
		//Bitwise AND
		System.out.println(a&b);
		//Bitwise OR
		System.out.println(a|b);
		//Bitwise Ex-OR
		System.out.println(a^b);		
		//Bitwise Compliment
		System.out.println(~a);	
		//Left shift 2 bits
		System.out.println(a<<2);		
		//Right shift 2 bits
		System.out.println(a>>2);	
		//Right shift fill zero
		System.out.println(a>>>2);
		
		
		
		//Logical Operators
		
		 boolean one=true;
		 boolean two=false;
		//Logical AND with two boolean values
		flag=(one && two);
		System.out.println(flag);
		
		//Logical OR with two boolean values
		flag=(one || two);
		System.out.println(flag);
		
		//Logical Compliment 
		flag=(!one);
		System.out.println(flag);
		
		
		
		
		//Assignment Operators
		
		a=b;
		System.out.println(a);
		
		a+=b;//a=a+b;
		System.out.println(a);
		
		a-=b;//a=a-b;
		System.out.println(a);
		
		a/=b;//a=a/b
		System.out.println(a);
		
		a%=b;//a=a%b;
		System.out.println(a);
		
		a&=b;//a=a&b;
		System.out.println(a);
		
		a^=b;//a=a^b;
		System.out.println(a);
		
		a|=b;//a=a^b;
		System.out.println(a);
		
		
		
		//Miscallaneous operator (?:)
		
		a=20;b=30;
		int x = (a>b)? 100:50;  //if true assign 100 else 50
		System.out.println(x);
		
		
		//instanceof Operator
		
		
		String name = "James";

	      // following will return true since name is type of String
	      boolean result = name instanceof String;
	      System.out.println( result );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		

	}

}
