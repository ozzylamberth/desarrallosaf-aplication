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
     * firma para agregar un Evento nuevo
     * @param Evento objeto Evento agregar
     * @return valor boleano con la condicion de exito
     */
    public ListaEventos DaoEventoXML();

    /**
     * firma para buscar un Evento
     * @param name nombre del Evento a buscar
     * @return objeto Evento con sus datos segun busqueda
     */
    public Evento buscarEvento(String name);

    /**
     * firma para actualizar un Evento
     * @param Evento objeto Evento a actualizar
     * @return valor boleano con la condicion de exito
     */
    public boolean actualizarEvento(Evento evento);

    /**
     * firma para borrar un Evento
     * @param name nombre  del Evento a borrar
     * @return valor boleano con la condicion de exito
     */
    public boolean borrarEvento(String name);

    /**
     * firma para obtener todos los eventos
     * @return ArrayList con todos los objetos eventos
     */
    public ListaEventos todosLosEventos();
}
