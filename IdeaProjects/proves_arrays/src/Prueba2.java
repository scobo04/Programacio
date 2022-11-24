public class Prueba2 {
    public static void main(String[] args) {
        int [] array = {0,12,65,51,45};
        System.out.println("-------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Años: " + array[i]);
        }
        System.out.println("-------------------------------------------");
        int [] [] ofertas = new int[5][4];
        ofertas[0][0] = 1000;
        ofertas[0][1] = 1500;
        ofertas[0][2] = 1800;
        ofertas[1][0] = 1000;
        ofertas[3][3] = 2000;
        System.out.println("Valor del array 0 en la posición 0: " + ofertas[0] [0]);
        System.out.println("Valor del array 0 en la posición 1: " + ofertas[0] [1]);
        System.out.println("Valor del array 0 en la posición 2: " + ofertas[0] [2]);
        System.out.println("Valor del array 1 en la posición 0: " + ofertas[1] [0]);
        System.out.println("Valor del array 3 en la posición 3: " + ofertas[3] [3]);
        System.out.println("-------------------------------------------");
    }
}
