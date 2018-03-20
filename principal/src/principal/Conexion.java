
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author alumno
 */
public class Conexion {
       String  jdbc_drive = "com.mysql.jdbc.Drive";
       String jdbc_url="jdbc:msql://locathost:3306/";
       String jdbc_user="root";
       String jdbc_pass="";
    public Conexion() {
        try {
              String Query;
              Query ="select * from peliculas";
              Class.forName("jdbc_driver");
              Connection cnn=DriverManager.getConnection(jdbc_url, jdbc_user, jdbc_pass) ;
              PreparedStatement ps = cnn.prepareStatement(Query);
              cnn.prepareStatement(jdbc_url);
            
              ResultSet rs = ps.executeQuery();
               while(rs.next()){
                   System.out.println(rs.getString(0));
             }
        } catch (Exception e) {
        }
       
   
        }
    
    
    
}
