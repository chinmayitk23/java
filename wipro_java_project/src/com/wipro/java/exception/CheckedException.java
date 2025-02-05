package com.wipro.java.exception;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		
	        try {
	            // Attempting to read a file that may not exist (Checked Exception)
	            FileReader file = new FileReader("data.txt");  
	            int ch;

	            // Reading file content character by character
	            while ((ch = file.read()) != -1) {
	                System.out.print((char) ch);
	            }
	            file.close();
	        } catch (IOException e) {
	            // Handling the checked exception
	            System.out.println("Error: File not found or cannot be read.");
	        } finally {
	            // This block always executes
	            System.out.println("\nExecution complete.");
	        }
		// TODO Auto-generated method stub

	}

}
