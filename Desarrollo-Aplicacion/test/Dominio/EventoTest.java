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
public class EventoTest {

    public EventoTest() {
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
     * Test of getCategoryName method, of class Evento.
     */
    @Test
    public void testGetCategoryName() {
        System.out.println("getCategoryName");
        Evento instance = new Evento();
        String expResult = "MotoGP";
        instance.setCategoryName(expResult);
        String result = instance.getCategoryName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNameCompetitor method, of class Evento.
     */
    @Test
    public void testGetNameCompetitor() {
        System.out.println("getNameCompetitor");
        Evento instance = new Evento();
        ArrayList expResult = null;
        ArrayList result = instance.getNameCompetitor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNameCompetitor method, of class Evento.
     */
    @Test
    public void testSetNameCompetitor() {
        System.out.println("setNameCompetitor");
        ArrayList<Competidor> nameCompetitor = null;
        Evento instance = new Evento();
        instance.setNameCompetitor(nameCompetitor);
    }

    /**
     * Test of setCategoryName method, of class Evento.
     */
    @Test
    public void testSetCategoryName() {
        System.out.println("setCategoryName");
        String categoryName = "NBA";
        Evento instance = new Evento();
        instance.setCategoryName(categoryName);
        String result = instance.getCategoryName();
        assertEquals(categoryName,result);

    }

    /**
     * Test of getDate_fin method, of class Evento.
     */
    @Test
    public void testGetDate_fin() {
        System.out.println("getDate_fin");
        Evento instance = new Evento();
        String expResult = null;
        instance.setDate_fin(expResult);
        String result = instance.getDate_fin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate_fin method, of class Evento.
     */
    @Test
    public void testSetDate_fin() {
        System.out.println("setDate_fin");
        String date = "12-12-2012";
        Evento instance = new Evento();
        instance.setDate_fin(date);
    }

    /**
     * Test of getDate_ini method, of class Evento.
     */
    @Test
    public void testGetDate_ini() {
        System.out.println("getDate_ini");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getDate_ini();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate_ini method, of class Evento.
     */
    @Test
    public void testSetDate_ini() {
        System.out.println("setDate_ini");
        String date = "12-12-2012";
        Evento instance = new Evento();
        instance.setDate_ini(date);
    }

    /**
     * Test of getName method, of class Evento.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Evento instance = new Evento();
        String expResult = "Clasico";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Evento.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Probando";
        Evento instance = new Evento();
        instance.setName(name);
    }

    /**
     * Test of getWinner method, of class Evento.
     */
    @Test
    public void testGetWinner() {
        System.out.println("getWinner");
        Evento instance = new Evento();
        String expResult = "Rossi";
        instance.setWinner(expResult);
        String result = instance.getWinner();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWinner method, of class Evento.
     */
    @Test
    public void testSetWinner() {
        System.out.println("setWinner");
        String winner = "Rossi";
        Evento instance = new Evento();
        instance.setWinner(winner);
    }

    /**
     * Test of getAdministratorName method, of class Evento.
     */
    @Test
    public void testGetAdministratorName() {
        System.out.println("getAdministratorName");
        Evento instance = new Evento();
        String expResult = "Luis";
        instance.setAdministratorName(expResult);
        String result = instance.getAdministratorName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdministratorName method, of class Evento.
     */
    @Test
    public void testSetAdministratorName() {
        System.out.println("setAdministratorName");
        String administratorName = "Luis";
        Evento instance = new Evento();
        instance.setAdministratorName(administratorName);
    }

    /**
     * Test of getCategory_type method, of class Evento.
     */
    @Test
    public void testGetCategory_type() {
        System.out.println("getCategory_type");
        Evento instance = new Evento();
        String expResult = "Competition";
        instance.setCategory_type(expResult);
        String result = instance.getCategory_type();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategory_type method, of class Evento.
     */
    @Test
    public void testSetCategory_type() {
        System.out.println("setCategory_type");
        String category_type = "VS";
        Evento instance = new Evento();
        instance.setCategory_type(category_type);
    }

    /**
     * Test of getCi method, of class Evento.
     */
    @Test
    public void testGetCi() {
        System.out.println("getCi");
        Evento instance = new Evento();
        String expResult = "12345";
        instance.setCi(expResult);
        String result = instance.getCi();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCi method, of class Evento.
     */
    @Test
    public void testSetCi() {
        System.out.println("setCi");
        String ci = "1324567";
        Evento instance = new Evento();
        instance.setCi(ci);
    }

    /**
     * Test of getLastname method, of class Evento.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Evento instance = new Evento();
        String expResult = "Alfaro";
        instance.setLastname(expResult);
        String result = instance.getLastname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastname method, of class Evento.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "Alfaro";
        Evento instance = new Evento();
        instance.setLastname(lastname);
    }

    /**
     * Test of toString method, of class Evento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Evento instance = new Evento();
        String  expResult= "Datos Evento: Nombre:null Categoria:null Fecha Inico:null Fecha Fin:null Ganador:null";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}