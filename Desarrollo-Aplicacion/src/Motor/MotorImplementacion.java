/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

import Interface.CreateUserException;
import Interface.InterfaceEnlace;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Patricia
 */
public class MotorImplementacion implements InterfaceEnlace {

    public String ObtenerApellidoUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean crearUsuario(String nombreUsuario, String apellidoUsuario, String nickUsuario, String sexoAvatarUsuario, Date fechaNacimientoUsuario, String passwordUsuario) throws CreateUserException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean eliminarUsuario(String NickUsuario, String Password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Date obtenerFechaNacimientoUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Collection<String> obtenerListaNickUsuarioes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String obtenerNickUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String obtenerNombreUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String obtenerSexoUsuario(String player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
