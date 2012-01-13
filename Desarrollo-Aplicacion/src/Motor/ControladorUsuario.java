/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

import Dominio.Usuario;
import Interface.CreateUserException;
import Interface.InterfaceEnlace;
import Interface.Motor;
import Motor.DAO.DAOUsuario;
import java.util.ArrayList;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author Patricia Figueira 
 */

/** Clase que controla el registro de usuario en XML*/
public class ControladorUsuario {
    /** atributo para el manejo de log4j*/
    private final static Logger log = Logger.getLogger(ControladorUsuario.class);
   /** atributo para el manejo de la persistencia de cliente*/
   private static DAOUsuario manejadorPersistencia = new DAOUsuario();
    /** atributo para el manejo del motor*/
    private static InterfaceEnlace miMotor = Motor.getMotorImplementacion();



    /*
     * firma para buscar un cliente en el sistema
     * @param cedula cedula del cliente a buscar
     * @return objeto cliente con los datos
     *
     */
     
    public static Usuario buscarUsuario(String nickname)
{
         Usuario resultado = null;
         resultado = manejadorPersistencia.buscarUsuario(nickname);
         if (resultado.getNombreUsuario() == null ){
         return resultado;
         }
        else{
             return resultado;
        }

}
}
