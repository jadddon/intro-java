package L20;

public class MeasureTest {
    public static void main(String[] args) {
        // Create a Cup object and fill it with 12 ounces of liquid
        Cup c = new Cup();
        c.fill(12);
        // Print the contents of the cup
        System.out.println(c.getContents());
        // Print the measurement of the cup (same as contents)
        System.out.println(c.measure());
        // Create a Measurable reference and assign it to the Cup object
        Measurable m;
        m = c;
        // Print the measurement of the Measurable object (same as Cup)
        System.out.println(m.measure());
        // This line is commented out because getContents is not declared in Measurable
        //System.out.println(m.getContents());
        // Print the string representation of the Measurable object
        System.out.println(m);
        // Create a Duck object with name "Maurice" and weight 10 pounds
        Duck d = new Duck("Maurice",10);
        // Print the measurement of the Duck (same as weight)
        System.out.println(d.measure());
        // Make the Duck quack
        d.quack();
        // Print the string representation of the Duck
        System.out.println(d);
        // Assign the Measurable reference to the Duck object
        m = d;
        // Print the string representation of the Measurable object (now a Duck)
        System.out.println(m);
        // Print the measurement of the Measurable object (now a Duck)
        System.out.println(m.measure());
        // Create an array of Measurable objects
        Measurable[] things = new Measurable[3];
        // Populate the array with a Duck, a Cup, and another Duck
        things[0] = d;
        things[1] = c;
        things[2] = new Duck("Sean",2);
        // Iterate through the array and print each Measurable object
        for(Measurable thing: things) {
            System.out.println(thing);
        }
        // Print the average measurement of all Measurable objects in the array
        System.out.println(average(things));
    }
    // Method to calculate the average measurement of an array of Measurable objects
    public static double average(Measurable[] x) {
        double sum = 0.0; // Initialize sum to 0.0
        // Iterate through the array and add each measurement to the sum
        for(Measurable i : x) {
            sum += i.measure();
        }
        // Return the average measurement
        return sum/x.length;
    }

}