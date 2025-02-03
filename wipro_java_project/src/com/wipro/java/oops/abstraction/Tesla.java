package com.wipro.java.oops.abstraction;

public class Tesla extends Car {

	@Override
	void accelerate() {
		System.out.println(" Tesla Accelerated");
		// TODO Auto-generated method stub
		
	}

	@Override
	void drive() {
		System.out.println("Tesla is very good to drive");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] a) {
		Car car=new Tesla();
		car.accelerate();
		car.drive();
	}

}
