package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 7) Write a java program that takes date in string format (
 * eg: "2024-10-04") and parse this stringinto a LocalDate object and print the day of week.
 */
public class Question_7 {
    public static void main(String[] args) {
        String dateString = "2024-10-04";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println("Day of Week: " + date.getDayOfWeek());
    }
}
