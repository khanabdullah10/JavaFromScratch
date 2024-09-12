package src.assignment_4;
import java.util.*;

public class Garments {

    private int gCode;
    private String gType;
    private int gSize;
    private String gFabric;
    private float gPrice;


    public Garments() {
        this.gCode = 0;
        this.gType = "Not Allowed";
        this.gSize = 0;
        this.gFabric = "Not Allowed";
        this.gPrice = 0;
    }

    void assign(){
        if(this.gFabric.equalsIgnoreCase("Cotton")) {
            if(this.gType.equalsIgnoreCase("Trouser")) this.gPrice = 1300;
            else if (this.gType.equalsIgnoreCase("Shirt")) this.gPrice = 1100;
        } else if (this.gType.equalsIgnoreCase("Trouser")) this.gPrice = (float) (1300 * 0.9);
        else if (this.gType.equalsIgnoreCase("Shirt")) this.gPrice = (float) (1100 * 0.9);
    }


      void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the G Code : ");
        gCode = sc.nextInt();
        System.out.println("Enter the G Type : ");
        gType = sc.nextLine();
         System.out.println("Enter the G size : ");
        gSize = sc.nextInt();
         System.out.println("Enter the G Fabric : ");
        gFabric = sc.nextLine();

        assign();

    }

    void display(){
        System.out.println("G code : " + this.gCode);
        System.out.println("G Type : " + this.gType);
        System.out.println("G size : " + this.gSize);
        System.out.println("G fabric : " + this.gFabric);
        System.out.println("G price: " + this.gPrice);

    }


    public static void main(String[] args) {

        Garments garments = new Garments();
        garments.input();
        garments.display();

    }


}
