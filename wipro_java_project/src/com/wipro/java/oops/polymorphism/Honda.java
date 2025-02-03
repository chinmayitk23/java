package com.wipro.java.oops.polymorphism;

public class Honda extends Car {
    // Overriding the display method to provide Honda-specific implementation
    @Override
    public void display() {
        // Using getter methods to access inherited fields
        System.out.println("Honda: " + getEngineType() + ", " + getModel() + ", " + getColor() + ", " + getYear() + ".");
    }

    public static void main(String[] args) {
        // Creating an instance of Honda (which is a subclass of Car)
        Car car = new Honda();
        
        // Setting properties for the Honda object using the inherited setter methods
        car.setColor("Red");
        car.setEngineType("Hybrid");
        car.setModel("Civic");
        car.setYear(2024);

        // Calling the overridden display() method (polymorphism in action)
        car.display();  // This will call the display method of Honda class, not Car class
    }
}
