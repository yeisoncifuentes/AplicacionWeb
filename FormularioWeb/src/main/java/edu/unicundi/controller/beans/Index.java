/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.controller.beans;

import edu.unicundi.model.Empleado;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * Managed Bean de la vista index
 * @author Yeison Cifuentes
 * @version 1.0.0 
 */
@Named(value = "index")
@SessionScoped
public class Index implements Serializable {

    /**
     * Asigna a un empleado los datos del formulario
     */
    private Empleado empleado;
    
    /**
     * Obtiene el nombre del formulario
     */
    private String nombre;
    
    /**
     * Obtiene el apellido del formulario
     */
    private String apellido;
    
    /**
     * Obtiene la cedula del formulario
     */
    private String cedula;
    
    /**
     * Obtiene la fechaNacimiento del formulario
     */
    private String fechaNacimiento;
    
    /**
     * Obtiene los diasTrabajados del formulario
     */
    private int diasTrabajados;
    
    /**
     * Obtiene el sueldoBase del formulario
     */
    private int sueldoBase;
    
    /**
     * Obtiene la educacion del formulario
     */
    private String educacion;
    
    /**
     * Obtiene los idiomas del formulario
     */
    private String[] idiomas;

    /**
     * Constructor del Managed Bean Index
     */
    public Index() {
        System.out.println("Estoy en el constructor de Index");
    }
    
    /**
     * Metodo que obtiene los datos del formulario y se los asigna a un empleado
     * @return redireccion de la pagina
     */
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

    /**
     * Obtiene el empleado
     * @return empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Establece el empleado
     * @param empleado 
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Obtiene el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la cedula
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Establece la cedula
     * @param cedula 
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene la fecha de nacimiento
     * @return fecha de nacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento
     * @param fechaNacimiento 
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene los dias trabajados
     * @return dias trabajados
     */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    /**
     * Establece los dias trabajados
     * @param diasTrabajados 
     */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    /**
     * Obtiene el sueldo base
     * @return sueldo base
     */
    public int getSueldoBase() {
        return sueldoBase;
    }

    /**
     * Estsblece el sueldo base
     * @param sueldoBase 
     */
    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * Obtiene el nivel de educacion
     * @return 
     */
    public String getEducacion() {
        return educacion;
    }

    /**
     * Establece el nivel de educacion
     * @param educacion 
     */
    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    /**
     * Obtiene los idiomas
     * @return idiomas
     */
    public String[] getIdiomas() {
        return idiomas;
    }

    /**
     * Establece los idiomas
     * @param idiomas 
     */
    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

}
