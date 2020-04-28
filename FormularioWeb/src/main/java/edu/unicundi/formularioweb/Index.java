/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.formularioweb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author YEISON
 */
@Named(value = "index")
@RequestScoped
public class Index {
    private String nombre;
    
    /**
     * Creates a new instance of Index
     */
    public Index() {
        
    }
    
    public void capturarInfo(){
        
    }

    public String getNombre() {
        return nombre;
    }
    
}
