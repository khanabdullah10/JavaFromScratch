package src.java_8.dateAndTimeAPI.practiceQuestion;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Write a java program to calculate the Duration
 * between two LocalTime objects(eg : between 12:30 and 15:00)
 */

public class Question_9 {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(12, 30, 0);
        LocalTime time2 = LocalTime.of(15, 0, 0);

        Duration duration = Duration.between(time1, time2);

        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.toSeconds() % 60;

        System.out.println("Duration is " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");
    }
}
