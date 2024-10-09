package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Write a java program to find the current date in DD-MM-YYYY format.
 */

public class Question_1 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = currentDate.format(formatter);
        System.out.println("Current Date: " + formattedDate);
    }
}
