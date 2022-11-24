import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("EJERCICIO 7");
        System.out.println("---------------------");

        Scanner entrada = new Scanner(System.in);
        int horas,dias,semanas, horasrestantes,total;

        //Introducimos los valores
        System.out.print("Introduce el número total de horas: ");
        horas = entrada.nextInt();

        semanas = horas/168;
        dias = horas%168/24;
        horasrestantes = horas%24;


        System.out.println("\n" + horas + " horas son " + semanas + " semanas, " + dias + " días y " + horasrestantes + " horas.");
    }
}