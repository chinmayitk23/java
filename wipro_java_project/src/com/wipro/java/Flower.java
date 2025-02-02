/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {
	String name;
    String color;

	/**
	 * 
	 */
	public Flower(String name, String color) {
		this.name = name;
        this.color = color;
		// TODO Auto-generated constructor stub
	}
	public void displayDetails() {
        System.out.println("Flower Name: " + name);
        System.out.println("Flower Color: " + color);
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flower rose = new Flower("Rose", "Pink");
		Flower sunflower = new Flower("Sunflower", "Yellow");
		 rose.displayDetails();
		 sunflower.displayDetails();

		// TODO Auto-generated method stub

	}

}
