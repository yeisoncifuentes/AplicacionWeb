/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.model;

import java.io.Serializable;

/**
 *Clase que obtiene todos los datos del empleado
 * 
 * @author cass465
 * @version 1.0.0
 */
public class Empleado implements Serializable{
    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Apellido del empleado
     */
    private String apellido;
    /**
     * cedula del empleado
     */
    private String cedula;
    /**
     * fecha de nacimiento del empleado
     */
    private String fechaNacimiento;
    
    /**
     * dias trabajos del empleado
     */
    private int diasTrabajados;
    
    /**
     * Sueldo base del empleado
     */
    private int sueldoBase;
    
    /**
     * educacion del empleado
     */
    private String educacion;
    
    /**
     * Idiomas que maneja el empleado
     */
    private String[] idiomas;
    
    /**
     * Suedo total del empleado
     */
    private int sueldoTotal;

    /**
     * Constructor de la clase
     * @param nombre
     * @param apellido
     * @param cedula
     * @param fechaNacimiento
     * @param diasTrabajados
     * @param sueldoBase
     * @param educacion
     * @param idiomas
     * @param sueldoTotal 
     */
    public Empleado(String nombre, String apellido, String cedula, String fechaNacimiento, int diasTrabajados, int sueldoBase, String educacion, String[] idiomas, int sueldoTotal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.diasTrabajados = diasTrabajados;
        this.sueldoBase = sueldoBase;
        this.educacion = educacion;
        this.idiomas = idiomas;
        this.sueldoTotal = sueldoTotal;
    }

    
    /**
     * Obtiene el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene la cedula
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Obtiene la fecha de nacimiento
     * @return fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Obtiene los dias trabajados
     * @return 
     */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    /**
     * Obtiene el sueldo base
     * @return sueldoBase
     */
    public int getSueldoBase() {
        return sueldoBase;
    }

    /**
     * Obtiene la educación 
     * @return educacion
     */
    public String getEducacion() {
        return educacion;
    }

    /**
     * Obtiene los idiomas
     * @return idiomas
     */
    public String[] getIdiomas() {
        return idiomas;
    }

    /**
     * Obtiene el sueldo total
     * @return sueldoTotal
     */
    public int getSueldoTotal() {
        return sueldoTotal;
    }

  /**
   * Establece el sueldo total
   * @param sueldoTotal 
   */
    public void setSueldoTotal(int sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }
    
}
