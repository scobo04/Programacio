import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("CLASE MATH");
        System.out.println("------------------------------------------------");

        //Sacamos la raíz cuadrada en int
        int raiz = (int)Math.sqrt(9);

        //Imprimimos el resultado con int
        System.out.println("------------------------------------------------");
        System.out.println("La raíz cuadrada de 9 es " + raiz + ".");

        //Sacamos la raíz cuadrada en double
        double raiz2 = Math.sqrt(87.39);

        //Imprimimos el resultado con double
        System.out.println("La raíz cuadrada de 87.39 es " + raiz2 + ".");
        System.out.println("------------------------------------------------");

        //Calculamos el resultado de la base elevada
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);

        //Imprimimos el resultado
        System.out.println("El resultado de 5^2 es " + resultado + ".");

        //Calculamos el resultado de la base elevada
        double base2 = 4, exponente2 = 3;
        double resultado2 = Math.pow(base, exponente);

        //Imprimimos el resultado
        System.out.println("El resultado de 4^3 es " + resultado + ".");
        System.out.println("------------------------------------------------");

        //Redondeamos el número
        double numero = 4.56;
        long resultadonumero = Math.round(numero);

        //Imprimimos el resultado con redondeo
        System.out.println("El resultado de 4.56 con redondeo es " + resultadonumero + ".");
        System.out.println("------------------------------------------------");

        //Hace un número aleatorio
        double numero2 = Math.random();

        //Imprime el número aleatorio
        System.out.println("El número aleatorio es " + numero2 + ".");
    }
}