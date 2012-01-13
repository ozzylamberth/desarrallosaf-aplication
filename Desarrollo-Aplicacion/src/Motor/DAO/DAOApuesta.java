/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor.DAO;

//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.logging.Logger;
import java.util.Date;
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JOptionPane;


/**
 *
 * @author Patricia
 */
public class DAOApuesta implements IDAOApuesta {
    
private final static Logger log = Logger.getLogger(DAOUsuario.class);
public String bd = "appDesa";
public String login = "root";
public String password = "";
public String url = "jdbc:mysql://localhost/"+bd;
public Connection conn = null;
PreparedStatement osci= null;
Statement s;

    public void conectar() {


try {
    System.out.println(this);
    Class.forName("org.gjt.mm.mysql.Driver");
    conn = DriverManager.getConnection(url, login, password);
    System.out.println(conn);
        if (conn != null){
            log.info("Conexión con Base de Datos exitosa");
            System.out.println("Conexión a base de datos "+url+" ... Ok");
            //conn.close();
        }
    }
catch(SQLException ex) {
    log.error("No se pudo establecer conexión con la base de datos");
    System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
    }
catch(ClassNotFoundException ex) {
    log.error("No se pudo establecer conexión con la base de datos");
    System.out.println(ex);
    }
    }

    public boolean agregarApuesta(String eventName,String categoryName,String competitor,int position,int apuestaU,Date fechaApuesta,String status, String categoryType){
       int b=0;
        try {
            conectar();
            osci =  conn.prepareStatement("INSERT INTO gambles VALUES (null,?,?,?,?,?,?,?,?)");
            osci.setString(1, eventName);
            osci.setString(2, categoryName);
            osci.setString(3, competitor);
            osci.setInt(4, position);
            osci.setInt(5, apuestaU);
            java.sql.Date fecha = new java.sql.Date(fechaApuesta.getTime());//Cambio Fecha en formato SQL
            osci.setDate(6, fecha);
            osci.setString(7, status);
            osci.setString(8, categoryType);
            b =osci.executeUpdate();
            System.out.println(b);
            conn.close();
            log.info("Apuesta Agregada con éxito");
            System.out.println("Entre");
            return true;
             }
     catch (SQLException ex) {
         System.out.println(ex);
           log.error("Error agregando Apuesta",ex);
            return false;
        }

    }



}
