/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase de dominio para gestionar la informacion de un Evento
 * @author Raymy Sotillo
 * @version 1.0
 */
package Dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author RS
 */
public class Evento {

       /** atributo para almacenar el nombre*/
    private String name;
    /** atributo para almacenar el nombre de la categoria*/
    private String categoryName;
    /** atributo para almacenar el tipo de categoriao*/
    private String category_type;
    /** atributo para almacenar la Fecha de inicio*/
    private Date date_ini;
    /** atributo para almacenar la fecha fin*/
    private Date date_fin;
    /** atributo para almacenar el ganador del evento*/
    private String winner;
    /** atributo para almacenar nombre del Administrador*/
    private String administratorName;
    /** atributo para almacenar el apellido del administrador*/
    private String lastname;
    /** atributo para almacenar la cedula del administrador*/
    private String ci;
    /** atributo para almacenar el nombre de los competidores*/
    private ArrayList<Competidor> nameCompetitor;

    private final static Logger log = Logger.getLogger(Evento.class);


     /** constructor por defecto*/
    public Evento() {
    }

     /**
     * constructor con nombre
     * @param name el nombre del evento
     */
    public Evento(String name) {
        this.name = name;
    }

     /**
     * constructor completo
     * @param name Nombre del Evento
     * @param categoryName Nombre de la categoria
     * @param date_ini Fecha inicio del evento
     * @param date_fin Fecha fin del evento
     * @param winner Ganador del Evento
     */
     public Evento(String name, String categoryName, String category_type, Date date_ini, Date date_fin, String winner, String administratorName, String lastname, String ci, ArrayList nameCompetitor) {
        this.name = name;
        this.categoryName = categoryName;
        this.category_type = category_type;
        this.date_ini = date_ini;
        this.date_fin = date_fin;
        this.winner = winner;
        this.administratorName = administratorName;
        this.lastname = lastname;
        this.ci = ci;
        this.nameCompetitor = nameCompetitor;
    }
    /**
     * firma para obtener el nombre de la categoria
     * @return el nombre de la categoria
     */
    public String getCategoryName() {
        return categoryName;
    }

    public ArrayList<Competidor> getNameCompetitor() {
        return nameCompetitor;
    }

    public void setNameCompetitor(ArrayList<Competidor> nameCompetitor) {
        this.nameCompetitor = nameCompetitor;
    }

    /**
     * firma para establecer el nombre de la Categoria
     * @param categoryName Nombre de la Categoria
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

     /**
     * firma para obtener la fecha fin del evento
     * @return la fecha final del evento
     */
    public String getDate_fin() {
     
        Calendar calen =Calendar.getInstance();  //CAMBIO FORMATO
            //calen.setTime(date_fin.getDate()); //CAMBIO FORMATO 
            calen.setTime(date_fin);    

            String Dia = String.valueOf(calen.get(Calendar.DAY_OF_MONTH));//CAMBIO FORMATO
            String Mes = String.valueOf(calen.get(Calendar.MONTH)+1);// CAMBIO FORMATO
            String Año = String.valueOf(calen.get(Calendar.YEAR));//CAMBIO FORMATO
            String fecha =Dia+"-"+Mes+"-"+Año;//CAMBIA FORMATO*/

        return fecha;
    }

    /**
     * firma para establecer la fecha fin del evento
     * @param date_fin la fecha final del evento
     */
    public void setDate_fin(String date) {
        SimpleDateFormat sdf;
            sdf = new SimpleDateFormat(  "yyyy-MM-dd"  );
            Date fechan = null;
            try {
                fechan = sdf.parse(date);//Cambio Fecha en Formato DATE
            } catch (ParseException ex) {
                //Logger.getLogger(VentanaNuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);
                log.error("Problemas con la fecha de nacimiento");
            }

        this.date_fin = fechan;
    }

     /**
     * firma para obtener la fecha de inicio del evento
     * @return la fecha de inicio del evento
     */
    public String getDate_ini() {
         Calendar calen =Calendar.getInstance();  //CAMBIO FORMATO
            //calen.setTime(date_fin.getDate()); //CAMBIO FORMATO // deja!
            calen.setTime(date_ini);    //debug

            String Dia = String.valueOf(calen.get(Calendar.DAY_OF_MONTH));//CAMBIO FORMATO
            String Mes = String.valueOf(calen.get(Calendar.MONTH)+1);// CAMBIO FORMATO
            String Año = String.valueOf(calen.get(Calendar.YEAR));//CAMBIO FORMATO
            String fecha =Dia+"-"+Mes+"-"+Año;//CAMBIA FORMATO*/

        return fecha;
    }

    /**
     * firma para establecer la fecha inicial del evento
     * @param date_ini la fecha inicial del evento
     */
    public void setDate_ini(String date) {
         SimpleDateFormat sdf;
            sdf = new SimpleDateFormat(  "yyyy-MM-dd"  );
            Date fechan = null;
            try {
                fechan = sdf.parse(date);//Cambio Fecha en Formato DATE
            } catch (ParseException ex) {
                //Logger.getLogger(VentanaNuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);
                log.error("Problemas con la fecha de nacimiento");
            }

        this.date_ini = fechan;
    }

     /**
     * firma para obtener el nombre del evento
     * @return el nombre del evento
     */
    public String getName() {
        return name;
    }

    /**
     * firma para establecer el nombre del evento
     * @param name el nombre del evento
     */
    public void setName(String name) {
        this.name = name;
    }

     /**
     * firma para obtener el nombre del ganador
     * @return el nombre del ganador del evento
     */
    public String getWinner() {
        return winner;
    }

    /**
     * firma para establecer el ganador del evento
     * @param winner el ganador del evento
     */
    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    /**
     * firma para establecer el administrador del evento
     * @param administratorName administrador del evento
     */
    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public String getCategory_type() {
        return category_type;
    }

    /**
     * firma para establecer el tipo de categoria del evento
     * @param category_type el tipo de categoria del evento
     */
    public void setCategory_type(String category_type) {
        this.category_type = category_type;
    }

    public String getCi() {
        return ci;
    }

    /**
     * firma para establecer la cedula del administrador
     * @param ci del administrador
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getLastname() {
        return lastname;
    }

    /**
     * firma para establecer el apellido del administrador del evento
     * @param lastname apellido del administrador
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

   

    /**
     * firma para establecer los nombres de los competidores
     * @param nameCompetitor nombre de los competidores del evento
     */
    



     @Override
    public String toString() {
        return ("Datos Evento:" + " Nombre:" + name + " " + "Categoria:" + categoryName + " " + "Fecha Inico:" + date_ini + " " + "Fecha Fin:" + date_fin + " "+"Ganador:"+ winner);
    }
}




