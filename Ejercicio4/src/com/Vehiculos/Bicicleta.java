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
public class Bicicleta extends Vehiculo{
    
    private String tipoBicicleta;
    
    public Bicicleta() {
        super();
        this.tipoBicicleta = "";
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }
    
    public String informacion() {
        return this.toString() + "\nTipo de Bicicleta: " + this.tipoBicicleta
                + "\n___________________________________________\n";
    }
}
