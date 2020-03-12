/*
 * Austin Wong-Parker
 * Object & Classes Practice - Java
 * 
 * Employee example with Objects
 * 
 */

import java.io.*;

public class ObjectAndClassExamples2 {
	public class Employee {						// Class employee - blueprint
		String name;							
		int age;
		String designation;
		double salary;
		
		public Employee(String name) {			// Constructor (same name as class) and takes in name parameter.
			this.name = name;
		}
		
		public void employeeAge(int empAge) {	// void method - setting employee age. Not need for Employee.age, just age.
			age = empAge;						// Because we're still in the class Employee.
		}
		
		public void employeeDesignation(String empDes) {
			designation = empDes;
		}
		
		public void employeeSalary(double empSalary) {
			salary = empSalary;
		}
		
		public void printEmpRecords() {
			System.out.println("The employee's name is: " + name);
			System.out.println("The employee's age is: " + age);
			System.out.println("The employee's designation is: " + designation);
			System.out.println("The employee's Salary is: " + salary);
		}
		
	}
	
	// Testing our employee class
	public static void main(String[] args) {
		/* Create two objects using constructor */
		Employee Daniel = new Employee("Daniel");
		Employee Sarah = new Employee("Sarah");
		
		/* Invoke methods for each object created */
		Daniel.employeeAge(35);
		Sarah.employeeAge(28);
		
		Daniel.employeeDesignation("Senior Software Engineer");
		Sarah.employeeDesignation("Junior Software Engineer");
		
		Daniel.employeeSalary(90000.00);
		Sarah.employeeSalary(60000.00);
		
		Daniel.printEmpRecords();
		Sarah.printEmpRecords();
			
		}	
}
