/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor.DAO;

import Dominio.Evento;
import Dominio.ListaEventos;
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
public class IdaoEventoTest {

    public IdaoEventoTest() {
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
     * Test of DaoEventoXML method, of class IdaoEvento.
     */
    @Test
    public void testDaoEventoXML() {
        System.out.println("DaoEventoXML");
        IdaoEvento instance = new IdaoEventoImpl();
        ListaEventos expResult = null;
        ListaEventos result = instance.DaoEventoXML();
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarEvento method, of class IdaoEvento.
     */
    @Test
    public void testBuscarEvento() {
        System.out.println("buscarEvento");
        String name = "Luis";
        IdaoEvento instance = new IdaoEventoImpl();
        Evento expResult = null;
        Evento result = instance.buscarEvento(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizarEvento method, of class IdaoEvento.
     */
    @Test
    public void testActualizarEvento() {
        System.out.println("actualizarEvento");
        Evento evento = null;
        IdaoEvento instance = new IdaoEventoImpl();
        boolean expResult = false;
        boolean result = instance.actualizarEvento(evento);
        assertEquals(expResult, result);
    }

    /**
     * Test of borrarEvento method, of class IdaoEvento.
     */
    @Test
    public void testBorrarEvento() {
        System.out.println("borrarEvento");
        String name = "Luipi";
        IdaoEvento instance = new IdaoEventoImpl();
        boolean expResult = false;
        boolean result = instance.borrarEvento(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of todosLosEventos method, of class IdaoEvento.
     */
    @Test
    public void testTodosLosEventos() {
        System.out.println("todosLosEventos");
        IdaoEvento instance = new IdaoEventoImpl();
        ListaEventos expResult = null;
        ListaEventos result = instance.todosLosEventos();
        assertEquals(expResult, result);
    }

    public class IdaoEventoImpl implements IdaoEvento {

        public ListaEventos DaoEventoXML() {
            return null;
        }

        public Evento buscarEvento(String name) {
            return null;
        }

        public boolean actualizarEvento(Evento evento) {
            return false;
        }

        public boolean borrarEvento(String name) {
            return false;
        }

        public ListaEventos todosLosEventos() {
            return null;
        }
    }

}