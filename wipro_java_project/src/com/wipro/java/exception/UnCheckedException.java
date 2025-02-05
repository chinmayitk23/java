package com.wipro.java.exception;

public class UnCheckedException {

	public static void main(String[] args) {
		try {
            // Division by zero (Unchecked Exception)
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the unchecked exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block always executes
            System.out.println("Execution complete.");
        }
		// TODO Auto-generated method stub

	}

}
