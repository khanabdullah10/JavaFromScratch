package src.java_8.dateAndTimeAPI;

/**
 * before java8 date,calender, time was not convenient and upTo the mark with respect to performance
 * joda.org people introduced DateAndTime Api also known as joda Date&time API
 */

import java.time.*;
public class Demo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);

        int dd = date.getDayOfMonth();
        System.out.println(dd);
        int mm = date.getMonthValue();
        System.out.println(mm);
        int a = date.getDayOfYear();
        System.out.println(a);
        DayOfWeek b = date.getDayOfWeek();
        System.out.println(b);
        System.out.println(date.getYear());




    }
}
