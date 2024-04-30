
package DataBase;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Legion 5 Pro
 */
public class JDBCUtil {
    public static Connection getConnection(){
        Connection c = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            String url = "jdbc:mySQL://localhost:3306/quanlidatve";
            String user = "root";
            String password = "";
            
            c = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        return c; 
    }
    
    public static void closeConnection(Connection c){
        try {
            if(c != null){
            c.close();
        }
        } catch (Exception e) {
        }
    }
}
