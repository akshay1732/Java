package com.Java.oops;

class Animals {
    public void eat() {
        System.out.println("Animal Eats");
    }

    public void drink() {
        System.out.println("Animal Drinks");
    }
}



public class Polymorphism extends Animals {
    
	
	@Override
    public void eat() {
        System.out.println("Cat Eats");
    }

    @Override
    public void drink() {
        System.out.println("Cat Drinks");
    }

    public static void main(String[] args) {
    	Polymorphism myCat = new Polymorphism();
        myCat.eat();
        myCat.drink();

        Animals myAnimal = myCat;        
        myAnimal.eat();
        myAnimal.drink();
    }
}