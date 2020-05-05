/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.controller.beans;

import edu.unicundi.model.Empleado;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.inject.Inject;

/**
 *Clase controlador que permite mostrar los datos del usuario
 * 
 * @author cass465
 * @version 1.0.0
 */
@Named(value = "mostrarDatos")
@RequestScoped
public class MostrarDatos implements Serializable{
    
    @Inject
    /**
     * Datos del empleado provenientes del index
     */
    private Index datosEmpleado;
    /**
     * Datos del empleado del modelo
     */
    private Empleado empleado;
    /**
     * Creates a new instance of MostrarDatos
     */
    public MostrarDatos() {
        System.out.println("Estoy en el constructor de MostrarDatos");
    }
    
    @PostConstruct
    public void asignarDatos(){
        this.empleado = datosEmpleado.getEmpleado();
        this.empleado.setSueldoTotal(calcularSueldoTotal());
    }
    
    /**
     * Metodo para calcular el sueldo total del empleado
     * @return 
     */
    public int calcularSueldoTotal(){
        int sueldoTotal = this.empleado.getSueldoBase();
        switch(this.empleado.getEducacion()){
            case "Tecnico":
                sueldoTotal += 5000;
                break;
            case "Tecnologico":
                sueldoTotal += 15000;
                break;
            case "Profesional":
                sueldoTotal += 30000;
                break;
            case "Magister":
                sueldoTotal += 40000;
                break;
        }
        sueldoTotal += (this.empleado.getIdiomas().length)*10000;
        sueldoTotal *= this.empleado.getDiasTrabajados();
        return sueldoTotal;
    }
    
    /**
     * Metodo para obtener los datos del index
     * 
     * @return datosEmpleado
     */
    public Index getDatosEmpleado() {
        return datosEmpleado;
    }

    /**
     * Metodo para establecer los datos del index
     * 
     * @param datosEmpleado 
     */
    public void setDatosEmpleado(Index datosEmpleado) {
        this.datosEmpleado = datosEmpleado;
    }

    /**
     * Metodo para obtener los datos del modelo
     * 
     * @return 
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Metodo para obtener los datos del modelo
     * 
     * @param empleado 
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
}
