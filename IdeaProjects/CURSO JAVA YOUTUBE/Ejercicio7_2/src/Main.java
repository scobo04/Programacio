import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 15");

        int numeros[] = {5, 10, 8};
        int mayor = numeros[0];

        for (int x = 1; x < numeros.length; x++) {
            int numeroActual = numeros[x];
            if (numeroActual > mayor) {
                mayor = numeroActual;
            }
        }
        System.out.printf("Mayor: %d", mayor);
        //TENGO QUE REPETIR EL EJERCICIO
    }
}