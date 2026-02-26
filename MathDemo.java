public class MathDemo {

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            args[i] = args[i] * 2;
        }
        return total;
    }

    public static float mean(int[] args) {
        if (args.length == 0) {
            return 0; 
        }
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Min: " + min(10, 20));
        System.out.println("Max: " + max(10, 20));
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Mean: " + mean(numbers));
        System.out.println("Factorial of 5: " + factorial(5));
    }
}