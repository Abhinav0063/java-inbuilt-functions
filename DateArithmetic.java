import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the date
        LocalDate date = LocalDate.parse(inputDate);

        // Perform date arithmetic
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        // Define format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Display results
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("Modified Date: " + modifiedDate.format(formatter));

        scanner.close();
    }
}
