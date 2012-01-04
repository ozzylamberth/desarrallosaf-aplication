/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor.DAO;

import Dominio.Usuario;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Patricia
 */
public class DAOUsuario implements IDAOUsuario {

public String bd = "PruebaJava";
public String login = "root";
public String password = "";
public String url = "jdbc:mysql://localhost/"+bd;


public void conectar() {

Connection conn = null;
try {
    Class.forName("org.gjt.mm.mysql.Driver");
    conn = DriverManager.getConnection(url, login, password);
        if (conn != null){
            System.out.println("Conexión a base de datos "+url+" ... Ok");
            conn.close();
        }
    }
catch(SQLException ex) {
    System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
    }
catch(ClassNotFoundException ex) {
    System.out.println(ex);
    }
    }

    public boolean agregarUsuario(String nombreJugador, String apellidoJugador, String nickJugador, String pathAvatarJugador, java.util.Date fechaNacimientoJugador, String passwordJugador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Usuario buscarUsuario(String nickName) {
        throw new UnsupportedOperationException("Not supported yet.");
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
