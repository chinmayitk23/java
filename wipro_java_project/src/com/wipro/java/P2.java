package com.wipro.java;

import java.util.Scanner;

//Generic Stack implementation using a linked list
class Stack<T> {
private Node<T> top;

private static class Node<T> {
   T data;
   Node<T> next;

   Node(T data) {
       this.data = data;
       this.next = null;
   }
}

// Push operation
public void push(T item) {
   Node<T> newNode = new Node<>(item);
   newNode.next = top;
   top = newNode;
}

// Pop operation
public T pop() {
   if (isEmpty()) {
       return null;
   }
   T data = top.data;
   top = top.next;
   return data;
}

// Peek operation
public T peek() {
   if (isEmpty()) {
       return null;
   }
   return top.data;
}

// Check if the stack is empty
public boolean isEmpty() {
   return top == null;
}
}

//Main class to test the stack implementation
public class P2 {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   // Integer stack
   Stack<Integer> integerStack = new Stack<>();
   System.out.println("Enter integers (enter a non-integer to stop):");
   while (scanner.hasNextInt()) {
       int userInput = scanner.nextInt();
       integerStack.push(userInput);
   }
   scanner.nextLine(); // Clear the buffer

   // Perform operations on the integer stack
   System.out.println("Peek: " + integerStack.peek());
   System.out.println("Pop: " + integerStack.pop());
   System.out.println("Is empty: " + integerStack.isEmpty());
   System.out.println("Pop: " + integerStack.pop());
   System.out.println("Pop: " + integerStack.pop());
   System.out.println("Is empty: " + integerStack.isEmpty());

   // String stack
   Stack<String> stringStack = new Stack<>();
   System.out.println("Enter strings (enter an empty string to stop):");
   while (true) {
       String userInput = scanner.nextLine();
       if (userInput.isEmpty()) {
           break;
       }
       stringStack.push(userInput);
   }

   // Perform operations on the string stack
   System.out.println("Peek: " + stringStack.peek());
   System.out.println("Pop: " + stringStack.pop());
   System.out.println("Is empty: " + stringStack.isEmpty());

   scanner.close();
}
}