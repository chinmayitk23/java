package com.wipro.java.collections;


import java.util.ArrayList;
import java.util.Arrays;
public class ListOperations {
	public static void main(String[] args) {
		
		        //  first list (l1) 
		        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));

		        //  second list (l2)
		        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("Mango", "Grapes", "Peach"));

		        System.out.println("Original l1: " + l1);
		        System.out.println("Original l2: " + l2);

		        
		        l1.addAll(1, l2);
		        System.out.println("\nAfter addAll(1, l2): " + l1);

		        
		        l1.remove(1);
		        System.out.println("After remove(1): " + l1);

		        
		        l1.set(0, "Orange");
		        System.out.println("After set(0, \"Orange\"): " + l1);
		    }

}
