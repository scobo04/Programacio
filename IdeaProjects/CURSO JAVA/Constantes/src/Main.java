public class Main {
    public static void main(String[] args) {
        //CONSTANTES
        System.out.println("--------------------");
        System.out.println("CONSTANTES");
        System.out.println("--------------------");

        //CONSTANTES CONSTANTES
        System.out.println("--------------------");
        System.out.println("CONSTANTE CONSTANTE");
        System.out.println("--------------------");
        final int numero = 10;
        System.out.println("Constante es: " + numero);
        System.out.println("--------------------");

        //CONSTANTES VARIABLES
        int numero2 = 10;
        numero2 = 15;
        System.out.println("CONSTANTE VARIABLE");
        System.out.println("--------------------");
        System.out.println(numero2);
        System.out.println("--------------------");
    }
}