/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

import Dominio.Evento;
import Interface.CreateUserException;
import Interface.InterfaceEnlace;
import Motor.DAO.DAOApuesta;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import Motor.DAO.DAOUsuario;
import Motor.DAO.DaoEventoXML;
import java.util.ArrayList;
import org.apache.log4j.Logger;



import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Patricia
 */
public class MotorImplementacion implements InterfaceEnlace {

    private static DAOApuesta manejadorPersistencia = new DAOApuesta();
    private static DaoEventoXML manejadorPersistenciaEvento = new DaoEventoXML();
    



    public ArrayList<Evento> todosLosEventos() {
          ArrayList<Evento> eventos = this.manejadorPersistenciaEvento.todosLosEventos();
          return eventos;
    }

 public Evento buscarEvento(String name){
     Evento evento = new Evento ();
     evento = this.manejadorPersistenciaEvento.buscarEvento(name);
     return evento;
 }

 

    public boolean agregarApuesta(String name, String categoryName, String nameCompetitor, int pos, int apuestaU, Date fechaActual, String status, String category_type) {
         boolean resultado=false;
        resultado = manejadorPersistencia.agregarApuesta(name, categoryName, nameCompetitor,pos,  apuestaU,  fechaActual, status,  category_type);
        if (resultado) {
            return true;
        }
        else

            return false;
    }

    public void PDF(String name,String nameCompetitor, String categoryName,int apuestaU){
    }


}
