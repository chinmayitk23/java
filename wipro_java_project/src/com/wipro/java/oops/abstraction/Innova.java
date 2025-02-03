package com.wipro.java.oops.abstraction;

public class Innova extends Car{

	@Override
	void accelerate() {
		System.out.println("Accelerated");
		// TODO Auto-generated method stub
		
	}

	@Override
	void drive() {
		System.out.println("Innova is very good to drive");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
        Car myCar = new Innova(); // Creating an object of Innova using reference of Car
        myCar.accelerate();
        myCar.drive();
    }

}
