/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

import Dominio.Evento;
import Interface.CreateUserException;
import Interface.InterfaceEnlace;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import Motor.DAO.DAOUsuario;
import Motor.DAO.DaoEventoXML;
import java.util.ArrayList;
import org.apache.log4j.Logger;



import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Patricia
 */
public class MotorImplementacion implements InterfaceEnlace {

    private static DAOUsuario manejadorPersistencia = new DAOUsuario();
    private static DaoEventoXML manejadorPersistenciaEvento = new DaoEventoXML();
    
     

    public String ObtenerApellidoUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean crearUsuario(String nombreUsuario, String apellidoUsuario, String nickUsuario, String sexo,  String passwordUsuario,Date fechaNacimientoUsuario,int status) throws CreateUserException
    
    {
        boolean resultado;
        resultado = manejadorPersistencia.agregarUsuario(nombreUsuario, apellidoUsuario, nickUsuario, sexo, passwordUsuario,fechaNacimientoUsuario,status);

        if (resultado) {
            return true;
        }
        else

            return false;

     }

    public boolean eliminarUsuario(String NickUsuario, String Password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String obtenerFechaNacimientoUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Collection<String> obtenerListaNickUsuarioes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String obtenerNickUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String obtenerNombreUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String obtenerSexoUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<Evento> todosLosEventos() {
          ArrayList<Evento> eventos = this.manejadorPersistenciaEvento.todosLosEventos();
          return eventos;
    }

 public Evento buscarEvento(String name){
     Evento evento = new Evento ();
     evento = this.manejadorPersistenciaEvento.buscarEvento(name);
     return evento;
 }

}
