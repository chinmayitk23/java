/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * 
 * parent class = employee
 * child class= Manager
 * extends =keyword
 */
 
public class Manager extends Employee{

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] a) {
		// child object is instantiated from child constructor
		// parent class consumes the prop and behaviors of child class

		Employee employee = new Manager();
		employee.setEmpName("Chinmayi");
		employee.setEmpId(1235);
		employee.setEmpAge(47);
		employee.setEmpDesignation("Manager");
		employee.setSalary(5000f);

		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpAge());
		System.out.println(employee.getEmpDesignation());
		System.out.println(employee.getSalary());
	}

}
