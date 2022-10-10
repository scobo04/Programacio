/* Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1");

        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;

        //Guardamos las 3 notas
        System.out.print("Digite tres calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1 + nota2 + nota3; //Sumamos las 3 notas

        System.out.println("\nLa suma es: " + suma);
    }
}