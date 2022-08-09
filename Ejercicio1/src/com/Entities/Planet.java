package com.Entities;

import java.util.Scanner;

/**
 * Clase encargada de obtener en forma de nodo la información de un planeta.
 * @author AGUSTIN HERNANDEZ
 */
public class Planet {
    
    private String name;
    private String identification;
    private double mass;
    private double density;
    private double sunDistance;
    private double gravityForce;
    private double diameter;
    
    /**
     * Constructor que tiene inicialización de variables con un valor en default.
     */
    public Planet() {
        this.name = "";
        this.identification = "";
        this.mass = 0;
        this.density = 0;
        this.sunDistance = 0;
        this.gravityForce = 0;
        this.diameter = 0;
    }

    /**
     * Constructor que define las variables inicializadas con datos que se hayan tomado con anterioridad.
     * @param name
     * @param identification
     * @param mass
     * @param density
     * @param sunDistance 
     * @param gravityForce 
     * @param diameter 
     */
    public Planet(String name, String identification, double mass, double density, 
                  double sunDistance, double gravityForce, double diameter) 
    {
        this.name = name;
        this.identification = identification;
        this.mass = mass;
        this.density = density;
        this.sunDistance = sunDistance;
        this.gravityForce = gravityForce;
        this.diameter = diameter;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getSunDistance() {
        return sunDistance;
    }

    public void setSunDistance(double sunDistance) {
        this.sunDistance = sunDistance;
    }

    public double getGravityForce() {
        return gravityForce;
    }

    public void setGravityForce(double gravityForce) {
        this.gravityForce = gravityForce;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Nombre: " + name +
               "\nIdentificación: " + identification + 
               "\nMasa (kg): " + mass + 
               "\nDensidad: " + density +
               "\nDistancia con el sol (kg): " + sunDistance + 
               "\nFuerza de Gravedad: " + gravityForce + 
               "\nDiametro (m): " + diameter +
               "\n________________________________________________";
    }
    
    
}
