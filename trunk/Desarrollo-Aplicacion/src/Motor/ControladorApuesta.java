/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

import Interface.InterfaceEnlace;
import Interface.Motor;
import Motor.DAO.DAOUsuario;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;
/**
 *
 * @author Patricia
 */
public class ControladorApuesta {

    /** atributo para el manejo de log4j*/
   private final static Logger log = Logger.getLogger(ControladorApuesta.class);
   /** atributo para el manejo de la persistencia de cliente*/
   private static DAOUsuario manejadorPersistencia = new DAOUsuario();
   /** atributo para el manejo del motor*/
   private static InterfaceEnlace miMotor = (InterfaceEnlace) Motor.getMotorImplementacion();
   /** atributo para conocer el usuario que actualmente hace apuestas*/
   private static String nickUsuarioActual;

}
