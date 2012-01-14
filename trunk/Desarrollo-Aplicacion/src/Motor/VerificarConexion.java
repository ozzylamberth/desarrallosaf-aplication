package Motor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patricia
 */

import Motor.DAO.DaoEventoXML;
import Motor.DAO.IdaoEvento;
import java.io.File;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class VerificarConexion extends Thread {
    private String strTitle = "Mensaje-Gamble´s Sport";
    /** atributo para el manejo de log4j*/
    private final static Logger log = Logger.getLogger(VerificarConexion.class);
    int espera = 0;
    private boolean continuar = true;
    static {

PropertyConfigurator.configure("log4j.properties");

}


 /**
 * firma para crear hilo en espera de conexion de pendrive
 * @param
 * @return 
 */
    public void run(){
        while(continuar){
            if(espera>0){
                    try {
                      sleep(5000);
                    } catch (InterruptedException ex) {
                        log.error("", ex);
                    }
                }
                espera++;
                File a = new File("G:/");
                File[] roots = File.listRoots();
                for (int i=0; i<roots.length; i++) {
                System.out.println(roots[i]);
                }
                System.out.println(a.exists());
                if (a.exists()){
                    int existe = 0;
                    String[] listaArchivos= a.list();
                    for(int i=0; i<listaArchivos.length; i++){
                       //System.out.println(listaArchivos[i]);
                        //HorarioSemestre Oct-Mar2011-2012.xlsx
                        if (listaArchivos[i].equals("Events.xml")){
                            log.info("archivo encontrado");
                            existe = 1;
                        }
                    }
                     if (existe ==1 ){
                        System.out.println("Existe");
                        IdaoEvento manejadorPersistencia = (IdaoEvento) new DaoEventoXML();
                        //manejadorPersistencia.todosLosEventos();
                        
                     }
                    else{
                         System.out.println("No Existe");
                         log.info("El archivo no fue encontrado");
                         JOptionPane.showMessageDialog(null, "El archivo de actualización no fue encontrado. Desconecte el Pendrive", strTitle,
                         JOptionPane.WARNING_MESSAGE);
                         run();
                    }

                }
         }

    }

}
