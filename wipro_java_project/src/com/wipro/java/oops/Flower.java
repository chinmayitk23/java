/**
 * 
 */
package com.wipro.java.oops;

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
		Flower rosee = new Flower("Rose", "Pink");
		Flower sunflower = new Flower("Sunflower", "Yellow");
		 rosee.displayDetails();
		 sunflower.displayDetails();

		// TODO Auto-generated method stub

	}

}
