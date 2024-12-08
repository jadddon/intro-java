package hw10;

public class Problem1 {
    
    public static int pow(int x, int n) {
        // Base case: if n is 0, x^0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: x^n = x * x^(n-1)
        return x * pow(x, n - 1);
    }

    public static void main(String[] args) {
        // Testing the pow method with different values of x and n
        System.out.println(pow(2, 3)); // 8
        System.out.println(pow(3, 2)); // 9
        System.out.println(pow(5, 0)); // 1
        System.out.println(pow(4, 4)); // 256
    }
}
