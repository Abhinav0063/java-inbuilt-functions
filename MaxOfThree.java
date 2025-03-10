import java.util.Scanner;

public class MaxOfThree {
    // Method to find maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take three integer inputs
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Find and display maximum
        System.out.println("Maximum number: " + findMax(num1, num2, num3));

        scanner.close();
    }
}
