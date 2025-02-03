/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Animal {
	private String name;
    private int age;
    private String species;

	

	/**
	 * 
	 */
	
	/**
	 * @param args
	 */
	



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = "Fish";
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = 10;
	}



	public String getSpecies() {
		return species;
	}



	public void setSpecies(String species) {
		this.species = "Aquatic";
	}
	 public String toString() {
	        return "Animal [name=" + name + ", age=" + age + ", species=" + species + "]";
	    }
	 
}
