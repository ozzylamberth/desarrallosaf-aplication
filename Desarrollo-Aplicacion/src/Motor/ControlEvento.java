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
     * Firma para obtener todas los eventos del sistema
     * @return ArrayList con todas los eventos del sistema
     */
    public ArrayList<Evento> todosLosEventos() {
        return this.manejadorPersistencia.todosLosEventos();
    }

}