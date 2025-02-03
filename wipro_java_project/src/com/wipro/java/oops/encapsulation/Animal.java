package com.wipro.java.oops.encapsulation;

public class Animal {
	private String name;
    private int age;
    private String species;
    public Animal(String name, int age, String species){
    	this.name=name;
    	this.age=age;
    	this.species=species;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>0) {
			this.age = age;
		}
		else {
			System.out.println("Age is not valid");
		}

		
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public static void main(String[] args) {
		Animal animal= new Animal("Blacky",10,"Dog");
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		System.out.println(animal.getSpecies());
		System.out.println("After few years,My Blacky!");
		animal.setAge(30);
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		System.out.println(animal.getSpecies());
		animal.setAge(-5);
		
		
		// TODO Auto-generated method stub

	}

}
