package com.wipro.java.exception;

public class ExcepttionDemo {

	public static void main(String[] args) {
		int numerator = 10;  
        int denominator = 0;  

        try {

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        
        } catch (Exception e) {
           
            System.out.println(e.toString());
        } finally {
            
            System.out.println("Execution complete.");
        }
    }
		// TODO Auto-generated method stub

	}


