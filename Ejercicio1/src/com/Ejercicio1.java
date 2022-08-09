/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.Entities.Planet;
import com.Services.PlanetList;
import java.util.Scanner;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PlanetList functions = new PlanetList();
        Planet newPlanet;
        int opcion = 0;
        
        do {
            opcion = menu();
            switch (opcion) {
                case 0: break;
                case 1:
                    newPlanet = new Planet();
                    getPlanetData(functions, newPlanet);
                    break;
                case 2:
                    functions.getInformationOfPlanets();
                    break;
                case 3:
                    System.out.println("Ingrese la identificación del planeta a buscar.");
                    newPlanet = functions.findByIdentification(teclado.nextLine());
                    if (newPlanet == null) {
                        System.out.println("No hay planeta registrado.");
                    }
                    else {
                        System.out.println(newPlanet.toString());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la identificación del planeta 1: ");
                    String id1 = teclado.nextLine();
                    System.out.println("Ingrese la identificación del planeta 2: ");
                    String id2 = teclado.nextLine();
                    System.out.println("La fuerza gravitacional que está entre los dos planetas es: "
                            + functions.findGravitatoryAtraction(id1, id2));
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 0);
        
    }
    
    /**
     * Crea un menú para que el usuario vaya digitando la opción que desea.
     * @return 
     */
    public static int menu() {
        Scanner getUserData = new Scanner(System.in);
        int opcion = 0;
        try {
            do {            
                System.out.println("Ingrese la opción que desea: "
                        + "\n1) Agregar un nuevo planeta."
                        + "\n2) Ver Planetas Registrados."
                        + "\n3) Buscar información de planeta."
                        + "\n4) Calcular Fuerza Gravitatoria entre dos planetas."
                        + "\n0) Salir.");
                opcion = getUserData.nextInt();
            } while (opcion < 0 || opcion > 4);
        } catch (Exception e) {
            System.out.println("Error. Ingrese bien el dato.");
        }
        return opcion;
    }
    
    public static void getPlanetData(PlanetList listOfPlanets, Planet newPlanet) {
        Scanner teclado = new Scanner(System.in);
        String identification = "";
        
        
        do {            
            System.out.println("Ingrese la identificación del planeta.");
            identification = teclado.nextLine();
        } while (listOfPlanets.findByIdentification(identification) != null);
        newPlanet.setIdentification(identification);
        
        System.out.println("Ingrese el nombre del planeta.");
        newPlanet.setName(teclado.nextLine());
        
        try {
            System.out.println("Ingrese la masa que tiene el planeta.");
            newPlanet.setMass(teclado.nextDouble());
            System.out.println("Ingrese la densidad que tiene el planeta.");
            newPlanet.setDensity(teclado.nextDouble());
            System.out.println("Ingrese el diametro del planeta.");
            newPlanet.setDiameter(teclado.nextDouble());
            System.out.println("Ingrese la fuerza de gravedad del planeta.");
            newPlanet.setGravityForce(teclado.nextDouble());
            System.out.println("Ingrese la distancia con el sol.");
            newPlanet.setSunDistance(teclado.nextDouble());
            
            listOfPlanets.addNewPlanet(newPlanet);
            System.out.println("Agregado.");
        } catch (Exception e) {
            System.out.println("Error al momento de agregar el planeta.");
        }
    }
}
