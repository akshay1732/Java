package com.Java.basics;

public class Strings {

	public static void main(String[] args) {
		
		String str="Hello ";
		String str1=new String("World ");
		char[] ch= {'A','B','C','D'};	
		String str2=new String(ch);
		

		System.out.printf("%s %s \n" ,str, str1);
		
		
		
		//Format method
		
		String fs;
		fs=String.format("%s %s %s \n" ,str, str1 ,str2);
		System.out.println(fs);
		
		
		//Concatenation
		
		String join=str.concat(str1);
		System.out.println(join);
		
		String join2=str+str1+"A B C D";
		System.out.println(join2);
		
		
		//Functions
		String str3=String.copyValueOf(ch);
		System.out.println(str3);
		String str4=String.copyValueOf(ch, 1, 2);
		System.out.println(str4);
		
		
		 boolean retVal = str3.endsWith( "CD" );
	     System.out.println("Returned Value = " + retVal );
	     
	     int len=str.length();
	     System.out.println(len);
	     
	     char[] dst =new char[6];
	    join2.getChars(0,4, dst, 0);
	    System.out.println(dst);	 // Copies characters from this string into the 
	    								//destination character array.
		

	    //	int indexOf(String str, int fromIndex)
	    
	    
	    String Str = new String("Welcome to Tutorialspoint.com");
	    String SubStr1 = new String("Tutorials" );
	    System.out.print("\nFound Index :" );
	    System.out.println( Str.indexOf( SubStr1, 1));
	       
	   
	    //	int lastIndexOf(String str, int fromIndex)
	    
	    //Returns the index within this string of the last occurrence 
	    //of the specified substring, searching backward starting at the specified index.
	    

	    String SubStr2 = new String("com" );
	    System.out.print("Found Last Index :" );
	    System.out.println( Str.lastIndexOf( SubStr2, 15 ));
	    
	    
	    //	boolean matches(String regex)
	    


	      System.out.print("\nReturn Value :" );
	      System.out.println(Str.matches("(.*)Tutorials(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Tutorials"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Welcome(.*)"));
	      
	      
	      
	      //boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
	      
	      String Str2 = new String("Tutorials");
	      String Str3 = new String("TUTORIALS");

	      System.out.print("\nReturn Value :" );
	      System.out.println(Str.regionMatches(11, Str2, 0, 9));
	      
	      System.out.print("Return Value :" );
	      System.out.println(Str.regionMatches(true,11, Str3, 0, 9));
	      
	      
	      //String replaceAll() Method
	      
	      //public String replaceAll(String regex, String replacement)
	      
	      String nstr="Akshay Akshay1";
	      System.out.print("\nReturn Value :" );
	      System.out.println(nstr.replaceAll("(.*) (.*)", "AMROOD"));
	      
	      
	      //public String replaceFirst(String regex, String replacement)
	      
	      System.out.print("Return Value :" );
	      System.out.println(nstr.replaceFirst("(.*) ", "AMROOD"));
	      
	      
	      
	      
	      //public String[] split(String regex, int limit)
	      
	      
	      System.out.print("\n");
	      String[] nstr2=Str.split(" ",2);
	      for (String nstr3:nstr2) {
	    	  
	    	  System.out.println(nstr3);
	      }
	      
	      
	      //substring()
	      
	      String substr=Str.substring(10, 15);
	      System.out.print("\nReturn Value :" );
	      System.out.println(substr);
	      
	      
	      //toCharArray
	      
	      char[] chr=Str.toCharArray();
	      System.out.println(chr);
	      
	      
	      //String trim()
	      
	      String tstr=Str.trim();
	      System.out.println(tstr);
	      
	      
	      //String valueOf() Method
	      
	      
	      double d = 102939939.939;
	      boolean b = true;
	      long l = 1232874;
	      char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

	      System.out.println("\nReturn Value : " + String.valueOf(d) );
	      System.out.println("Return Value : " + String.valueOf(b) );
	      System.out.println("Return Value : " + String.valueOf(l) );
	      System.out.println("Return Value : " + String.valueOf(arr) );
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      

	
		
		
	}

}
