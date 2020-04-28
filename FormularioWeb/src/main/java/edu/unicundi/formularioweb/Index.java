/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.formularioweb;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author YEISON
 */
@Named(value = "index")
@ViewScoped
public class Index {
    private String nombre;
    /**
     * Creates a new instance of Index
     */
    public Index() {
        System.out.println("estoy en el constructor");
    }
    
    public void capturarDatos(){
        System.out.println(nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
