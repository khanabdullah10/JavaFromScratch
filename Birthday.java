//Write a program that takes a birthdate (eq 1994-11-31) and calculates the exact age in year, months and days using Period.
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");

        String birthDateString = scanner.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {

            LocalDate birthDate = LocalDate.parse(birthDateString, dateFormat);
            LocalDate currentDate = LocalDate.now();


            Period age = Period.between(birthDate, currentDate);

                       System.out.printf("You are %d years, %d months, and %d days old.%n",
                    age.getYears(), age.getMonths(), age.getDays());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }

          }
}
