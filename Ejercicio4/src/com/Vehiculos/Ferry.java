/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Vehiculos;

import java.util.Scanner;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class Ferry extends Vehiculo {
    
    private String estilo;
    
    public Ferry() {
        super();
        this.estilo = "";
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    
    public String informacionFerry() {
        return this.toString() 
                + "\nEstilo del ferry: " + this.estilo
                + "\n_______________________________________\n";
    }


}
