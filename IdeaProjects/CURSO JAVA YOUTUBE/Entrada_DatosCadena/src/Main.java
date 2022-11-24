import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ENTRADA DATOS CADENA
        System.out.println("---------------------------");
        System.out.println("ENTRADA DE DATOS DE CADENA");
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        Scanner entrada = new Scanner(System.in);

        String cadena;
        System.out.print("Digite una cadena: ");
        cadena = entrada.nextLine();

        System.out.println("La cadena es: " + cadena);
        System.out.println("---------------------------");
    }
}