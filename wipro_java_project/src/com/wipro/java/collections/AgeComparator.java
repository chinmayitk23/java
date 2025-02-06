package com.wipro.java.collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class AgeComparator implements Comparator<Animal1> {
    @Override
    public int compare(Animal1 o1, Animal1 o2) {
        return Integer.compare(o1.getAge(), o2.getAge());  // Sort by age (ascending order)
    }
 
	public static void main(String[] args) {
		ArrayList<Animal1> animals = new ArrayList<>();
        animals.add(new Animal1("Lion", 5));
        animals.add(new Animal1("Elephant", 10));
        animals.add(new Animal1("Zebra", 3));
        animals.add(new Animal1("Monkey", 4));
     // Sorting animals by age using AgeComparator
        Collections.sort(animals, new AgeComparator());
        System.out.println("\nAnimals after sorting by age:");
        for (Animal1 animal : animals) {
            System.out.println(animal.getName() + " - Age: " + animal.getAge());
        }
		// TODO Auto-generated method stub

	}

}
