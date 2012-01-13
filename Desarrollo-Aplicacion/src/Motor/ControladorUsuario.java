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

    
  /**
 * Firma para crear un Usuario en archivo
 * @param nombre,apellido,nick,patthAvatar,fechaNacimiento,password
 * @return boolean indicando si lo pudo crear
 */
    public static boolean crearUsuario(String nombre,String apellido,String nickname,String sexo, String password,java.util.Date fechan,int status) throws CreateUserException
     
    {

        boolean resultado = false;
        Usuario comprobar = new Usuario();
        comprobar = ControladorUsuario.buscarUsuario(nickname);
        if (comprobar.getNombreUsuario() == null)
        {
             
            resultado = miMotor.crearUsuario(nombre,apellido,nickname,sexo,password,fechan,status);
            
        }

        
        return resultado;

 }

    /**
     *  firma para actualizar un cliente en el sistema
     * @param cedula cedula del cliente
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param Fecha fecha de nacimiento del cliente
     * @return valor booleano con la condicion de exito
     */
    public static boolean actualizarUsuario(String nickname, String nombre, String apellido,Date fechan,String avatar,String password) {
        boolean resultado = false;
        Usuario usuarioAct = new Usuario();
        usuarioAct.setNombreUsuario(nombre);
        usuarioAct.setApellidoUsuario(apellido);
        usuarioAct.setFechaNacimientoUsuario(fechan);
        resultado = manejadorPersistencia.actualizarUsuario(usuarioAct);
        return resultado;
    }

    /**
     * firma para eliminar un cliente del sistema
     * @param cedula cedula del cliente a eliminar
     * @return valor booleano con la condicion de exito
     */
    public static boolean eliminarUsuario(String nickname, String password) {
        boolean resultado = false;
        resultado = miMotor.eliminarUsuario(nickname, password);
        return resultado;
    }

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
