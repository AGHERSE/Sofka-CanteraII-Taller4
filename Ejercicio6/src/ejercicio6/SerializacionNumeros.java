package ejercicio6;

import java.util.Vector;
/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class SerializacionNumeros {
    
    private Vector<Integer> vectorNumeros;
    
    public SerializacionNumeros() {
        this.vectorNumeros = new Vector(1,1);
    }
    
    public void listar() {
        String mensaje = "";
        for (int i = 0; i < this.vectorNumeros.size(); i++) {
            if (i == this.vectorNumeros.size() - 1) {
                mensaje += "" + this.vectorNumeros.get(i);
            }
            else {
                mensaje += this.vectorNumeros.get(i) + "->";
            }
        }
        System.out.println("Lista de números:\n" + mensaje);
    }
    
    public boolean adicionar(int numero) {
        if (search(numero)) {
            System.out.println("Elemento repetido");
            listar();
            return false;
        }
        else{
            vectorNumeros.add(numero);
            return true;
        }
    }
    
    private boolean search(int number) {
        for (int i = 0; i < this.vectorNumeros.size(); i++) {
            if (this.vectorNumeros.get(i) == number) {
                return true;
            }
        }
        return false;
    }
}
