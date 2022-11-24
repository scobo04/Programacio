/*Ejercicio 5: La calificación final de un estudiante de informàtica se calcula con base a las calificaciones de
* cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen
* final. Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%,
* 25% y 40%. Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 5");

        Scanner entrada = new Scanner(System.in);
        float participacion,examen1,examen2,examenfinal,total;

        //Calculamos la nota final del estudiante
        System.out.print("Nota de participación en clase: ");
        participacion = entrada.nextFloat();
        System.out.print("Nota del primer examen parcial: ");
        examen1 = entrada.nextFloat();
        System.out.print("Nota del segundo examen parcial: ");
        examen2 = entrada.nextFloat();
        System.out.print("Nota del examen final: ");
        examenfinal = entrada.nextFloat();

        //Sumamos las notas
        total = (participacion * 0.1f) + (examen1 * 0.25f) + (examen2 * 0.25f) + (examenfinal * 0.4f);

        //Imprimimos las notas de cada aspecto
        System.out.println("La nota de participación en clase es un " + participacion);
        System.out.println("La nota del primer examen parcial es un " + examen1);
        System.out.println("La nota del segundo examen parcial es un " + examen2);
        System.out.println("La nota del examen final es un " + examenfinal);

        DecimalFormat df = new DecimalFormat("###.##");

        //Imprimimos la nota final
        System.out.println("\nLa nota final obtenida por el estudiante es un " + df.format(total));

    }
}