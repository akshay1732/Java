package com.Java.oops;

public class AbstractClassConstructors extends AbstractClass  {

	public static void main(String[] args) {
		AbstractClass a = new AbstractClassConstructors();
		a.One();
		AbstractClass.three();
		
	}

	@Override
	public void two() {
		System.out.println("Overiden Abstract Method in Child Class");
		
	}
	
	@Override
	public void One() {
		System.out.println("Overiden Non Abstract Method in Child Class");
		super.One();
	}
	
	
	
	

}
