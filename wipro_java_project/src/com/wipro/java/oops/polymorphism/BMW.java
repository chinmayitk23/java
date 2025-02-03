package com.wipro.java.oops.polymorphism;

public class BMW extends Car {
    // Overriding the display method to provide BMW-specific implementation
    @Override
    public void display() {
        // Using getter methods to access inherited fields
        System.out.println("BMW: " + getEngineType() + ", " + getModel() + ", " + getColor() + ", " + getYear() + ".");
    }

    public static void main(String[] args) {
        // Creating an instance of BMW (which is a subclass of Car)
        Car car = new BMW();
        
        // Setting properties for the BMW object using the inherited setter methods
        car.setColor("Yellow");
        car.setEngineType("V8");
        car.setModel("X5");
        car.setYear(2025);

        // Calling the overridden display() method (polymorphism in action)
        car.display();  // This will call the display method of BMW class, not Car class
    }
}
