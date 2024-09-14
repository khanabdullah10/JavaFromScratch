package src.exceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//  Write a Java program that reads a list of numbers from a file
//  and throws an exception if any of the numbers are positive.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Question4 {

    public static void NegativeNumberException(){
        throw new IllegalArgumentException("Only Negative number will bw read");
    }

    public static void ReadFile(String file) throws FileNotFoundException{
        File f = new File(file);
        Scanner s = new Scanner(file);
        int line;
        while(s.hasNextLine()){
             line = s.nextInt();
//            System.out.println(line);
        }
        

    }





    public static void main(String[] args) throws FileNotFoundException , IllegalArgumentException{

    }







}
