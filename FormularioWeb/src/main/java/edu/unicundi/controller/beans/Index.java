/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.controller.beans;

import edu.unicundi.model.Empleado;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author YEISON
 */
@Named(value = "index")
@ViewScoped
public class Index implements Serializable {

    private Empleado empleado;
    private String nombre;
    private String apellido;
    private String cedula;
    private String fechaNacimiento;
    private int diasTrabajados;
    private int sueldoBase;
    private String educacion;
    private String[] idiomas;

    /**
     * Creates a new instance of Index
     */
    public Index() {
        System.out.println("Estoy en el constructor");
    }

    public String capturarDatos() {
        if (educacion == null) {
            educacion = "Ningun rango de educación";
        }
        if (idiomas.length == 0) {
            idiomas = new String[1];
            idiomas[0] = "No registra idiomas";
        }
        empleado = new Empleado(nombre, apellido, cedula, fechaNacimiento, diasTrabajados, sueldoBase, educacion, idiomas, sueldoBase);
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Cedula: " + empleado.getCedula());
        System.out.println("Fecha Nacimiento: " + empleado.getFechaNacimiento());
        System.out.println("Dias Trabajados: " + empleado.getDiasTrabajados());
        System.out.println("Sueldo Base: " + empleado.getSueldoBase());
        System.out.println("Educación: " + empleado.getEducacion());
        for (int i = 0; i < empleado.getIdiomas().length; i++) {
            System.out.println("Idioma" + (i + 1) + ": " + empleado.getIdiomas()[i]);
        }
        return "faces/mostrarDatos.xhtml?faces-redirect=true";
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

}
