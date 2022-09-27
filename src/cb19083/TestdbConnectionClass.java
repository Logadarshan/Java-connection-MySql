
package cb19083;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestdbConnectionClass {
    
    public Connection conn;
    public Statement statement;
    
    public Connection openConnection()
    {
        if(conn == null)
        {
            String url = "jdbc:mysql://localhost:3307/cb19083?";
            String dbname = "cb19083";
            String driver = "com.mysql.jdbc.Driver";
            String username = "root";
            String password = " ";
            
            try
            {
               Class.forName(driver);
               this.conn = (Connection)DriverManager.getConnection(url+dbname,username,password);
     
               
            }
            catch (ClassNotFoundException | SQLException sqle)
            {
                
            }
        }
        return conn;
    }
    
    
}
