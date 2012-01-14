/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

import Dominio.Evento;
import java.util.ArrayList;
import java.util.Collection;
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
public class MotorImplementacionTest {

    public MotorImplementacionTest() {
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
     * Test of ObtenerApellidoUsuario method, of class MotorImplementacion.
     */
    @Test
    public void testObtenerApellidoUsuario() {
        System.out.println("ObtenerApellidoUsuario");
        String player = "";
        MotorImplementacion instance = new MotorImplementacion();
        String expResult = "";
        String result = instance.ObtenerApellidoUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of crearUsuario method, of class MotorImplementacion.
     */
    @Test
    public void testCrearUsuario() throws Exception {
        System.out.println("crearUsuario");
        String nombreUsuario = "";
        String apellidoUsuario = "";
        String nickUsuario = "";
        String sexo = "";
        String passwordUsuario = "";
        Date fechaNacimientoUsuario = null;
        int status = 0;
        MotorImplementacion instance = new MotorImplementacion();
        boolean expResult = false;
        boolean result = instance.crearUsuario(nombreUsuario, apellidoUsuario, nickUsuario, sexo, passwordUsuario, fechaNacimientoUsuario, status);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarUsuario method, of class MotorImplementacion.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        String NickUsuario = "";
        String Password = "";
        MotorImplementacion instance = new MotorImplementacion();
        boolean expResult = false;
        boolean result = instance.eliminarUsuario(NickUsuario, Password);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerFechaNacimientoUsuario method, of class MotorImplementacion.
     */
    @Test
    public void testObtenerFechaNacimientoUsuario() {
        System.out.println("obtenerFechaNacimientoUsuario");
        String player = "";
        MotorImplementacion instance = new MotorImplementacion();
        String expResult = "";
        String result = instance.obtenerFechaNacimientoUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerListaNickUsuarioes method, of class MotorImplementacion.
     */
    @Test
    public void testObtenerListaNickUsuarioes() {
        System.out.println("obtenerListaNickUsuarioes");
        MotorImplementacion instance = new MotorImplementacion();
        Collection expResult = null;
        Collection result = instance.obtenerListaNickUsuarioes();
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerNickUsuario method, of class MotorImplementacion.
     */
    @Test
    public void testObtenerNickUsuario() {
        System.out.println("obtenerNickUsuario");
        String player = "";
        MotorImplementacion instance = new MotorImplementacion();
        String expResult = "";
        String result = instance.obtenerNickUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerNombreUsuario method, of class MotorImplementacion.
     */
    @Test
    public void testObtenerNombreUsuario() {
        System.out.println("obtenerNombreUsuario");
        String player = "";
        MotorImplementacion instance = new MotorImplementacion();
        String expResult = "";
        String result = instance.obtenerNombreUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerSexoUsuario method, of class MotorImplementacion.
     */
    @Test
    public void testObtenerSexoUsuario() {
        System.out.println("obtenerSexoUsuario");
        String player = "";
        MotorImplementacion instance = new MotorImplementacion();
        String expResult = "";
        String result = instance.obtenerSexoUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of todosLosEventos method, of class MotorImplementacion.
     */
    @Test
    public void testTodosLosEventos() {
        System.out.println("todosLosEventos");
        MotorImplementacion instance = new MotorImplementacion();
        ArrayList expResult = null;
        ArrayList result = instance.todosLosEventos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarEvento method, of class MotorImplementacion.
     */
    @Test
    public void testBuscarEvento() {
        System.out.println("buscarEvento");
        String name = "";
        MotorImplementacion instance = new MotorImplementacion();
        Evento expResult = null;
        Evento result = instance.buscarEvento(name);
        assertEquals(expResult, result);
    }

}