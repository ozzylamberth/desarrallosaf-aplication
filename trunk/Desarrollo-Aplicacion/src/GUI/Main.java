/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import GUI.VentanaHome;
import Motor.VerificarConexion;

/**
 *
 * @author RS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VerificarConexion hilo = new VerificarConexion();
        hilo.start();
        VentanaHome home = new VentanaHome();
        home.setVisible(true);
    }

}
