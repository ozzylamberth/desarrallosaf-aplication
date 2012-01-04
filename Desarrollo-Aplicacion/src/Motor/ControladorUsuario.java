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

/**
 *
 * @author Patricia Figueira 
 */

/** Clase que controla el registro de usuario en XML*/
public class ControladorUsuario {

    /** atributo para el manejo de la persistencia de cliente*/
   private static DAOUsuario manejadorPersistencia = new DAOUsuario();
    /** atributo para el manejo del motor*/
    private static InterfaceEnlace miMotor = (InterfaceEnlace) Motor.getMotorImplementacion();

    
  /**
 * Firma para crear un Usuario en archivo
 * @param nombre,apellido,nick,patthAvatar,fechaNacimiento,password
 * @return boolean indicando si lo pudo crear
 */
    public static boolean crearUsuario(String nombreUsuario,String apellidoUsuario,String nickUsuario,String sexoUsuario,Date fechaNacimientoUsuario, String passwordUsuario) throws CreateUserException
    {
        boolean resultado = false;
        Usuario comprobar =null;
        comprobar = ControladorUsuario.buscarUsuario(nickUsuario);
        if (comprobar == null)
        {
            resultado = miMotor.crearUsuario(nombreUsuario,apellidoUsuario,nickUsuario,sexoUsuario,fechaNacimientoUsuario,passwordUsuario);
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
    public static boolean actualizarUsuario(String nickname, String nombre, String apellido,Date fecha,String avatar,String password) {
        boolean resultado = false;
        Usuario usuarioAct = new Usuario();
        usuarioAct.setNombreUsuario(nombre);
        usuarioAct.setApellidoUsuario(apellido);
        usuarioAct.setFechaNacimientoUsuario(fecha);
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
         manejadorPersistencia.conectar();
         resultado = manejadorPersistencia.buscarUsuario(nickname);
         return resultado;

}

 

}
