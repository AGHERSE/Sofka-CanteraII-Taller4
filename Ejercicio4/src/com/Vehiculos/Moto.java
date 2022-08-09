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
public class Moto extends Vehiculo{
    
    private Integer cilindraje;
    
    public Moto() {
        this.cilindraje = 0;
    }

    public Integer getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    public String informacion() {
        return this.toString() + "\nCilindraje: " + this.cilindraje + "CC";
    }
}
