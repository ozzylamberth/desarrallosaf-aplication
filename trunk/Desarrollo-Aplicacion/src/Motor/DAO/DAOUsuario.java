/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor.DAO;

import Dominio.Usuario;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
//import java.util.logging.Logger;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Patricia
 */
public class DAOUsuario implements IDAOUsuario {

private final static Logger log = Logger.getLogger(DAOUsuario.class);
public String bd = "appdesa";
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

    public boolean agregarUsuario(String nombreUsuario, String apellidoUsuario, String nickUsuario, String sexo,String passwordUsuario,Date fechaNacimientoUsuario,int status) {
       try {
            conectar();
            osci =  (PreparedStatement) conn.prepareStatement("INSERT INTO usuario VALUES (?,?,?,?,?,?,?)");
            osci.setString(1, nombreUsuario);
            osci.setString(2, apellidoUsuario);
            osci.setString(3, nickUsuario);
            osci.setString(4, sexo);
            osci.setString(5, passwordUsuario);
            java.sql.Date fecha = new java.sql.Date(fechaNacimientoUsuario.getTime());//Cambio Fecha en formato SQL
            osci.setDate(6, fecha);
            osci.setInt(7, status);
            osci.executeUpdate();
            conn.close();
            log.info("Usuario Agregado con éxito");
            return true;
             }
     catch (SQLException ex) {
            //Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            log.error("Error agregando usuario");
            return false;
        }

    }

    public Usuario buscarUsuario(String nickName) {
        String nickUsuario =nickName;
        try {
            conectar();
            s = (Statement) conn.createStatement();
            ResultSet v = s.executeQuery("Select NOMBRE,APELLIDO,LOGIN,CI,PASSWORD from administrators WHERE LOGIN ='" + nickUsuario +"'");
            Usuario aux = new Usuario();
            while(v.next()) {
               aux.setNombreUsuario(v.getString(1));
               aux.setApellidoUsuario(v.getString(2));
               aux.setNickUsuario(v.getString(3));
               aux.setCi(v.getInt(4));
               aux.setPassword(v.getString(5));
          
                }
            return aux;
            }
         catch (SQLException ex) {
            log.error("Error en seleccion de usuario");
            return null;
           
        }
            
        
    }

    public boolean actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean borrarUsuario(String nickName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Usuario buscarUsuarioPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
