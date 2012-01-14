/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;

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
public class CompetidorTest {

    public CompetidorTest() {
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
     * Test of getMax_amount method, of class Competidor.
     */
    @Test
    public void testGetMax_amount() {
        System.out.println("getMax_amount");
        Competidor instance = new Competidor();
        String expResult = "56";
        instance.setMax_amount(expResult);
        String result = instance.getMax_amount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMax_amount method, of class Competidor.
     */
    @Test
    public void testSetMax_amount() {
        System.out.println("setMax_amount");
        String max_amount = "789";
        Competidor instance = new Competidor();
        instance.setMax_amount(max_amount);
    }

    /**
     * Test of getNameCompetitor method, of class Competidor.
     */
    @Test
    public void testGetNameCompetitor() {
        System.out.println("getNameCompetitor");
        Competidor instance = new Competidor();
        String expResult = "Wendy";
        instance.setNameCompetitor(expResult);
        String result = instance.getNameCompetitor();
        assertEquals(expResult, result);;
    }

    /**
     * Test of setNameCompetitor method, of class Competidor.
     */
    @Test
    public void testSetNameCompetitor() {
        System.out.println("setNameCompetitor");
        String nameCompetitor = "Juliette";
        Competidor instance = new Competidor();
        instance.setNameCompetitor(nameCompetitor);
    }

}