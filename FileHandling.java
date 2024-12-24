<<<<<<< HEAD
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {

        File myFile = new File("Abdullah.txt");

        try{
            FileWriter fw = new FileWriter(myFile);
            fw.write("Anubhav ");
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
=======
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {

        File myFile = new File("Abdullah.txt");

        try{
            FileWriter fw = new FileWriter(myFile);
            fw.write("Anubhav ");
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
>>>>>>> 41df31b7c527e1524232906f5a130153adf541c1
