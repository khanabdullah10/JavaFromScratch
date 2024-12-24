package com.important.exception;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedException {
    public static void main(String[] args) {

        /**
         * FileNotFoundException
         */

        try{
            FileReader fr = new FileReader(new File("doesNotExist"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * ClassNotFoundException
         */
        try{
            Class.forName("NoClass");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        /**
         * SQLException
         */
        try{
            Connection con = DriverManager.getConnection("jdbc:invalid-url", "user", "pass");
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

}
