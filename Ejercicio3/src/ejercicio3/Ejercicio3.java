/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListadoNumeros generator = new ListadoNumeros(100);
        try {
            System.out.println("Ingrese la forma de organizar los valores: "
                + "\n1) Quicksort"
                + "\n2) Burbuja"
                + "\n0) Salir.");
            int opcion = teclado.nextInt();
            
            
            if (opcion == 1) {
                generator.QuickSort(0, 99);
                generator.getNumbers();
            }
            else if (opcion == 2) {
                generator.BubbleSort();
            }
            else {
                System.out.println("Opción no válida. Adiós.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
