public class Main {
    public static void main(String[] args) {

        String mensaje = "Hola, soy un String";

        //método length
        int cantidad = mensaje.length();

        //método contains
        boolean contiene = mensaje.contains("hola");

        //método startsWith
        boolean comienzaCon = mensaje.startsWith("Hola");

        //método endsWith
        boolean terminaCon = mensaje.endsWith("String");

        System.out.println(cantidad);
        System.out.println(contiene);

        System.out.println(comienzaCon);
        System.out.println(terminaCon);

        //método concat
        String nuevoString = mensaje.concat(", estamos en el curso de Java");
        System.out.println(nuevoString);
    }
}