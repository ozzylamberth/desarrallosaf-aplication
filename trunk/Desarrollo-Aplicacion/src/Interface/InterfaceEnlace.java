
package Interface;

import Dominio.Evento;
import Dominio.Usuario;
import java.util.*;

/**
 *Interfaz de Comunicacion para el proyecto IBattle
 * @author Patricia Figueira
 */
public interface InterfaceEnlace
{
    /**
 * Firma para obtener todos los eventos
 * @param
 * @return ArrayList con todos los eventos
 */
 public ArrayList<Evento> todosLosEventos();


 public Evento buscarEvento(String name);

/** Firma para crear un Usuario nuevo
 * @param nombre, apellido, sexo, nick, password, fecha de nacimiento del usuario
 * @return boolean inidicando si se pudo agregar o no el juegador en el motor
*/
 public boolean crearUsuario(String nombreUsuario,String apellidoUsuario,String nickUsuario,String sexo,String passwordUsuario,Date fechaNacimientoUsuario,int status)
 throws CreateUserException;
   
/**
 * Firma para eliminar un Usuario existente
 * @param nick y password del Usuario a eliminar
 * @return boolean indicando si se pudo eliminar o no al Usuario en el motor
 */
 public boolean eliminarUsuario(String NickUsuario, String Password);

 /**
 * Firma para obtener el nombre del Usuario
 * @param String inidicando el Usuario del cual se quiere obtener el nombre
 * @return String con el nombre del Usuario
  */
public String obtenerNombreUsuario(String player);

/**
 * Firma para obtener el apellido del un Usuario
 * @param String inidicando el Usuario del cual se quiere obtener el apellido
 * @return String con el apellido del Usuario
 * NOTA: Para el parametro se asumen como validas solo las siguientes cadenas:
 * "player1":Usuario1
 * "player2":Usuario2
  */
public String ObtenerApellidoUsuario(String player);

/**
 * Firma para obtener el nick del Usuario
 * @param String inidicando el juegador del cual se quiere obtener el nick
 * @return String con el nick del Usuario
*/
public String obtenerNickUsuario(String player);

/**
 * Firma para obtener la fecha de nacimiento de un Usuario
 * @param String indicando el Usuario del cual se quiere obtener la fecha de Nacimiento
 * @return String con la fecha de nacimiento del Usuario
*/
public String obtenerFechaNacimientoUsuario(String player);

/**
 * Firma para obtener el path del avatar de un juegador
 * @param String inidcando el Usuario del cual se quiere obtener el nick
 * @return String con el path del avatar del Usuario
 * NOTA: Para el parametro se asumen como validas solo las siguientes cadenas:
 * "player1":Usuario1
 * "player2":Usuario2
 */
public String obtenerSexoUsuario(String player);


/**
 * Firma para obtener la lista de todos los nicks registrados 
 * @param
 * @return Collection de String con los nick
 */
public Collection <String> obtenerListaNickUsuarioes();



}