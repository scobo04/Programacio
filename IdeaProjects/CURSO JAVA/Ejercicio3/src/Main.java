/* Ejercicio 3: Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo
   que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre
   los tres. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 3");

        Scanner entrada = new Scanner(System.in);
        int dGuillermo,dLuis,dJuan,suma;

        //Calculamos el dinero que tiene cada uno
        System.out.print("Inserta los dólares que posse Guillermo: ");
        dGuillermo = entrada.nextInt();

        dLuis = dGuillermo / 2; //Luis tiene la mitad de lo que posee Guillermo
        dJuan = (dGuillermo + dLuis) / 2; //Juan tiene la mitad de lo que poseen Guillermo y Luis juntos

        suma = dGuillermo + dLuis + dJuan; //Sumamos lo que poseen los tres juntos

        System.out.println("Guillermo tiene " + dGuillermo + " $");
            System.out.println("Luis tiene " + dLuis + " $");
        System.out.println("Juan tiene " + dJuan + " $");
        System.out.println("\nEntre los tres tienen " + suma + " $");
    }
}