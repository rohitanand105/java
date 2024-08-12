package jdbc;

import java.sql.*;


public class insert {
    public static void main(String args[]) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
        
        PreparedStatement ps = con.prepareStatement("insert into register values('rohit', 'rohit@gmail.com', 'male', 'chandigarh')");
        int i = ps.executeUpdate();
        if(i> 0){
            System.out.println("success");
        }
        else
        {
            System.out.println("failed");
        }

    

        
    }
}
