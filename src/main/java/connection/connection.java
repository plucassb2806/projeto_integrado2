

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;





public class connection {
    
    public Connection conectaBD(){
        Connection conn = null;
      
        try {
            String url = "jdbc:mysql://localhost:3306/projetobd?user=root&password=senha" ;
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "connection" + erro.getMessage());
        }
        return conn;
        
    }
}

        



 
