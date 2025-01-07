package jdbc;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {
        Connection con =null;
        Statement st = null;
        ResultSet rs = null;

        try{

            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root";
            String pw = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("...Connecting to database...");

            con = DriverManager.getConnection(url,user,pw);

            st = con.createStatement();
            String sql = "select id,name,department,salary from employees";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getDouble(4));
            }



        }catch (SQLException s) {
            s.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                rs.close();
                st.close();
                con.close();
                System.out.println("........Connection closed........");
            }catch (SQLException s){
                s.printStackTrace();
            }
        }
        System.out.println("Good Bye !");






    }


}
