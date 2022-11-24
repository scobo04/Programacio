import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ENTRADA DATOS
        System.out.println("---------------------------");
        System.out.println("ENTRADA DE DATOS");
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        Scanner entrada = new Scanner(System.in);

        //ENTRADA DATO ENTERO
        System.out.println("ENTRADA DATO ENTERO");
        int numero;
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();

        System.out.println("El número es: " + numero);
        System.out.println("---------------------------");

        //ENTRADA DATO DECIMAL FLOTANTE
        System.out.println("ENTRADA DATO DECIMAL FLOAT");
        float numero2;
        System.out.print("Digite un numero: ");
        numero2 = entrada.nextFloat();

        System.out.println("El número es: " + numero2);
        System.out.println("---------------------------");

        //ENTRADA DATO DECIMAL DOUBLE
        System.out.println("ENTRADA DATO DECIMAL DOUBLE");
        double numero3;
        System.out.print("Digite un numero: ");
        numero3 = entrada.nextDouble();

        System.out.println("El número es: " + numero3);
        System.out.println("---------------------------");
    }
}