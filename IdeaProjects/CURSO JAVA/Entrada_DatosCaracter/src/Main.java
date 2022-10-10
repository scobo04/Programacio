import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ENTRADA DATOS CADENA
        System.out.println("---------------------------");
        System.out.println("ENTRADA DE DATOS DE CARÁCTER");
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        Scanner entrada = new Scanner(System.in);

        char letra;
        System.out.print("Digite una letra: ");
         letra= entrada.next().charAt(0);

        System.out.println("La letra es: " + letra);
        System.out.println("---------------------------");
    }
}