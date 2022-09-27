
package cb19083;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class InsertTodbclass {
    
     Connection conn;
     Statement stmt;
     ResultSet myRs;
     PreparedStatement pstmt;
    
    Scanner scan = new Scanner(System.in);
    
     void insertData()
   {
         int cb19083id,cb19083age;
         String cb19083name,cb19083gender,a;
         
         Scanner scan = new Scanner(System.in);
         
           System.out.println("Please enter id"); 
           cb19083id = scan.nextInt();
           a=scan.nextLine();
           System.out.println("Please enter name");
           cb19083name = scan.nextLine();
           System.out.println("Please enter gender"); 
           cb19083gender = scan.nextLine();
           System.out.println("Please enter age");
           cb19083age   = scan.nextInt();
           a=scan.nextLine();
           
           
           String SQL = "INSERT INTO cb19083users VALUES(?,?,?,?)";
           try
           {
            String url = "jdbc:mysql://localhost:3307/cb19083?";
            String dbname = "cb19083";
            String driver = "com.mysql.jdbc.Driver";
            String username = "root";
            String password = " ";
            
            Class.forName(driver);
           this.conn = (Connection)DriverManager.getConnection(url+dbname,username,password);
               
               pstmt = conn.prepareStatement(SQL);
               
               pstmt.setInt(1,cb19083id);
               pstmt.setString(2, cb19083name);
               pstmt.setString(3,cb19083gender);
               pstmt.setInt(4, cb19083age);
               
               pstmt.executeUpdate(); 
               
               
           }catch(Exception e)
           {
               e.printStackTrace();
           }
   }
    
    
}
