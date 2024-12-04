package L19; // Package declaration

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming: This program demonstrates the use of classes and objects to model real-world entities, such as an employee.
 * 2. Encapsulation: The Employee class encapsulates its data (name and salary) and provides methods to manipulate and access it.
 * 3. Constructors: The program showcases the use of constructors to initialize objects with specific data.
 * 4. Getter and Setter Methods: The Employee class provides getter and setter methods to access and modify the employee's name and salary.
 * 5. String Representation: The program demonstrates how to convert an object's information into a string representation using the toString() method.
 * 
 * This program tests the Employee class by creating an Employee object, accessing and modifying its properties, and printing its information to the console.
 */

public class EmployeeTester {
    public static void main(String[] args) {
        // Create an Employee object with name "Jack" and salary 60000
        Employee e = new Employee("Jack",60000);
        // Print the name of the employee
        System.out.println(e.getName());
        // Print the total compensation of the employee
        System.out.println(e.getTotalCompensation());
        // Set the salary of the employee to 72000
        e.setSalary(72000);
        // Print the total compensation of the employee after salary change
        System.out.println(e.getTotalCompensation());
        // Print a string representation of the employee
        System.out.println(e);
    }
}
