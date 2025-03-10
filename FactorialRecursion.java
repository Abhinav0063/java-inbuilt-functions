import java.util.Scanner;

public class FactorialRecursion {
    // Recursive method to calculate factorial
    public static long factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Compute and display factorial
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }

        scanner.close();
    }
}
