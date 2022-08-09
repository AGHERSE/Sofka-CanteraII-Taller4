/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Vehiculos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public abstract class Vehiculo {
    private String matricula;
    private String nombre;
    private int capacidadMaxima;
    private int pasajerosActualmente;
    private Date fechaMatriculacion;
    private String medioDesplazamiento;
    private int numeroDeRuedas;
    private boolean tripulacion;
    private int velocidadMaxima;
    private int velocidadActual;
    
    public Vehiculo() {
        this.matricula = "";
        this.nombre = "";
        this.capacidadMaxima = 0;
        this.pasajerosActualmente = 0;
        this.fechaMatriculacion = new Date();
        this.medioDesplazamiento = "";
        this.numeroDeRuedas = 0;
        this.tripulacion = false;
        this.velocidadActual = 0;
        this.velocidadMaxima = 0;
    }

    public Vehiculo(String matricula, String nombre, int capacidadMaxima, int pasajerosActualmente, 
                    Date fechaMatriculacion, String medioDesplazamiento, int numeroDeRuedas, boolean tripulacion,
                    int velocidadActual, int velocidadMaxima) 
    {
        this.matricula = matricula;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajerosActualmente = pasajerosActualmente;
        this.fechaMatriculacion = fechaMatriculacion;
        this.medioDesplazamiento = medioDesplazamiento;
        this.numeroDeRuedas = numeroDeRuedas;
        this.tripulacion = tripulacion;
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getPasajerosActualmente() {
        return pasajerosActualmente;
    }

    public void setPasajerosActualmente(int pasajerosActualmente) {
        this.pasajerosActualmente = pasajerosActualmente;
    }

    public Date getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(Date fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getMedioDesplazamiento() {
        return medioDesplazamiento;
    }

    public void setMedioDesplazamiento(String medioDesplazamiento) {
        this.medioDesplazamiento = medioDesplazamiento;
    }

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public boolean isTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(boolean tripulacion) {
        this.tripulacion = tripulacion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    
    public void subirPasajero() {
        if (this.getPasajerosActualmente() >= this.getCapacidadMaxima()) {
            System.out.println("Se excede la capacidad de pasajeros máxima. No se puede subir.");
        }
        else {
            this.setPasajerosActualmente(this.getPasajerosActualmente() + 1);
            System.out.println("Nuevo pasajero!");
        }
    }

    public void bajarPasajero() {
        if (this.getPasajerosActualmente() == 0) {
            System.out.println("No hay pasajeros actualmente.");
        }
        else {
            this.setVelocidadActual(this.getPasajerosActualmente() - 1);
            System.out.println("Se ha bajado un pasajero.");
        }
    }

    
    public void eleccionVelocidad() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qué desea hacer? "
                + "\n1) Aumentar."
                + "\n2) Reducir.");
        int opcion = teclado.nextInt();
        
        if (opcion == 1) {
            aumentarVelocidad();
        }
        else if (opcion == 2) {
            reducirVelocidad();
        }
    }

    
    public void eleccionPasajeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qué desea hacer? "
                + "\n1) Entrar Pasajero"
                + "\n2) Sacar Pasajero");
        int opcion = teclado.nextInt();
        
        if (opcion == 1) {
            subirPasajero();
        }
        else if (opcion == 2) {
            bajarPasajero();
        }
    }
    
    /**
     * Reduce la velocidad 1km/h
     */
    public void reducirVelocidad() {
        if (this.getVelocidadActual() == 0) {
            System.out.println("No se puede reducir más la velocidad. Velocidad actual: " + this.getVelocidadActual() + "km/h");
        }
        else {
            this.setVelocidadActual(this.getVelocidadActual() - 1);
            System.out.println("Disminuyendo... Velocidad Actual: " + this.getVelocidadActual() + "km/h");
        }
    }
    
    public void aumentarVelocidad() {
        if (this.getVelocidadActual() >= this.getVelocidadMaxima()) {
            System.out.println("No se puede acelerar.");
        }
        else {
            this.setVelocidadActual(this.getVelocidadActual() + 1);
            System.out.println("Aumentando... Velocidad Actual: " + this.getVelocidadActual() + "km/h");
        }
    }
}
