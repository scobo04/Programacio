public class Main {
    public static void main(String[] args) {
        String mensaje = "        Hola, soy un String";

        //método toUpperCase
        System.out.println(mensaje.toUpperCase().trim());

        //método toLowerCase
        System.out.println(mensaje.toLowerCase().trim());

        //método trim
        System.out.println(mensaje.trim());

        //método format
        String mensaje2 = "";
        mensaje2 = String.format("Bienvenido al curso %s", "Java");
        System.out.println(mensaje2);

        String curso = "Java";
        float valor = 10.872040f;
        mensaje2 = String.format("El total es %.4f %s", valor, "MX");
        System.out.println(mensaje2);
    }
}