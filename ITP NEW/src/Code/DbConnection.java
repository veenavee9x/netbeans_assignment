package Code;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
 
    public static Connection connect() {
        
        Connection conn = null;
        
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dev","root","");
                      
        } 
        
        catch(Exception e) {
            
            System.out.println(e);
        
        }
                
        return conn;
        
    }
}
