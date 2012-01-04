/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;

import java.util.Date;

/**
 *
 * @author Patricia
 */
public class Usuario {

    private String nombreUsuario;
    private String apellidoUsuario;
    private String nickUsuario;
    private Date fechaNacimientoUsuario;
    private String sexo;
    private String passwordUsuario;

    public Usuario(String nombreUsuario, String apellidoUsuario, String nickUsuario, Date fechaNacimientoUsuario, String sexo, String passwordUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.nickUsuario = nickUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.sexo = sexo;
        this.passwordUsuario = passwordUsuario;
    }

    public Usuario() {
        
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public String getNickUsuario() {
        return nickUsuario;
    }

    public void setNickUsuario(String nickUsuario) {
        this.nickUsuario = nickUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
   