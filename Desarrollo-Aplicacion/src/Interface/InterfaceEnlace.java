
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

 
public boolean agregarApuesta(String name, String categoryName, String nameCompetitor, int pos, int apuestaU, Date fechaActual, String status, String category_type);





}