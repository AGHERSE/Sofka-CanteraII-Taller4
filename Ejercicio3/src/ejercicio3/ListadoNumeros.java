package ejercicio3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class ListadoNumeros {
    private ArrayList<Double> listOfRandomNumbers;
    
    
    
    public ListadoNumeros(int sizeOfArray) {
        this.listOfRandomNumbers = new ArrayList<>();
        fillArray(sizeOfArray);
        getNumbers();
    }
    
    public void getNumbers() {
        System.out.println("Listado de números.");
        for (Double number : listOfRandomNumbers) {
            System.out.println(number);
        }
    }
    
    private void fillArray(int sizeCounter) {
        Random randomNumber = new Random();
        for (int i = 0; i < sizeCounter; i++) {
            this.listOfRandomNumbers.add(Math.random() * 100 + 1);
        }
    }
    
    public void intercambiar(int i, int j) {
        Double aux = listOfRandomNumbers.get(i);
        listOfRandomNumbers.set(i, listOfRandomNumbers.get(j));
        listOfRandomNumbers.set(j, aux);
        
    }
    
    public void BubbleSort() {
        for (int i = 1; i < listOfRandomNumbers.size(); i++){
            for (int j = 0; j < listOfRandomNumbers.size() - i; j++){
                if (listOfRandomNumbers.get(j) > listOfRandomNumbers.get(j+1)){
                    intercambiar(j, j+1);
                }
            }
        }
        getNumbers();
    }
    
    public void QuickSort(int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = splitListOfNumbers(izquierda, derecha);
            QuickSort(izquierda, indiceParticion);
            QuickSort(indiceParticion + 1, derecha);
        }
    }
    
    private int splitListOfNumbers(int izquierda, int derecha) {
        double pivote = listOfRandomNumbers.get(izquierda);
        while (true) {
            
            while (listOfRandomNumbers.get(izquierda) < pivote) {
                izquierda++;
            }
            while (listOfRandomNumbers.get(derecha) > pivote) {
                derecha--;
            }
            
            if (izquierda >= derecha) {
                return derecha;
            } 
            else {
                intercambiar(izquierda, derecha);
                izquierda++;
                derecha--;
            }
        }
    }
}
