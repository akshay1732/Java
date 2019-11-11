package com.Java.basics;

abstract class ExtendedClass 
{		
public abstract void mymethod();
}

class AnonymousInnerClass 
{
	public static void main(String args[]) 
	{
			ExtendedClass inner = new ExtendedClass(){
		         	public void mymethod() {
		         		System.out.println("This is an example of anonymous inner class");
		         	}
		      };
	
	inner.mymethod();
	}
	
		
	}


