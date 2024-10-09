package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.LocalDate;

/**
 * 2) Write a java program to find whether the current year is a leap year.
 */

public class Question_2 {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
//        boolean isLeapYear = currentDate.isLeapYear();
        System.out.println("Is current year a leap year? " + currentDate.isLeapYear());
    }
}
