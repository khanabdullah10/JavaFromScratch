package src.assignment_4;
import java.util.*;
public class SUPPLY {



    private int Code;

    private String FoodName;

    private String Sticker;

    private String FoodType;



    public void GetType() {

        if (Sticker.equalsIgnoreCase("Green")) {

            FoodType = "Vegetarian";

        } else if (Sticker.equalsIgnoreCase("Yellow")) {

            FoodType = "Contains Egg";

        } else if (Sticker.equalsIgnoreCase("Red")) {

            FoodType = "Non-Vegetarian";

        } else {

            FoodType = "Unknown";

        }

    }



    public void FoodIn() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Code: ");

        Code = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Food Name: ");

        FoodName = scanner.nextLine();

        System.out.print("Enter Sticker Color (Green, Yellow, Red): ");

        Sticker = scanner.nextLine();



        GetType();

    }



    public void FoodOut() {

        System.out.println("Code: " + Code);

        System.out.println("Food Name: " + FoodName);

        System.out.println("Sticker: " + Sticker);

        System.out.println("Food Type: " + FoodType);

    }



    public static void main(String[] args) {

        SUPPLY supply = new SUPPLY();

        supply.FoodIn();

        supply.FoodOut();

    }

}
