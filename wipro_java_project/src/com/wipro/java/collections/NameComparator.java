package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class NameComparator implements Comparator<Animal1> {
		    @Override
		    public int compare(Animal1 o1, Animal1 o2) {
		        return o1.getName().compareTo(o2.getName());  // Sort by name (ascending order)
		    }
		

	

	public static void main(String[] args) {
		ArrayList<Animal1> animals = new ArrayList<>();
        animals.add(new Animal1("Lion", 5));
        animals.add(new Animal1("Elephant", 10));
        animals.add(new Animal1("Zebra", 3));
        animals.add(new Animal1("Monkey", 4));

        // Sorting animals by name using NameComparator
        Collections.sort(animals, new NameComparator());
        System.out.println("Animals after sorting by name:");
        for (Animal1 animal : animals) {
            System.out.println(animal.getName() + " - Age: " + animal.getAge());
        }

		// TODO Auto-generated method stub

	}

}
