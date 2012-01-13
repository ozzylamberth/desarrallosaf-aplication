/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;

/**
 *
 * @author RS
 */
public class Competidor {

     /** atributo para almacenar el nombre*/
    private String nameCompetitor;
    private String max_amount;


    public Competidor(String nameCompetitor) {
        this.nameCompetitor = nameCompetitor;
    }

    public Competidor() {
       
    }

    public String getMax_amount() {
        return max_amount;
    }

    public void setMax_amount(String max_amount) {
        this.max_amount = max_amount;
    }

    public String getNameCompetitor() {
        return nameCompetitor;
    }

    public void setNameCompetitor(String nameCompetitor) {
        this.nameCompetitor = nameCompetitor;
    }

}
