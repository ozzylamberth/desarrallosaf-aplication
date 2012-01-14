/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

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
public class ControlEventoTest {

    public ControlEventoTest() {
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
     * Test of todosLosEventos method, of class ControlEvento.
     */
    @Test
    public void testTodosLosEventos() {
        System.out.println("todosLosEventos");
        ControlEvento instance = new ControlEvento();
        ArrayList expResult = null;
        ArrayList result = instance.todosLosEventos();
        assertEquals(expResult, result);
    }

}