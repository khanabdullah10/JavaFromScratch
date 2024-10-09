package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

/**
 * 10) Write a java program that list all Mondays in a given month.
 */

public class Question_10 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 10;

        YearMonth yearMonth = YearMonth.of(year, month);
        int firstDayOfMonth = yearMonth.atDay(1).getDayOfWeek().getValue();
        int firstMonday = 8 - firstDayOfMonth;
        if (firstMonday > 7) {
            firstMonday -= 7;
        }

        List<LocalDate> mondays = new ArrayList<>();
        for (int i = firstMonday; i <= yearMonth.lengthOfMonth(); i += 7) {
            mondays.add(LocalDate.of(year, month, i));
        }

        System.out.println("Mondays in " + yearMonth + ":");
        for (LocalDate monday : mondays) {
            System.out.println(monday);
        }
    }
}
