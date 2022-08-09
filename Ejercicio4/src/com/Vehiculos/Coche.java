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
public class Coche extends Vehiculo {
    
    private int cantidadPuertas;
    
    public Coche() {
        super();
        this.cantidadPuertas = 0;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
    public String informacion() {
        return this.toString() + "\nCantidad de Puertas: " + this.cantidadPuertas
                + "\n___________________________________________\n";
        
    }
}
