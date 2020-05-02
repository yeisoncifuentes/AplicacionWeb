/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.controller.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author cass465
 */
@Named(value = "mostrarDatos")
@ViewScoped
public class MostrarDatos implements Serializable{
    
    @ManagedProperty("#{index}")
    private Index datosEmpleado;
    /**
     * Creates a new instance of MostrarDatos
     */
    public MostrarDatos() {
    }
    
    public String obtenerDatos(){
        return "";
    }

    public Index getDatosEmpleado() {
        return datosEmpleado;
    }

    public void setDatosEmpleado(Index datosEmpleado) {
        this.datosEmpleado = datosEmpleado;
    }
    
}
