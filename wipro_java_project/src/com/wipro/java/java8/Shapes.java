package com.wipro.java.java8;
@FunctionalInterface
interface ShapeInterface {

    // One abstract method
    void area(double dimension);

    // Two default methods
    default void displayShape() {
        System.out.println("This is a shape.");
    }

    default double perimeter(double dimension) {
        System.out.println("Calculating perimeter...");
        return dimension * 4; // Example for a square
    }

    // Two static methods
    static void shapeInfo() {
        System.out.println("Shapes can be 2D or 3D.");
    }

    static void printMessage() {
        System.out.println("Static methods in interfaces do not require an object.");
    }
}

// Implementing class named "Shapes"
class Shapes implements ShapeInterface {

    // Implementing the abstract method
    @Override
    public void area(double sideLength) {
        double result = sideLength * sideLength;
        System.out.println("Area of the Shape (assuming square): " + result);
    }

    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area(5);

        // Calling default methods
        s.displayShape();
        System.out.println("Perimeter (assuming square logic): " + s.perimeter(5));

        // Calling static methods (directly from interface)
        ShapeInterface.shapeInfo();
        ShapeInterface.printMessage();
    }
}
