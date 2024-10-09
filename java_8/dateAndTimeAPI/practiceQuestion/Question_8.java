package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 8) Write a java program that takes todays date and calculate the date of next Tuesday.
 */
public class Question_8 {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate nextTuesday = currentDate.with(DayOfWeek.TUESDAY);
        if (nextTuesday.isBefore(currentDate)) {
            nextTuesday = nextTuesday.plusWeeks(1);
        }
        System.out.println("Next Tuesday: " + nextTuesday);
    }

}
