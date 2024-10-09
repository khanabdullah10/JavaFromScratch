package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.LocalDate;
import java.time.Period;

/**
 * 4) Write a program that takes a birthdate (eq 1994-11-31)
 * and calculates the exact age in year, months and days using Period.
 */
public class Question_4 {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2001, 05, 29);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);
        System.out.println("Age: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}
