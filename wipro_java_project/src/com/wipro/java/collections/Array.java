package com.wipro.java.collections;

public class Array {
	public static void main(String[] args) {
        // 1. Declaring and Initializing an Array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Accessing and Printing Array Elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 3. Modifying an Array Element
        numbers[2] = 100;
        System.out.println("\nAfter modification:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 4. Finding Array Length
        System.out.println("\nArray length: " + numbers.length);
    }

}
