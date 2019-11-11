package com.Java.oops;


class Animal {
	   public void move() {
	      System.out.println("Animals class method");
	   }
	}


public class Overriding extends Animal {

		public void move() {
		      System.out.println("Overridden Subclass method");
		   }
		
		public static void main(String args[]) {
		      Animal a = new Animal();   // Animal reference and object
		      Animal b = new Overriding();   // Animal reference but Overriding object

		      a.move();   // runs the method in Animal class
		      b.move();   // runs the method in Overriding class
		   }
}


