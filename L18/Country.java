package L18;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming: This program demonstrates the use of classes and objects to model real-world entities, such as a country.
 * 2. Encapsulation: The Country class encapsulates its data (name, population, and area) and provides methods to manipulate and access it.
 * 3. Comparable Interface: The Country class implements the Comparable interface, allowing for comparison and sorting of Country objects.
 * 
 * This program defines a Country class that encapsulates a country's name, population, and area, providing methods to access and compare this data, as well as convert the country's information to a string representation.
 */

// Class Country represents a country with its name, population, and area
public class Country implements Comparable<Country> {
    private String name; // Name of the country
    private int population; // Population of the country
    private int area; // Area of the country in square miles

    // Constructor to initialize a Country object
    public Country(String n, int p, int a) {
        name = n; // Set the name of the country
        population = p; // Set the population of the country
        area = a; // Set the area of the country
    }

    // Method to return a string representation of the country
    public String toString() {
        return name + " - pop: " + population + " area: " + area + "sq miles";
    }

    // Method to compare two Country objects based on their area
    public int compareTo(Country other) {
        // Compare the area of this country with the area of the other country
        //return name.compareTo(other.name); // Compare by name
        //return population - other.population; // Compare by population
        return area - other.area; // Compare by area
    }
}