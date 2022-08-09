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
public class Lancha extends Vehiculo{
    
    //De vela o a motor
    private String tipoEquipamento;
    
    public Lancha() {
        super();
        this.tipoEquipamento = "";
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }
    
    public String informacion() {
        return this.toString() + "\nTipo de Equipamento: " + this.tipoEquipamento
                + "\n__________________________________________________\n";
    }
}
