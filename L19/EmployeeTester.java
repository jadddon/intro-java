package L19; // Package declaration

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
