package src;//Write a java program to find the current date in DD-MM-YYYY format.
import java.time.*;
import java.time.format.DateTimeFormatter;
public class CurrentDate {
    public static void main(String[] args) {

        LocalDate t = LocalDate.now();
        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       String fd=t.format(t1);
        System.out.println(fd);
    }
}
