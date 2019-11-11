package com.Java.basics;
public class AccessModifiers extends VariableTypes {

	/*
	The four access levels are:
	
	Visible to the package, the default. No modifiers are needed.
	Visible to the class only (private).
	Visible to the world (public).
	Visible to the package and all subclasses (protected).  
	 

	Access Control and Inheritance:
	
	The following rules for inherited methods are enforced

	Methods declared public in a superclass also must be public in all subclasses.
	Methods declared protected in a superclass must either be protected or public in subclasses; 
	they cannot be private.
	Methods declared private are not inherited at all, so there is no rule for them.
	 */
	
	//Default Access Modifier
	String version = "1.5.1";

	boolean processOrder() {
	   return true;
	}
	
	
	//  Private Access modifier

	private String format;

	   public String getFormat() {
	      return this.format;
	   }

	   public void setFormat(String format) {
	      this.format = format;
	   }
	   
	   
	   
	//  Public Access modifier   
	   
	public static void main(String[] args) {
		
			
	}
	
	
	
	//  Protected Access Modifier
	
	protected boolean openSpeaker() 
	{
		      return true;
	}
	
	
	
}



class StreamingAudioPlayer extends AccessModifiers 
{
	//AccessModifiers one=new AccessModifiers();
	boolean a=openSpeaker();
		
		
		   
}
	
	


