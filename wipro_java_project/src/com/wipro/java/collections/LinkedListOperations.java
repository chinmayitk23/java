package com.wipro.java.collections;
import java.util.LinkedList;
public class LinkedListOperations {

	public static void main(String[] args) {
		LinkedList<Double> list = new LinkedList<>();

	
		list.add(10.5);
		list.add(20.75);
		list.add(30.25);
		list.add(40.0);

		System.out.println("Original list: " + list);

	
		list.add(2, 25.5);
		System.out.println("\nAfter add(2, 25.5): " + list);

		
		list.remove(1);
		System.out.println("After remove(1): " + list);

		
		list.set(0, 5.5);
		System.out.println("After set(0, 5.5): " + list);

		
		System.out.println("\nFirst element: " + list.getFirst());
		System.out.println("Last element: " + list.getLast());

		
		// TODO Auto-generated method stub

	}

}