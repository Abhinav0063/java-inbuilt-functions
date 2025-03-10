import java.util.Scanner;

public class FibonacciGenerator {
    // Method to generate Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: " + first + ", " + second);
        for (int i = 2; i < terms; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the number of Fibonacci terms: ");
        int terms = scanner.nextInt();

        if (terms < 2) {
            System.out.println("Enter a number greater than or equal to 2.");
        } else {
            generateFibonacci(terms);
        }

        scanner.close();
    }
}
