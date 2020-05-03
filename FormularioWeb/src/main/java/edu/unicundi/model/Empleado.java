/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.model;

import java.io.Serializable;

/**
 *
 * @author cass465
 */
public class Empleado implements Serializable{
    private String nombre;
    private String apellido;
    private String cedula;
    private String fechaNacimiento;
    private int diasTrabajados;
    private int sueldoBase;
    private String educacion;
    private String[] idiomas;
    private int sueldoTotal;

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

    
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public String getEducacion() {
        return educacion;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public int getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(int sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }
    
}
