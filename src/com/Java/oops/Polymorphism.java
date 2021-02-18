package com.Java.oops;

class Animals {
    public void eat() {
        System.out.println("Animal Eats");
    }

    public void drink() {
        System.out.println("Animal Drinks");
    }
    public void ParentMethod() {
    	System.out.println("Parent Class");
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

    public void ChildMethod() {
    	System.out.println();
    }
    public static void main(String[] args) {
    	Polymorphism myCat = new Polymorphism();
        myCat.eat();
        myCat.drink();
        myCat.ParentMethod();

        Animals myAnimal = myCat;        
        myAnimal.eat();
        myAnimal.drink();
       // myAnimal.ChildMethod(); Will give error
       
    }
}