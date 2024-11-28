package L20;

public class Duck implements Measurable {
    // Instance variables
    private String name;
    private double weight;

    // Constructor
    public Duck(String n, double w) {
        name = n;
        weight = w;
    }

    // Getter methods
    public double getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }

    // Quack method
    public void quack() {
        System.out.println("Quack!");
    }

    // toString method
    public String toString() {
        return getName() + ": " + getWeight() + "lbs";
    }

    // Measure method (required by Measurable interface)
    public double measure() {
        return getWeight();
    }
}
