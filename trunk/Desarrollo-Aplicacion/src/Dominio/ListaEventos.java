/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;

import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public class ListaEventos {

    public ArrayList<Evento> MisEventos;

    public ListaEventos(ArrayList<Evento> MisEventos) {
        this.MisEventos = MisEventos;
    }

    public ListaEventos() {
        
    }

    public ArrayList<Evento> getMisEventos() {
        return MisEventos;
    }

    public void setMisEventos(ArrayList<Evento> MisEventos) {
        this.MisEventos = MisEventos;
    }

   public void crearListaEventos ()
    {
        MisEventos = new ArrayList<Evento>();
    }
    

}
