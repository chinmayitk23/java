package com.wipro.java;

import java.util.*;

//Person class with name and age attributes
class Person {
 String name;
 int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 @Override
 public String toString() {
     return name + " (" + age + ")";
 }
}

//Custom comparator to sort by age
class AgeComparator implements Comparator<Person> {
 @Override
 public int compare(Person p1, Person p2) {
     return Integer.compare(p1.age, p2.age);
 }
}

public class LinkedListSort {
 public static void main(String[] args) {
     LinkedList<Person> people = new LinkedList<>();
     people.add(new Person("Alice", 30));
     people.add(new Person("Bob", 25));
     people.add(new Person("Charlie", 35));

     System.out.println("Before Sorting:");
     System.out.println(people);

     // Sorting using comparator
     Collections.sort(people, new AgeComparator());

     System.out.println("After Sorting by Age:");
     System.out.println(people);
 }
}
