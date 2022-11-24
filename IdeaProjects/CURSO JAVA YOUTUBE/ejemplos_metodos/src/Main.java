public class Main {
    public static void main(String[] args) {
        System.out.println("EJEMPLO MÉTODOS");

        int numero1 = 1;
        int numero2 = 2;

        Sumar(numero1,numero2);
        Restar(numero1,numero2);

        int Decision = 0;

        if (numero1 == 5){
            /*System.out.println("Hola");*/
        }
        else {
            /*System.out.println("Adiós");*/
        }
    }

    public static void Sumar(int numero1,int numero2){
        int resultado = numero1 + numero2;

        /*System.out.println(resultado);*/
    }

    public static void Restar(int numero1,int numero2){
        int resultadoresta = numero1 - numero2;

        /*System.out.println(resultadoresta);*/

    }
}