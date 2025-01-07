package com.DurgaSoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) throws Exception {

        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle://localhost:3306/employeeDB","root","root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Employee");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getDouble(4));
        }

    }

}
