package com;

import com.Vehiculos.*;
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
        ArrayList<Coche> coches = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();
        ArrayList<Camion> camiones = new ArrayList<>();
        ArrayList<Bicicleta> bicicletas = new ArrayList<>();
        ArrayList<Lancha> lanchas = new ArrayList<>();
        
        Ferry newFerry;
        Coche newCar;
        Moto newMotorcycle;
        Camion newTruck;
        Bicicleta newBycicle;
        Lancha newBoat;
        
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
                            + "\n1) Ferry." + "\n2) Coche"
                            + "\n3) Moto" + "\n4) Camion"
                            + "\n5) Bicicleta" + "\n6) Lancha"
                            + "\n0) Salir.", 0, 6);
                    
                    if (opcionSecundaria == 1) {
                        
                        if (ferrys.size() >= 10) {
                            System.out.println("No se puede realizar la acción.");
                        }
                        else {
                            newFerry = new Ferry();
                            getVehicleData(newFerry);
                            getFerryData(newFerry);
                            ferrys.add(newFerry);
                            System.out.println("Añadido con éxito.");
                        }
                        
                    }
                    else if (opcionSecundaria == 2) {
                        if (coches.size() >= 10) {
                            System.out.println("No se puede realizar la acción.");
                        }
                        else {
                            newCar = new Coche();
                            getVehicleData(newCar);
                            getCarData(newCar);
                            coches.add(newCar);
                            System.out.println("Añadido con éxito.");
                        }
                    }
                    else if (opcionSecundaria == 3) {
                        if (motos.size() >= 10) {
                            System.out.println("No se puede realizar la acción.");
                        }
                        else {
                            newMotorcycle = new Moto();
                            getVehicleData(newMotorcycle);
                            getMotorcycleData(newMotorcycle);
                            motos.add(newMotorcycle);
                            System.out.println("Añadido con éxito.");
                        }
                    }
                    else if (opcionSecundaria == 4) {
                        if (camiones.size() >= 10) {
                            System.out.println("No se puede realizar la acción.");
                        }
                        else {
                            newTruck = new Camion();
                            getVehicleData(newTruck);
                            getTruckData(newTruck);
                            camiones.add(newTruck);
                            System.out.println("Añadido con éxito.");
                        }
                    }
                    else if (opcionSecundaria == 5) {
                        if (bicicletas.size() >= 10) {
                            System.out.println("No se puede realizar la acción.");
                        }
                        else {
                            newBycicle = new Bicicleta();
                            getVehicleData(newBycicle);
                            getBicycleData(newBycicle);
                            bicicletas.add(newBycicle);
                            System.out.println("Añadido con éxito.");
                        }
                    }
                    else if (opcionSecundaria == 6) {
                        if (lanchas.size() >= 10) {
                            System.out.println("No se puede realizar la acción.");
                        }
                        else {
                            newBoat = new Lancha();
                            getVehicleData(newBoat);
                            getBoatData(newBoat);
                            lanchas.add(newBoat);
                            System.out.println("Añadido con éxito.");
                        }
                    }
                    break;
                 
                    
                    
                    
                case 2:
                    opcionSecundaria = generarOpcion("Ingrese el tipo de vehiculo a registrar:"
                            + "\n1) Ferry."
                            + "\n2) Coche"
                            + "\n3) Moto"
                            + "\n4) Camion"
                            + "\n5) Bicicleta"
                            + "\n6) Lancha"
                            + "\n0) Salir.", 0, 6);
                    
                    if (opcionSecundaria == 1) {
                        System.out.println("Digite la matricula del ferry.");
                        matricula = teclado.nextLine();
                        
                        for (Ferry ferry : ferrys) {
                            if (ferry.getMatricula().equals(matricula)) {
                                ferry.eleccionVelocidad();
                            }
                        }
                    }
                    else if (opcionSecundaria == 2) {
                        System.out.println("Digite la matricula del coche.");
                        matricula = teclado.nextLine();
                        
                        for (Coche coche : coches) {
                            if (coche.getMatricula().equals(matricula)) {
                                coche.eleccionVelocidad();
                            }
                        }
                    }
                    else if (opcionSecundaria == 3) {
                        System.out.println("Digite la matricula de la moto.");
                        matricula = teclado.nextLine();
                        
                        for (Moto moto : motos) {
                            if (moto.getMatricula().equals(matricula)) {
                                moto.eleccionVelocidad();
                            }
                        }
                    }
                    else if (opcionSecundaria == 4) {
                        System.out.println("Digite la matricula del camión.");
                        matricula = teclado.nextLine();
                        
                        for (Camion camion : camiones) {
                            if (camion.getMatricula().equals(matricula)) {
                                camion.eleccionVelocidad();
                            }
                        }
                    }
                    else if (opcionSecundaria == 5) {
                        System.out.println("Digite la matricula de la bicicleta.");
                        matricula = teclado.nextLine();
                        
                        for (Bicicleta bici : bicicletas) {
                            if (bici.getMatricula().equals(matricula)) {
                                bici.eleccionVelocidad();
                            }
                        }
                    }
                    else if (opcionSecundaria == 6) {
                        System.out.println("Digite la matricula de la lancha.");
                        matricula = teclado.nextLine();
                        
                        for (Lancha lancha : lanchas) {
                            if (lancha.getMatricula().equals(matricula)) {
                                lancha.eleccionVelocidad();
                            }
                        }
                    }
                    break;
                    
                    
                    
                    
                case 3:
                    opcionSecundaria = generarOpcion("Ingrese el tipo de vehiculo a registrar:"
                            + "\n1) Ferry."
                            + "\n2) Coche"
                            + "\n3) Moto"
                            + "\n4) Camion"
                            + "\n5) Bicicleta"
                            + "\n6) Lancha"
                            + "\n0) Salir.", 0, 6);
                    
                    if (opcionSecundaria == 1) {
                        System.out.println("Digite la matricula del ferry.");
                        matricula = teclado.nextLine();
                        
                        for (Ferry ferry : ferrys) {
                            if (ferry.getMatricula().equals(matricula)) {
                                ferry.eleccionPasajeros();
                            }
                        }
                        
                    }
                    else if (opcionSecundaria == 2) {
                        System.out.println("Digite la matricula del coche.");
                        matricula = teclado.nextLine();
                        
                        for (Coche coche : coches) {
                            if (coche.getMatricula().equals(matricula)) {
                                coche.eleccionPasajeros();
                            }
                        }
                        
                    }
                    else if (opcionSecundaria == 3) {
                        System.out.println("Digite la matricula de la moto.");
                        matricula = teclado.nextLine();
                        
                        for (Moto moto : motos) {
                            if (moto.getMatricula().equals(matricula)) {
                                moto.eleccionPasajeros();
                            }
                        }
                    }
                    else if (opcionSecundaria == 4) {
                        System.out.println("Digite la matricula del camión.");
                        matricula = teclado.nextLine();
                        
                        for (Camion camion : camiones) {
                            if (camion.getMatricula().equals(matricula)) {
                                camion.eleccionPasajeros();
                            }
                        }
                    }
                    else if (opcionSecundaria == 5) {
                        System.out.println("Digite la matricula de la bicicleta.");
                        matricula = teclado.nextLine();
                        
                        for (Bicicleta bicicleta : bicicletas) {
                            if (bicicleta.getMatricula().equals(matricula)) {
                                bicicleta.eleccionPasajeros();
                            }
                        }
                    }
                    else if (opcionSecundaria == 6) {
                        System.out.println("Digite la matricula de la lancha.");
                        matricula = teclado.nextLine();
                        
                        for (Lancha lancha : lanchas) {
                            if (lancha.getMatricula().equals(matricula)) {
                                lancha.eleccionPasajeros();
                            }
                        }
                    }
                    
                    
                    break;
                case 4:
                    opcionSecundaria = generarOpcion("Ingrese el tipo de vehiculo a registrar:"
                            + "\n1) Ferry."
                            + "\n2) Coche"
                            + "\n3) Moto"
                            + "\n4) Camion"
                            + "\n5) Bicicleta"
                            + "\n6) Lancha"
                            + "\n0) Salir.", 0, 6);
                    
                    
                    if (opcionSecundaria == 1) {
                        for (Ferry ferry : ferrys) {
                            System.out.println(ferry.informacionFerry());
                        }
                    }
                    else if (opcionSecundaria == 2) {
                        for (Coche coche : coches) {
                            System.out.println(coche.informacion());
                        }
                    }
                    else if (opcionSecundaria == 3) {
                        for (Moto moto : motos) {
                            System.out.println(moto.informacion());
                        }
                    }
                    else if (opcionSecundaria == 4) {
                        for (Camion camion : camiones) {
                            System.out.println(camion.informacion());
                        }
                    }
                    else if (opcionSecundaria == 5) {
                        for (Bicicleta bici : bicicletas) {
                            System.out.println(bici.informacion());
                        }
                    }
                    else if (opcionSecundaria == 6) {
                        for (Lancha lancha : lanchas) {
                            System.out.println(lancha.informacion());
                        }
                    }
                    
                    
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
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
    
    public static void getFerryData(Ferry data) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qué clase de estilo tiene el ferry?");
        data.setEstilo(teclado.nextLine());
    }
    
    public static void getCarData(Coche data) {
        Scanner teclado = new Scanner(System.in);
        int entradas = 0;
        do {            
            System.out.println("Tiene 3, 4 o 5 entradas?");
            entradas = teclado.nextInt();
        } while (entradas < 3 || entradas > 5);
        data.setCantidadPuertas(entradas);
    }
    
    public static void getMotorcycleData(Moto data) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el cilindraje de la moto.");
        data.setCilindraje(teclado.nextInt());
    }
    
    public static void getTruckData(Camion data) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura del camión (m).");
        data.setAltura(teclado.nextDouble());
    }
    
    public static void getBicycleData(Bicicleta data) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tipo de bicicleta que es: (BMX, De Ruta, Urbana)");
        data.setTipoBicicleta(teclado.nextLine());
    }
    
    public static void getBoatData(Lancha data) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tipo de lancha que es: (a vela, en motor)");
        data.setTipoEquipamento(teclado.nextLine());
    }
}
