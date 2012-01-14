/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;

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
public class ListaEventosTest {

    public ListaEventosTest() {
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
     * Test of getMisEventos method, of class ListaEventos.
     */
    @Test
    public void testGetMisEventos() {
        System.out.println("getMisEventos");
        ListaEventos instance = new ListaEventos();
        ArrayList expResult = null;
        ArrayList result = instance.getMisEventos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMisEventos method, of class ListaEventos.
     */
    @Test
    public void testSetMisEventos() {
        System.out.println("setMisEventos");
        ArrayList<Evento> MisEventos = null;
        ListaEventos instance = new ListaEventos();
        instance.setMisEventos(MisEventos);
    }

    /**
     * Test of crearListaEventos method, of class ListaEventos.
     */
    @Test
    public void testCrearListaEventos() {
        System.out.println("crearListaEventos");
        ListaEventos instance = new ListaEventos();
        instance.crearListaEventos();
    }

}