import java.util.Scanner;

public class BasicCalculator {
    // Methods for arithmetic operations
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Select operation
        System.out.println("Choose operation: + (Addition), - (Subtraction), * (Multiplication), / (Division)");
        char operator = scanner.next().charAt(0);

        // Perform calculation
        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+': result = add(num1, num2); break;
            case '-': result = subtract(num1, num2); break;
            case '*': result = multiply(num1, num2); break;
            case '/': result = divide(num1, num2); break;
            default:
                System.out.println("Invalid operation! Please enter +, -, *, or /.");
                validOperation = false;
        }

        // Display result
        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
