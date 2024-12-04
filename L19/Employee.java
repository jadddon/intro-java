/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming: This program demonstrates the use of classes and objects to model real-world entities, such as an employee.
 * 2. Encapsulation: The Employee class encapsulates its data (name and salary) and provides methods to manipulate and access it.
 * 3. Constructors: The program showcases the use of constructors to initialize objects with specific data.
 * 4. Getter and Setter Methods: The Employee class provides getter and setter methods to access and modify the employee's name and salary.
 * 5. String Representation: The program demonstrates how to convert an object's information into a string representation using the toString() method.
 * 
 * This program defines an Employee class that encapsulates an employee's name and salary, providing methods to access and modify this data, as well as convert the employee's information to a string representation.
 */

package L19; // Package declaration

public class Employee {
    private String name; // Employee's name
    private double salary; // Employee's salary

    // Constructor to initialize an Employee object
    public Employee(String n, double s) {
        name = n; // Set the name of the employee
        salary = s; // Set the salary of the employee
    }

    // Method to return the name of the employee
    public String getName() {
        return name;
    }

    // Method to return the total compensation of the employee
    public double getTotalCompensation() {
        return salary;
    }

    // Method to set the salary of the employee
    public void setSalary(double s) {
        salary = s;
    }

    // Method to return a string representation of the employee
    public String toString() {
        return getName() + " - $" + getTotalCompensation();
    }
}