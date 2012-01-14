
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


 /**
 * Firma para buscar un evento
 * @param String nombre del evento
 * @return Evento
 */
 public Evento buscarEvento(String name);

  /**
 * Firma para agregar apuesta
 * @param nombre del evento, nombre de la categoria, nombre del competidor, posicion, apuesta, fecha actual, status, tipo de categoria
 * @return boolean indicando si se pudo realizar la apuesta
 */
public boolean agregarApuesta(String name, String categoryName, String nameCompetitor, int pos, int apuestaU, Date fechaActual, String status, String category_type);

/**
 * Firma para generar factura en formato pdf
 * @param nombre del evento, nombre de la categoria, nombre del competidor, posicion, apuesta, fecha actual, status, tipo de categoria
 * @return 
 */
public void PDF(String name,String nameCompetitor, String categoryName,int apuestaU);



}