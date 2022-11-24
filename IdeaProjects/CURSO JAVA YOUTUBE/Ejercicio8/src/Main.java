import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("EJERCICIO 8");
        System.out.println("---------------------");

        Scanner entrada = new Scanner(System.in);
        double a,b,c,resultado1,resultado2;

        System.out.print("Introduzca el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Introduzca el valor de b: ");
        b = entrada.nextDouble();
        System.out.print("Introduzca el valor de c: ");
        c = entrada.nextDouble();

        resultado1 = (-b+Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
        resultado2 = (-b-Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);

        System.out.println("\nEl resultado de la raíz1 es: " + resultado1);
        System.out.println("\nEl resultado de la raíz2 es: " + resultado2);
    }
}