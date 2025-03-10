import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
        // Define time zones
        ZoneId gmt = ZoneId.of("GMT");
        ZoneId ist = ZoneId.of("Asia/Kolkata"); // IST
        ZoneId pst = ZoneId.of("America/Los_Angeles"); // PST

        // Get current time in each zone
        ZonedDateTime gmtTime = ZonedDateTime.now(gmt);
        ZonedDateTime istTime = ZonedDateTime.now(ist);
        ZonedDateTime pstTime = ZonedDateTime.now(pst);

        // Define a time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Display results
        System.out.println("🌍 Current Time in Different Time Zones:");
        System.out.println("GMT  ➤ " + gmtTime.format(formatter));
        System.out.println("IST  ➤ " + istTime.format(formatter));
        System.out.println("PST  ➤ " + pstTime.format(formatter));
    }
}
