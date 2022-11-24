public class Prueba {
    public static void main(String[] args) {
        int [] numbers = {43, 12, 65};
        int [] numbers1 = {23, 11, 42, 12, 76};
        int [] numbers2 = {43, 60, 12, 32, 65};
        int [] numbers3 = {31, 25, 56, 6, 10};

        printArrayPosicio(numbers1, 2);
        printArrayPosicio(numbers2, 2);

        printArray(numbers3);
    }
    public static void printArrayPosicio (int [] array, int posicio){

        System.out.println(array[posicio]);

    }

    public static void printArray (int [] array){
        for (int a = 0; a < array.length; a++) {
            System.out.println(array[a]);
        }
    }
}
