package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.LocalDate;

/**
 * 3) Write a java program to create a Localdate object for today's date,
 * and then print the day, month and year separately
 */
public class Question_3 {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();

        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}
