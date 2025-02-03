/**
 * 
 */
package com.wipro.java;

/**
 * Pojo-plain java object
 * NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fields
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
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
