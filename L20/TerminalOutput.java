package L20;

public class TerminalOutput {
    public static void main(String[] args) {
        // Initialize two integer variables
        int x = 55;
        int y = 7;
        // Print the value of x
        System.out.print(x);
        // Print a space
        System.out.print(" ");
        // Print the value of y
        System.out.println(y);
        // Print the value of x and y using printf
        System.out.printf("%d %d\n",x,y);
        // Print the value of x and y to the error stream
        System.err.println(x + " " + y);
    }
}
