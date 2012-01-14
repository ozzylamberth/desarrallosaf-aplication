/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

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
import Dominio.Usuario;
import java.util.*;
/**
 *
 * @author Luipi
 */
public class InterfaceEnlaceTest {

    public InterfaceEnlaceTest() {
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
     * Test of todosLosEventos method, of class InterfaceEnlace.
     */
    @Test
    public void testTodosLosEventos() {
        System.out.println("todosLosEventos");
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        ArrayList expResult = null;
        ArrayList result = instance.todosLosEventos();
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarEvento method, of class InterfaceEnlace.
     */
    @Test
    public void testBuscarEvento() {
        System.out.println("buscarEvento");
        String name = "";
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        Evento expResult = null;
        Evento result = instance.buscarEvento(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of crearUsuario method, of class InterfaceEnlace.
     */
    @Test
    public void testCrearUsuario() throws Exception {
        System.out.println("crearUsuario");
        String nombreUsuario = "Luis";
        String apellidoUsuario = "Alfaro";
        String nickUsuario = "Luipi";
        String sexo = "Masculino";
        String passwordUsuario = "123456";
        Date fechaNacimientoUsuario = null;
        int status = 0;
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        boolean expResult = false;
        boolean result = instance.crearUsuario(nombreUsuario, apellidoUsuario, nickUsuario, sexo, passwordUsuario, fechaNacimientoUsuario, status);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarUsuario method, of class InterfaceEnlace.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        String NickUsuario = "Luipi";
        String Password = "12345";
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        boolean expResult = false;
        boolean result = instance.eliminarUsuario(NickUsuario, Password);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerNombreUsuario method, of class InterfaceEnlace.
     */
    @Test
    public void testObtenerNombreUsuario() {
        System.out.println("obtenerNombreUsuario");
        String player = "Luis";
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        String expResult = "Luis";
        String result = instance.obtenerNombreUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of ObtenerApellidoUsuario method, of class InterfaceEnlace.
     */
    @Test
    public void testObtenerApellidoUsuario() {
        System.out.println("ObtenerApellidoUsuario");
        String player = "Alfaro";
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        String expResult = "Alfaro";
        String result = instance.ObtenerApellidoUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerNickUsuario method, of class InterfaceEnlace.
     */
    @Test
    public void testObtenerNickUsuario() {
        System.out.println("obtenerNickUsuario");
        String player = "Luipi";
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        String expResult = "Luipi";
        String result = instance.obtenerNickUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerFechaNacimientoUsuario method, of class InterfaceEnlace.
     */
    @Test
    public void testObtenerFechaNacimientoUsuario() {
        System.out.println("obtenerFechaNacimientoUsuario");
        String player = null;
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        String expResult = null;
        String result = instance.obtenerFechaNacimientoUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerSexoUsuario method, of class InterfaceEnlace.
     */
    @Test
    public void testObtenerSexoUsuario() {
        System.out.println("obtenerSexoUsuario");
        String player = "Masculino";
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        String expResult = "Masculino";
        String result = instance.obtenerSexoUsuario(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerListaNickUsuarioes method, of class InterfaceEnlace.
     */
    @Test
    public void testObtenerListaNickUsuarioes() {
        System.out.println("obtenerListaNickUsuarioes");
        InterfaceEnlace instance = new InterfaceEnlaceImpl();
        Collection expResult = null;
        Collection result = instance.obtenerListaNickUsuarioes();
        assertEquals(expResult, result);
    }

    public class InterfaceEnlaceImpl implements InterfaceEnlace {

        public ArrayList<Evento> todosLosEventos() {
            return null;
        }

        public Evento buscarEvento(String name) {
            return null;
        }

        public boolean crearUsuario(String nombreUsuario, String apellidoUsuario, String nickUsuario, String sexo, String passwordUsuario, Date fechaNacimientoUsuario, int status) throws CreateUserException {
            return false;
        }

        public boolean eliminarUsuario(String NickUsuario, String Password) {
            return false;
        }

        public String obtenerNombreUsuario(String player) {
            return null;
        }

        public String ObtenerApellidoUsuario(String player) {
            return null;
        }

        public String obtenerNickUsuario(String player) {
            return null;
        }

        public String obtenerFechaNacimientoUsuario(String player) {
            return null;
        }

        public String obtenerSexoUsuario(String player) {
            return null;
        }

        public Collection<String> obtenerListaNickUsuarioes() {
            return null;
        }
    }

}