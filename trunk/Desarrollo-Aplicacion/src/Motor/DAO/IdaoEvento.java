/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor.DAO;

import Dominio.Evento;
import Dominio.ListaEventos;
import java.util.ArrayList;

/**
 *
 * @author RS
 */
public interface IdaoEvento {




    /**
     * firma para buscar un Evento
     * @param name nombre del Evento a buscar
     * @return objeto Evento con sus datos segun busqueda
     */
    public Evento buscarEvento(String name);

   
    /**
     * firma para obtener todos los eventos del XML
     * @return ArrayList con todos los objetos eventos
     */
    public ArrayList<Evento> todosLosEventos();
}
