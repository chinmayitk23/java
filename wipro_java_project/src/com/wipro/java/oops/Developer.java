/**
 * 
 */
package com.wipro.java.oops;

/**
 * parent class = employee
 * child class= Developer
 * extends =keyword
 */
 
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] a) {
		// child object is instantiated from child constructor
		// parent class consumes the prop and behaviors of child class

		Employee employee = new Developer();
		employee.setEmpName("Manikanta");
		employee.setEmpId(123);
		employee.setEmpAge(25);
		employee.setEmpDesignation("Developer");
		employee.setSalary(5000f);

		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpAge());
		System.out.println(employee.getEmpDesignation());
		System.out.println(employee.getSalary());
	}

}
