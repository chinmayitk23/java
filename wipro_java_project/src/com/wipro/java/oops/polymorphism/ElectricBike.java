package com.wipro.java.oops.polymorphism;

public class ElectricBike extends Bike {
	@Override
	double calculateMileage(double speed, double batteryConsumption) {
        return (speed / batteryConsumption) * 1.5;  
    }

	public static void main(String[] args) {
		ElectricBike electricBike = new ElectricBike();
        System.out.println("Electric Bike Mileage: " + electricBike.calculateMileage(100, 5));
		// TODO Auto-generated method stub

	}

}
