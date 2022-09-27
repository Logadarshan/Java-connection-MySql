
package cb19083;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class QueryFromdb {
    
      Connection conn;
      Statement stmt;
      ResultSet myRs;
      PreparedStatement pstmt;
      
      Scanner scan = new Scanner(System.in);
      
      void open()
    {
    
     if(conn == null)
        {
           
            try
            {
             
            String url = "jdbc:mysql://localhost:3307/cb19083?";
            String dbname = "cb19083";
            String driver = "com.mysql.jdbc.Driver";
            String username = "root";
            String password = " ";
            
            Class.forName(driver);
           this.conn = (Connection)DriverManager.getConnection(url+dbname,username,password);
           
                
                String strSelect;
                
                System.out.println("\n\nSelect query : "); 
                strSelect = scan.nextLine();
           
                System.out.println("\n\nThe SQL statement is: " + strSelect + "\n"); 
                
                stmt = conn.createStatement();
                myRs = stmt.executeQuery(strSelect);
              
             
             System.out.println("The records selected are:");
             System.out.println("cb19083id " + " " + "cb19083name " + "    " + "cb19083age " + "   " + "cb19083gender");
             int rowCount = 0;
             while(myRs.next())
             { 
            int cb19083id = myRs.getInt("cb19083id");
            String cb19083name = myRs.getString("cb19083name");
            String cb19083gender = myRs.getString("cb19083gender");
            int cb19083age   = myRs.getInt("cb19083age");
            
            System.out.println(cb19083id + "           " + cb19083name + "              " + cb19083gender + "            " +cb19083age);
            ++rowCount; 
             }
             
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
        }
      
        }
    
}
