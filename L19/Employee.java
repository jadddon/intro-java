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