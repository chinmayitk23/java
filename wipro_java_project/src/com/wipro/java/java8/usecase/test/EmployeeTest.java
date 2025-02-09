package com.wipro.java.java8.usecase.test;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import com.wipro.java.java8.usecase.Employee;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp() {  
        employee = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
    }

    @Ignore // This prevents JUnit from running the test
    @Test
    public void printEmployeeDetails() {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Joining Date: " + employee.getJoiningDate());
        System.out.println("Employee Details: " + employee.toString());
    }
}