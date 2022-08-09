package com.Services;

import com.Entities.Planet;
import java.util.ArrayList;

/**
 * Listado de planetas junto con diferentes funciones.
 * @author AGUSTIN HERNANDEZ
 */
public class PlanetList {
    
    private ArrayList<Planet> ListOfPlanets;
    
    /**
     * Constante de gravedad universal.
     */
    private final Double gravityConst;
    
    public PlanetList() {
        this.ListOfPlanets = new ArrayList<>();
        this.gravityConst = 6.67 * Math.pow(10, -11);
    }

    public ArrayList<Planet> getListOfPlanets() {
        return ListOfPlanets;
    }
    
    
    public void addNewPlanet(Planet newPlanet) {
        this.ListOfPlanets.add(newPlanet);
    }
    
    public int getTotalOfPlanets() {
        return this.ListOfPlanets.size();
    }
    
    /**
     * Muestra toda la información de los planetas.
     */
    public void getInformationOfPlanets() {
        for (Planet planet : ListOfPlanets) {
            System.out.println(planet.toString());
        }
    }
    
    /**
     * Busca un planeta a partir de su identificación.
     * En caso de encontrar una identificación igual al parámetro, se retorna la información del planeta.
     * En caso contrario, se devuelve un valor nulo.
     * @param identification
     * @return ? Planet:null;
     */
    public Planet findByIdentification(String identification) {
        for (Planet planet : ListOfPlanets) {
            if (planet.getIdentification().toUpperCase().equals(identification.toUpperCase())) {
                return planet;
            }
        }
        return null;
    }
    
    /**
     * Halla la fuerza gravitacional a partir de la identificación de dos planetas.
     * En caso de que alguno de los dos planetas no exista, se retorna un 0. En caso contrario, hace la operación.
     * Información buscada en: 
     * https://www.fisicalab.com/apartado/fuerza-gravitatoria#:~:text=Esta%20ley%20establece%20que%20los,por%20qu%C3%A9%20orbitan%20los%20planetas.
     * 
     * @param firstPlanet
     * @param secondPlanet
     * @return 0/formula
     */
    public double findGravitatoryAtraction(String firstPlanet, String secondPlanet) {
        Planet planet1 = findByIdentification(firstPlanet);
        Planet planet2 = findByIdentification(secondPlanet);
        double formula = 0;
        double distanceBetweenPlanets;
        
        //En caso que alguno de los dos planetas no sean encontrados simplemente 
        //se retorna como valor 0.
        if (planet1 == null || planet2 == null) {
            System.out.println("Uno de los planetas o los dos planetas no se encuentran registrados.");
            return 0;
        }
        else {
            /**
             * A partir de la distancia que hay entre los planetas y el sol, se toma el 
             * valor delta que será la diferencia entre los dos planetas.
            */
            distanceBetweenPlanets = Math.abs((planet1.getSunDistance() - planet2.getSunDistance()));
            
            formula = -gravityConst * (planet1.getMass() * planet2.getMass()) / distanceBetweenPlanets;
                    
            return formula;
            
        }
    }
}
