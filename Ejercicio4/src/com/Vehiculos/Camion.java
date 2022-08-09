/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Vehiculos;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class Camion extends Vehiculo {
    
    //Altura en metros.
    private Double altura;
    
    public Camion() {
        super();
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public String informacion() {
        return toString() + "\nAltura del camión: " + this.altura
                + "\n___________________________________________\n";
    }
}
