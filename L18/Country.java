package L18;

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