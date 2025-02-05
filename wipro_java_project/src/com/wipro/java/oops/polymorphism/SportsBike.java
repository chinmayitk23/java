package com.wipro.java.oops.polymorphism;

public class SportsBike extends Bike {
	@Override
    double calculateMileage(double speed, double fuel) {
        return (speed / fuel) * 0.8;  
    }

	public static void main(String[] args) {
		 SportsBike sportsBike = new SportsBike();
	        System.out.println("Sports Bike Mileage: " + sportsBike.calculateMileage(100, 5));
		// TODO Auto-generated method stub

	}

}
