package com.important.exception;

public class UncheckedException {

    public static void main(String[] args) {

        /**
         * ArithmeticException
         */
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }




        /**
         * NullPointerException
         */

        try{
            String s = null;
          int n =  s.length();
        }catch (NullPointerException e){
            e.printStackTrace();
        }


        /**
         * ArrayIndexOutOfBoundsException
         */
        try{
            int[] arr = new int[5];
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
}
