package com.wipro.java.collections;
import java.util.LinkedList;
public class LinkedListOperations {

	public static void main(String[] args) {
		LinkedList<Character> ll = new LinkedList<>();

        int n = 5; 

        for (int i = 0; i < n; i++)
            ll.add((char) ('A' + i)); 

       
        System.out.println("Original LinkedList: " + ll);

    
        ll.remove(3); 

        
        System.out.println("After remove(3): " + ll);

        
        System.out.print("LinkedList elements: ");
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
		
		// TODO Auto-generated method stub

	}

}