/* Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas
   semanales trabajadas y de su salario por hora. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 2");

        Scanner entrada = new Scanner(System.in);
        int hsemanal;
        float ssemanal,shora,suma;

        //Guardamos salario semanal, horas semanales trabajadas y salario por hora
        System.out.print("Inserta las horas semanales trabajadas: ");
        hsemanal = entrada.nextInt();
        System.out.print("Inserta el salario por hora trabajada: ");
        shora = entrada.nextFloat();
        ssemanal = shora * hsemanal;

        System.out.println("\nEl salario semanal del empleado es: " + ssemanal + " €");
    }
}