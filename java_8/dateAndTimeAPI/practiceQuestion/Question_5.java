package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *5) Convert the date and time from default zone to another time zone (eg : America/New York)
 */
public class Question_5 {
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now();
        ZoneId zoneId = ZoneId.of("America/New_York");

        ZonedDateTime zdtNewYork = zdt.withZoneSameInstant(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = zdtNewYork.format(formatter);
        System.out.println("Date and Time in New York: " + formattedDate);
    }

}
