/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SerializacionNumeros numeros = new SerializacionNumeros();
        int numero = 0;
        boolean condicion = true;
        do {            
            System.out.println("Ingrese el nuevo número: ");
            numero = teclado.nextInt();
            condicion = numeros.adicionar(numero);
        } while (condicion);
    }
    
}
