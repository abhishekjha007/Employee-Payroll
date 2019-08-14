
package employeepayroll;
import java.sql.*;
import javax.swing.JOptionPane;

public class db {
    
    Connection conn = null;
    public static Connection java_db()
    {
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false","root","root");
             return conn;
             
         }catch(ClassNotFoundException | SQLException e)
         {
             JOptionPane.showMessageDialog(null,e);
             return null;
         }
    }
    
}
