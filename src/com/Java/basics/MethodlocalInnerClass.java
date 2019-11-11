package com.Java.basics;

public class MethodlocalInnerClass {

	public static void main(String[] args) {
		
		
		Outerclass out =new Outerclass();
		out.my_Method();

	}

}





 class Outerclass {
	 
	int one=10; 
   // instance method of the outer class 
   void my_Method() 
   {
      int num = 23;
      
      	// method-local inner class
      	class MethodInner_Demo 
      	{
      		public void print() 
      		{
            System.out.println("This is method inner class "+num);
            System.out.println(one);
      		}   
      	}// end of inner class
      
      
      MethodInner_Demo inner = new MethodInner_Demo();
      inner.print(); 
    
   }
   
 
 }
 
 