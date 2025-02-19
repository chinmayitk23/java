package com.wipro.java;

class Linkedlist {
    // Node class representing an element in the list
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the linked list

    // Insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete a node with a specific value
    public void delete(int data) {
        if (head == null) return;

        // If head is the node to be deleted
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Node with value " + data + " not found.");
            return;
        }

        temp.next = temp.next.next;
    }

    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // Output: 10 -> 20 -> 30 -> NULL

        list.delete(20);
        list.display(); // Output: 10 -> 30 -> NULL

        list.insert(40);
        list.display(); // Output: 10 -> 30 -> 40 -> NULL
    }
}
