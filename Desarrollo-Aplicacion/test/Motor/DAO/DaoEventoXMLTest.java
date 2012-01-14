/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor.DAO;

import Dominio.Evento;
import java.util.ArrayList;
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
public class DaoEventoXMLTest {

    public DaoEventoXMLTest() {
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
     * Test of todosLosEventos method, of class DaoEventoXML.
     */
    @Test
    public void testTodosLosEventos() {
        System.out.println("todosLosEventos");
        DaoEventoXML instance = new DaoEventoXML();
        ArrayList expResult = null;
        ArrayList result = instance.todosLosEventos();
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarEvento method, of class DaoEventoXML.
     */
    @Test
    public void testBuscarEvento() {
        System.out.println("buscarEvento");
        String nombre = "";
        DaoEventoXML instance = new DaoEventoXML();
        Evento expResult = null;
        Evento result = instance.buscarEvento(nombre);
        assertEquals(expResult, result);
    }

}