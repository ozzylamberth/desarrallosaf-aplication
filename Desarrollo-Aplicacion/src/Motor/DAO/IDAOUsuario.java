/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor.DAO;

import Dominio.Usuario;
import java.util.Date;

/**
 *
 * @author Patricia
 */
public interface IDAOUsuario {

/** Firma para crear un Usuario nuevo en Base de datos
 * @param nombre, apellido, sexo, nick, password, fecha de nacimiento del usuario
 * @return boolean inidicando si se pudo agregar o no el usuario en el motor
*/
public boolean agregarUsuario(String nombreUsuario,String apellidoUsuario,String nickUsuario,String sexo, String passwordUsuario, Date fechaNacimientoUsuario,int status);

/** Firma para Buscar un Usuario en Base de Datos
 * @param nombre, apellido, sexo, nick, password, fecha de nacimiento del usuario
 * @return objeto de tipo Usuario siendo nulo si no se encuentra
*/
public Usuario buscarUsuario(String nickName) ;




}
