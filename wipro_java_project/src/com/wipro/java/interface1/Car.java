package com.wipro.java.interface1;

public class Car implements Vehicle  {

	public static void main(String[] args) {
		Car myCar = new Car(); // Creating an instance of Car
        myCar.start();  // Calling the start method
        myCar.stop();
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		 System.out.println("Car has started.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		 System.out.println("Car has stopped.");
		// TODO Auto-generated method stub
		
	}

}
