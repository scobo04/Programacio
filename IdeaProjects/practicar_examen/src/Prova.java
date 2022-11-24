import java.sql.SQLOutput;

public class Prova {
    public static void main(String[] args) {
        int suma;

        int[] array = {11,60,24,45,70,25,1,21};
        double media = 0.0;
        int minimo = array[0];
        int maximo = array[0];

        System.out.println("Suma del array: " + suma(array));
        System.out.println("¿Está ordenado?: " + estaOrdenatAscendent(array));
        System.out.println("Valor mínimo en el array: " + min(array, minimo));
        System.out.println("Valor máximo en el array: " + max(array, maximo));
        System.out.println("Media del array: " + mediana(array, (float) media));
        System.out.println("¿Elementos de indice impares ordenados?: " + indexSenarsOrdenatsDescendentment(array));
    }

    //MATRIZ ORDENADA, TRUE O FALSE F
    public static boolean estaOrdenatAscendent( int [] M){
        for ( int k = 0 ; k < M.length - 1 ; k++){
            if ( M[k] > M[k+1] )
                return false;
        }

        return true;
    }

    //SUMA TOTAL DEL ARRAY
    public static int suma(int[] array) {

        int suma = 0;

        for (int i = 0; i < array.length; i++){

            suma += array[i];

        }
        return suma;
    }

    //RETORNA VALOR MÍNIM B
    public static int min(int[] array, int min) {
        for (int h=0; h<array.length; h++) {
            if (array[h] < min) { //si array[0] < 21
                min = array[h]; //21 = array[0]; --> 21 = 21;
            }
        }
        return min;
    }

    //RETORNA VALOR MÁXIM D
    public static int max(int[] array, int maximo){
        for (int i=0; i<array.length; i++) {
            if (array[i] > maximo) { //si array[0] > 21. i=1 --> si array[1] > 21
                maximo = array[i]; //21 = array[0]; --> 21 = 21; i=1 --> 21 = 45;
            }
        }
        return maximo;
    }

    //RETORNA MITJANA A
    public static float mediana(int[] array, float media) {
        for (int j=0; j<array.length; j++) {
            media = media + array[j];

        }
        media = media / array.length;
        return media;
    }


    //RETORNA ÍNDEX ON ES TROBA EL VALOR MÍNIM C
    public static void indiceValorMinimo(int[] array, int minimo) {
        for (int k=0; k<array.length; k++) {
            if (array[k] == minimo) {
                System.out.println("array[" + k + "] = " + minimo);
            }
        }
    }

    //RETORNA ÍNDEX ON ES TROBA EL VALOR MÀXIM E
    public static void devuelveMax(int[] array, int maximo) {
        for (int l=0; l<array.length; l++) {
            if (array[l] == maximo) {
                System.out.println("array[" + l + "]");
            }
        }
    }

    //RETORNA TRUE SI ELS INDEXS SENARS DE L'ARRAY ESTÁN ORDENATS DE FORMA DESCENDENT, SINO FALSE G
    public static boolean indexSenarsOrdenatsDescendentment( int [] array )  {

        // int[] array = {11,21,24,25,70,45,1,60};
        for (int i = 1; i < array.length - 2; i+=2){

            if (array[i] < array[i +2]){
                return false;
            }

        }

        return true;
    }

    /*
    public static boolean indexSenarsOrdenatsAscendentment( int [] array )  {

        //int[] array = {11,12,13,14,15,16,17,18};
        for (int i = 1; i < array.length - 2; i++){

            if (array[i] > array[i +2]){
                return false;
            }

        }

        return true;
    }

     */


}
