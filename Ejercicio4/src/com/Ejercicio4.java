package com;

import com.Vehiculos.Ferry;
import com.Vehiculos.Vehiculo;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ferry> ferrys = new ArrayList<>();
        Ferry newFerry;
        int opcion = 0;
        int opcionSecundaria = 0;
        String matricula;
        Scanner teclado = new Scanner(System.in);
        
        
        do {
            
            opcion = generarOpcion("Ingrese la opción que desea realizar: "
                    + "\n1) Agregar un nuevo vehiculo."
                    + "\n2) Manejo de Velocidad."
                    + "\n3) Manejo de Pasajeros."
                    + "\n4) Ver Listado de Vehiculos."
                    + "\n0) Salir.", 0, 4);
            
            switch (opcion) {
                case 0: break;
                case 1:
                    opcionSecundaria = generarOpcion("Ingrese el tipo de vehiculo a registrar:"
                            + "\n1) Ferry."
                            + "\n0) Salir.", 0, 1);
                    
                    if (opcionSecundaria == 1) {
                        
                        if (ferrys.size() >= 10) {
                            System.out.println("No se puede realizar la acción.");
                        }
                        else {
                            newFerry = new Ferry();
                            getVehicleData(newFerry);
                            ferrys.add(newFerry);
                            System.out.println("Añadido con éxito.");
                        }
                        
                    }
                    break;
                 
                case 2:
                    opcionSecundaria = generarOpcion("Ingrese el tipo de vehiculo a realizar acción:"
                            + "\n1) Ferry."
                            + "\n0) Salir.", 0, 1);
                    
                    if (opcionSecundaria == 1) {
                        System.out.println("Digite la matricula del ferry.");
                        matricula = teclado.nextLine();
                        
                        for (Ferry ferry : ferrys) {
                            if (ferry.getMatricula().equals(matricula)) {
                                ferry.eleccionVelocidad();
                            }
                        }
                        
                    }
                    
                    break;
                    
                case 3:
                    opcionSecundaria = generarOpcion("Ingrese el tipo de vehiculo a realizar acción:"
                            + "\n1) Ferry."
                            + "\n0) Salir.", 0, 1);
                    
                    if (opcionSecundaria == 1) {
                        System.out.println("Digite la matricula del ferry.");
                        matricula = teclado.nextLine();
                        
                        for (Ferry ferry : ferrys) {
                            if (ferry.getMatricula().equals(matricula)) {
                                ferry.eleccionPasajeros();
                            }
                        }
                        
                    }
                    break;
                    
                case 4:
                    opcionSecundaria = generarOpcion("Seleccione los tipos de vehículos para listar:"
                            + "\n1) Ferry."
                            + "\n0) Salir.", 0, 1);
                    
                    if (opcionSecundaria == 1) {
                        for (Ferry ferry : ferrys) {
                            System.out.println(ferry.toString());
                        }
                    }
                    
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        
        
    }
    
    public static int generarOpcion(String message, int min, int max) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        
        do {
            try {
                System.out.println(message);
                opcion = teclado.nextInt();
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            
        } while (opcion < min || opcion > max);
        return opcion;
    }
    
    public static void getVehicleData(Vehiculo newVehicle) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la matricula del vehículo.");
        newVehicle.setMatricula(teclado.nextLine());
        System.out.println("Ingrese el nombre del vehículo.");
        newVehicle.setNombre(teclado.nextLine());
        System.out.println("Ingrese la fecha de matriculación del vehículo. (yyyy-MM-dd)");
        newVehicle.setFechaMatriculacion(Date.valueOf(teclado.nextLine()));
        System.out.println("Ingrese el nombre del vehículo.");
        newVehicle.setNombre(teclado.nextLine());
        System.out.println("Ingrese el medio de desplazamiento del vehículo.");
        newVehicle.setMedioDesplazamiento(teclado.nextLine());
        System.out.println("Tiene tripulación a bordo? (true||false)");
        newVehicle.setTripulacion(teclado.nextBoolean());
        System.out.println("Ingrese la cantidad de ruedas del vehículo.");
        newVehicle.setNumeroDeRuedas(teclado.nextInt());
        
        System.out.println("Ingrese la velocidad máxima del vehículo.");
        newVehicle.setVelocidadMaxima(teclado.nextInt());
        newVehicle.setVelocidadActual(0);
        
        System.out.println("Ingrese la cantidad máxima de pasajeros: ");
        newVehicle.setCapacidadMaxima(teclado.nextInt());
        newVehicle.setPasajerosActualmente(0);
    }
    
    
    public static void manipulacionDePasajeros() {
        
    }
}
