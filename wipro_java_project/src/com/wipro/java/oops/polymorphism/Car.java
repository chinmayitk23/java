/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car {
	    private String engineType;  // Replaced make with engineType
	    private String model;
	    private int year;
	    private String color;
	    
	

	public String getEngineType() {
			return engineType;
		}



		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}



		public String getModel() {
			return model;
		}



		public void setModel(String model) {
			this.model = model;
		}



		public int getYear() {
			return year;
		}



		public void setYear(int year) {
			this.year = year;
		}



		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}

  public void display() {
	  System.out.println("BMW:"+engineType+","+model+","+color+","+year+".");
  }

	/**
	 * 
	 */
	

}
