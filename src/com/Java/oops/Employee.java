package com.Java.oops;



//****************************POLYMORPHISM********************************//



public class Employee {

	private String name;
	private String address;
	private int number;

	public Employee(String name, String address, int number) {
	    System.out.println("Constructing an Employee");
	    this.name = name;
	    this.address = address;
	    this.number = number;
	}

	public String getaddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return number;
	}
	
	public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	}
	
}


//*****************************New Class****************************************//


class Salary extends Employee {
	   private double salary; // Annual salary
	   
	   public Salary(String name, String address, int number, double salary) {
	      super(name, address, number);
	      setSalary(salary);
	   }
	   
	   public void mailCheck() {
	      System.out.println("Within mailCheck of Salary class ");
	      System.out.println("Mailing check to " + getName()
	      + " with salary " + salary);
	   }
	   
	   public double getSalary() {
	      return salary;
	   }
	   public void setSalary(double newSalary) {
	       if(newSalary >= 0.0) {
	             salary = newSalary;
	   }
	   }}   
	      