/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor.DAO;

import Dominio.Usuario;
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
public class DAOUsuarioTest {

    public DAOUsuarioTest() {
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
     * Test of conectar method, of class DAOUsuario.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        DAOUsuario instance = new DAOUsuario();
        instance.conectar();
    }

    /**
     * Test of agregarUsuario method, of class DAOUsuario.
     */
    @Test
    public void testAgregarUsuario() {
        System.out.println("agregarUsuario");
        String nombreUsuario = "Luis";
        String apellidoUsuario = "Alfaro";
        String nickUsuario = "Luipi";
        String sexo = "Masculino";
        String passwordUsuario = "12345";
        Date fechaNacimientoUsuario = null;
        int status = 0;
        DAOUsuario instance = new DAOUsuario();
        boolean expResult = false;
        boolean result = instance.agregarUsuario(nombreUsuario, apellidoUsuario, nickUsuario, sexo, passwordUsuario, fechaNacimientoUsuario, status);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarUsuario method, of class DAOUsuario.
     */
    @Test
    public void testBuscarUsuario() {
        System.out.println("buscarUsuario");
        String nickName = "Luipi";
        DAOUsuario instance = new DAOUsuario();
        Usuario expResult = null;
        Usuario result = instance.buscarUsuario(nickName);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizarUsuario method, of class DAOUsuario.
     */
    @Test
    public void testActualizarUsuario() {
        System.out.println("actualizarUsuario");
        Usuario usuario = null;
        DAOUsuario instance = new DAOUsuario();
        boolean expResult = false;
        boolean result = instance.actualizarUsuario(usuario);
        assertEquals(expResult, result);
    }

    /**
     * Test of borrarUsuario method, of class DAOUsuario.
     */
    @Test
    public void testBorrarUsuario() {
        System.out.println("borrarUsuario");
        String nickName = "Luipi";
        DAOUsuario instance = new DAOUsuario();
        boolean expResult = false;
        boolean result = instance.borrarUsuario(nickName);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarUsuarioPassword method, of class DAOUsuario.
     */
    @Test
    public void testBuscarUsuarioPassword() {
        System.out.println("buscarUsuarioPassword");
        String password = "12345";
        DAOUsuario instance = new DAOUsuario();
        Usuario expResult = null;
        Usuario result = instance.buscarUsuarioPassword(password);
        assertEquals(expResult, result);
    }

}