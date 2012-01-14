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
public class Apuesta {

    private String nombreEvento;
    private String nombreCategoria;
    private String competidor;
    private int pos;
    private int montoApostado;
    private Date fecha;
    private String status;
    private String tipoCategoria;

    public Apuesta(String nombreEvento, String nombreCategoria, String competidor, int pos, int montoApostado, Date fecha, String status, String tipoCategoria) {
        this.nombreEvento = nombreEvento;
        this.nombreCategoria = nombreCategoria;
        this.competidor = competidor;
        this.pos = pos;
        this.montoApostado = montoApostado;
        this.fecha = fecha;
        this.status = status;
        this.tipoCategoria = tipoCategoria;
    }

    public Apuesta() {
        
    }

    public String getCompetidor() {
        return competidor;
    }

    public void setCompetidor(String competidor) {
        this.competidor = competidor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMontoApostado() {
        return montoApostado;
    }

    public void setMontoApostado(int montoApostado) {
        this.montoApostado = montoApostado;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
    

}
