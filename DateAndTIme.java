package src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Write a java program that formats the current LocalDateTime into the format dd-MM-yyyy HH:mm:ss using dateTimeFormatter.
public class DateAndTIme {
    public static void main(String[] args)
    {
        LocalDateTime localDateTime=LocalDateTime.now();
        //System.out.println(localDateTime);
        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("dd-MM-yyyy   HH:mm:ss");
        String fd=localDateTime.format(t1);
        System.out.println(fd);
    }

}
