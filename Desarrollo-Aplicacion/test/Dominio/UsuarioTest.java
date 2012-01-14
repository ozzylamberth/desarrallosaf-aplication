/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;

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
public class UsuarioTest {

    public UsuarioTest() {
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
     * Test of getApellidoUsuario method, of class Usuario.
     */
    @Test
    public void testGetApellidoUsuario() {
        System.out.println("getApellidoUsuario");
        Usuario instance = new Usuario();
        String expResult = "Barroeta";
        instance.setApellidoUsuario(expResult);
        String result = instance.getApellidoUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApellidoUsuario method, of class Usuario.
     */
    @Test
    public void testSetApellidoUsuario() {
        System.out.println("setApellidoUsuario");
        String apellidoUsuario = "Barroeta";
        Usuario instance = new Usuario();
        instance.setApellidoUsuario(apellidoUsuario);
    }

    /**
     * Test of getFechaNacimientoUsuario method, of class Usuario.
     */
    @Test
    public void testGetFechaNacimientoUsuario() {
        System.out.println("getFechaNacimientoUsuario");
        Usuario instance = new Usuario();
        Date expResult = null;
        Date result = instance.getFechaNacimientoUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaNacimientoUsuario method, of class Usuario.
     */
    @Test
    public void testSetFechaNacimientoUsuario() {
        System.out.println("setFechaNacimientoUsuario");
        Date fechaNacimientoUsuario = null;
        Usuario instance = new Usuario();
        instance.setFechaNacimientoUsuario(fechaNacimientoUsuario);
    }

    /**
     * Test of getNickUsuario method, of class Usuario.
     */
    @Test
    public void testGetNickUsuario() {
        System.out.println("getNickUsuario");
        Usuario instance = new Usuario();
        String expResult = "Carlosdbm";
        instance.setNickUsuario(expResult);
        String result = instance.getNickUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNickUsuario method, of class Usuario.
     */
    @Test
    public void testSetNickUsuario() {
        System.out.println("setNickUsuario");
        String nickUsuario = "Carlosdbm";
        Usuario instance = new Usuario();
        instance.setNickUsuario(nickUsuario);
    }

    /**
     * Test of getNombreUsuario method, of class Usuario.
     */
    @Test
    public void testGetNombreUsuario() {
        System.out.println("getNombreUsuario");
        Usuario instance = new Usuario();
        String expResult = "Alejandro";
        instance.setNombreUsuario(expResult);
        String result = instance.getNombreUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombreUsuario method, of class Usuario.
     */
    @Test
    public void testSetNombreUsuario() {
        System.out.println("setNombreUsuario");
        String nombreUsuario = "Alejandro";
        Usuario instance = new Usuario();
        instance.setNombreUsuario(nombreUsuario);
    }

    /**
     * Test of getPasswordUsuario method, of class Usuario.
     */
    @Test
    public void testGetPasswordUsuario() {
        System.out.println("getPasswordUsuario");
        Usuario instance = new Usuario();
        String expResult = "8w9ejf09";
        instance.setPasswordUsuario(expResult);
        String result = instance.getPasswordUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPasswordUsuario method, of class Usuario.
     */
    @Test
    public void testSetPasswordUsuario() {
        System.out.println("setPasswordUsuario");
        String passwordUsuario = "ofdsify8asm";
        Usuario instance = new Usuario();
        instance.setPasswordUsuario(passwordUsuario);
    }

    /**
     * Test of getSexo method, of class Usuario.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Usuario instance = new Usuario();
        String expResult = "Masculino";
        instance.setSexo(expResult);
        String result = instance.getSexo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSexo method, of class Usuario.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "Femenino";
        Usuario instance = new Usuario();
        instance.setSexo(sexo);
    }

    /**
     * Test of getStatus method, of class Usuario.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Usuario instance = new Usuario();
        int expResult = 0;
        instance.setStatus(expResult);
        int result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Usuario.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int status = 0;
        Usuario instance = new Usuario();
        instance.setStatus(status);
    }

}