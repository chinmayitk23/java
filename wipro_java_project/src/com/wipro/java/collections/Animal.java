package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing compareTo method for sorting animals by name
    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);  // Sorting by name in ascending order
    }

    public static void main(String[] args) {
        // Create an ArrayList of Animal objects
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Zebra", 3));
        animals.add(new Animal("Monkey", 4));

        // Sorting animals by name using compareTo method
        Collections.sort(animals);

        // Print sorted list
        System.out.println("Animals after sorting by name:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - Age: " + animal.getAge());
        }
    }
}

