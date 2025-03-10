import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two dates
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String firstInput = scanner.nextLine();
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondInput = scanner.nextLine();

        // Parse the dates
        LocalDate firstDate = LocalDate.parse(firstInput);
        LocalDate secondDate = LocalDate.parse(secondInput);

        // Compare the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is BEFORE the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is AFTER the second date.");
        } else {
            System.out.println("Both dates are the SAME.");
        }

        scanner.close();
    }
}
