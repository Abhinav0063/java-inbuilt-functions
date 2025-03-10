import java.util.Scanner;

public class TemperatureConverter {
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Convert to (C)elsius or (F)ahrenheit? (Enter C or F): ");
        char choice = scanner.next().toUpperCase().charAt(0);

        // Perform conversion and display result
        if (choice == 'C') {
            System.out.println("Converted Temperature: " + fahrenheitToCelsius(temperature) + "°C");
        } else if (choice == 'F') {
            System.out.println("Converted Temperature: " + celsiusToFahrenheit(temperature) + "°F");
        } else {
            System.out.println("Invalid choice! Please enter C or F.");
        }

        scanner.close();
    }
}
