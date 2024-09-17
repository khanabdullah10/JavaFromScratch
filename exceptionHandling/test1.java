package src.exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test1 {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        double n[] = {3.2, 3, 4, 6};
        int a = 4;
        double x = n[0]/(a - n[2]);

        System.out.println(x); /** infinity **/

        String str = "Scientech";
        System.out.println(str.charAt(9)); // StringIndexOutOfBoundsException

        Object obj = new Object();
        String st = (String)obj;
        System.out.println(st); // ClassCastException

        System.out.println("Hello");
        Object ob = null;
        System.out.println(ob.toString()); // NullPointerException

        System.out.println("Hello Java");
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(list[5]); //ArrayIndexOutOfBoundsException

        String s = "Java Programming";
        int aa = Integer.parseInt(str);
        System.out.println("Value of a: " +aa ); //NumberFormatException

        byte num;
        num = Byte.parseByte("Easy");
        System.out.println("num: " +num); //NumberFormatException

        for(int i = 1; i <= 5; i++)
            System.out.println("Value of i: " +i);

        Thread.sleep(1000);
        System.out.println("Hello Java"); //InterruptedException

        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file); //FileNotFoundException


        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
                int aaa = 20;
                int b = 0;
                int c = aaa / b;
                System.out.println(c);
            }
        } catch (ArithmeticException ae) {
        }


        System.out.println("111");
        try {
            System.out.println("222");
            double y = 1.0/0;
        }
        catch(ArithmeticException e)
        {
            try {
                System.out.println("Hello");
                int xk = 20/0;
            }
            catch(NullPointerException np)
            {
                System.out.println("333");
            }
        }
        System.out.println("444");





















    }


}