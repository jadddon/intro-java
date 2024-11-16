package L13;

public class CommandLine {
    public static void main(String[] args) {
        // Print the number of command line arguments
        System.out.println(args.length);
        // Loop through each argument and print it
        for(int i=0;i<args.length;i++) {
            System.out.println(args[i]);
        }
    }
}