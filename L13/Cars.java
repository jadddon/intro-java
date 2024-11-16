package L13;

public class Cars {
    public static void main(String[] args) {
        // Create an instance of Car and print its initial state
        Car oldCar = new Car("Toyota", "Camry", 1999, "tan");
        System.out.println(oldCar);
        
        // Change the car's color and accelerate it twice
        oldCar.paint("red");
        oldCar.accelerate(100);
        oldCar.accelerate(100);
        
        // Print the car's state after modifications
        System.out.println(oldCar);
        
        // Print a separator line for output
        System.out.println("-----");
        
        // Create an array of Cars and initialize it with different cars
        Car[] c = new Car[4];
        c[0] = oldCar;
        c[1] = new Car("Subaru", "Legacy", 2012, "red");
        c[2] = new Car("Tesla", "Model Y", 2022, "blue");
        c[3] = new Car("Honda", "Civic", 2018, "white");
        
        // Print each car in the array
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        
        // Print another separator line for output
        System.out.println("-----");
        
        // Change the color of the last car in the array
        c[3].paint("grey");
        
        // Print each car in the array again to show the change
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}