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
    
    public Ferry() {
        super();
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre()
                + "\nMatricula: " + this.getMatricula()
                + "\nFecha Matriculación: " + this.getFechaMatriculacion()
                + "\nMedio de Desplazamiento: " + this.getMedioDesplazamiento()
                + "\nTiene tripulación: " + this.isTripulacion()
                + "\nCantidad de Ruedas: " + this.getNumeroDeRuedas()
                + "\nCapacidad Máxima: " + this.getCapacidadMaxima()
                + "\nPasajeros Actualmente: " + this.getPasajerosActualmente()
                + "\n________________________________________________________\n";
    }


}
