/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Motor.MotorImplementacion;
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
public class MotorTest {

    public MotorTest() {
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
     * Test of getMotorImplementacion method, of class Motor.
     */
    @Test
    public void testGetMotorImplementacion() {
        System.out.println("getMotorImplementacion");
        MotorImplementacion expResult = null;
        MotorImplementacion result = Motor.getMotorImplementacion();
        assertEquals(expResult, result);
    }

}