/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RS
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Motor;

import Dominio.Evento;
import Dominio.ListaEventos;
import Interface.InterfaceEnlace;
import Interface.Motor;
import java.util.ArrayList;
import java.util.Date;
import Motor.DAO.DaoEventoXML;
import Motor.DAO.IdaoEvento;

/**
 * Clase controladora para el dominio de un evento
 * @author Raymy Sotillo
 */
public class ControlEvento {

    /** atributo para el manejo de la persistencia del evento*/
    private DaoEventoXML manejadorPersistencia = new DaoEventoXML();
    private static InterfaceEnlace miMotor = Motor.getMotorImplementacion();

    /**
     * Prototipo para registrar un nuevo evento en el sistema
     * @param name Nombre del evento
     * @param categoryName nombre de la categoria del evento
     * @param category_type nombre del tipo de categoria del evento
     * @param date_ini fecha de inicio del evento
     * @param date_fin fecha fin del evento
     * @param winner Ganador del evento
     * @param administratorName nombre del administrador del evento
     * @param lastname apellido del administrador del evento
     * @param ci cedula del administrador del evento
     * @param nameCompetitor Nombre de los competidores del evento
     * @return valor booleano con la condición de éxito
     */
//    public boolean nuevoEvento(String name, String categoryName, String category_type, String date_ini, String date_fin, String winner, String administratorName, String lastname,String ci,String nameCompetitor)
//    {
//        boolean resultado = false;
//        Evento comprobar=null;
//        Evento eventoNuevo = new Evento();
//        eventoNuevo.setName(name);
//        eventoNuevo.setCategoryName(categoryName);
//        eventoNuevo.setCategory_type(category_type);
//        eventoNuevo.setDate_ini(date_ini);
//        eventoNuevo.setDate_fin(date_fin);
//        eventoNuevo.setWinner(winner);
//        eventoNuevo.setAdministratorName(administratorName);
//        eventoNuevo.setLastname(lastname);
//        eventoNuevo.setCi(ci);
//        eventoNuevo.setNameCompetitor(null);
//        //comprobar=manejadorPersistencia.buscarEvento(eventoNuevo.getName());
//
//         if (comprobar==null)
//         {
//         resultado = manejadorPersistencia.agregarEvento(eventoNuevo);
//          return resultado;
//         }
//         else
//         {
//       return resultado;
//         }
//    }


 
   /**
     * firma para buscar un evento del sistema
     * @param name Nombre del evento a buscar
     * @return objeto evento con los datos
     */
//    public Evento buscarEvento(String name) {
//        Evento resultado = null;
//        String nombreBuscar = name;
//        resultado = manejadorPersistencia.buscarEvento(nombreBuscar);
//        return resultado;
//    }

    /**
     * Firma para obtener todas los eventos del sistema
     * @return ArrayList con todas las agencias del sistema
     */
    public ArrayList<Evento> todosLosEventos() {
        return this.manejadorPersistencia.todosLosEventos();
    }

}