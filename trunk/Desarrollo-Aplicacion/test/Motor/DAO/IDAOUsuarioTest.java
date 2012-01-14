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
public class IDAOUsuarioTest {

    public IDAOUsuarioTest() {
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
     * Test of agregarUsuario method, of class IDAOUsuario.
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
        IDAOUsuario instance = new IDAOUsuarioImpl();
        boolean expResult = false;
        boolean result = instance.agregarUsuario(nombreUsuario, apellidoUsuario, nickUsuario, sexo, passwordUsuario, fechaNacimientoUsuario, status);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarUsuario method, of class IDAOUsuario.
     */
    @Test
    public void testBuscarUsuario() {
        System.out.println("buscarUsuario");
        String nickName = "Luipi";
        IDAOUsuario instance = new IDAOUsuarioImpl();
        Usuario expResult = null;
        Usuario result = instance.buscarUsuario(nickName);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizarUsuario method, of class IDAOUsuario.
     */
    @Test
    public void testActualizarUsuario() {
        System.out.println("actualizarUsuario");
        Usuario usuario = null;
        IDAOUsuario instance = new IDAOUsuarioImpl();
        boolean expResult = false;
        boolean result = instance.actualizarUsuario(usuario);
        assertEquals(expResult, result);
    }

    /**
     * Test of borrarUsuario method, of class IDAOUsuario.
     */
    @Test
    public void testBorrarUsuario() {
        System.out.println("borrarUsuario");
        String nickName = "";
        IDAOUsuario instance = new IDAOUsuarioImpl();
        boolean expResult = false;
        boolean result = instance.borrarUsuario(nickName);
        assertEquals(expResult, result);
    }

    public class IDAOUsuarioImpl implements IDAOUsuario {

        public boolean agregarUsuario(String nombreUsuario, String apellidoUsuario, String nickUsuario, String sexo, String passwordUsuario, Date fechaNacimientoUsuario, int status) {
            return false;
        }

        public Usuario buscarUsuario(String nickName) {
            return null;
        }

        public boolean actualizarUsuario(Usuario usuario) {
            return false;
        }

        public boolean borrarUsuario(String nickName) {
            return false;
        }
    }

}