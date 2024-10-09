package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 6) Write a java program that
 * formats the current LocalDateTime into the format dd-MM-yyyy HH:mm:ss using dateTimeFormatter.
 */

public class Question_6 {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = currentDateTime.format(formatter);
        System.out.println("Current Date and Time: " + formattedDate);
    }
}
