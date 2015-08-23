/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author rogelio
 */
public class VHabitacion {
    private int idHabitacion;
    private String numero;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private Double precioDiario;
    private String estado;
    private String tipoHabitacion;

    public VHabitacion() {
    }

    public VHabitacion(int idHabitacion, String numero, String piso, 
            String descripcion, String caracteristicas, Double precioDiario, 
            String estado, String tipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precioDiario = precioDiario;
        this.estado = estado;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(Double precioDiario) {
        this.precioDiario = precioDiario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
}
