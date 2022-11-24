import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("EJERCICIO 6");
        System.out.println("------------------------------------");

        Scanner entrada = new Scanner(System.in);
        double a,b,total;

        //Insertamos las entradas
        System.out.print("El valor de a es: ");
        a = entrada.nextDouble();
        System.out.print("El valor de b es: ");
        b = entrada.nextDouble();
        System.out.println("El valor introducido de a es: " + a);
        System.out.println("El valor introducido de b es: " + b);

        total = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        System.out.println("\nEl resultado de (a+b)^2 = " + total);
    }
}