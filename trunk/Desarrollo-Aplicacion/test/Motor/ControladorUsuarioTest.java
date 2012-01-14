/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

import Dominio.Usuario;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luipi
 */
public class ControladorUsuarioTest {

    public ControladorUsuarioTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of crearUsuario method, of class ControladorUsuario.
     */
    @Test
    public void testCrearUsuario() throws Exception {
        System.out.println("crearUsuario");
        String nombre = "Luis";
        String apellido = "Alfaro";
        String nickname = "Luipi";
        String sexo = "Masculino";
        String password = "1234";
        Date fechan = null;
        int status = 0;
        boolean expResult = false;
        boolean result = ControladorUsuario.crearUsuario(nombre, apellido, nickname, sexo, password, fechan, status);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizarUsuario method, of class ControladorUsuario.
     */
    @Test
    public void testActualizarUsuario() {
        System.out.println("actualizarUsuario");
        String nickname = "";
        String nombre = "";
        String apellido = "";
        Date fechan = null;
        String avatar = "";
        String password = "";
        boolean expResult = false;
        boolean result = ControladorUsuario.actualizarUsuario(nickname, nombre, apellido, fechan, avatar, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarUsuario method, of class ControladorUsuario.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        String nickname = "";
        String password = "";
        boolean expResult = false;
        boolean result = ControladorUsuario.eliminarUsuario(nickname, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarUsuario method, of class ControladorUsuario.
     */
    @Test
    public void testBuscarUsuario() {
        System.out.println("buscarUsuario");
        String nickname = "";
        Usuario expResult = null;
        Usuario result = ControladorUsuario.buscarUsuario(nickname);
        assertEquals(expResult, result);
    }

}