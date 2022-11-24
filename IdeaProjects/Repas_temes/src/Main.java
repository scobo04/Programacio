public class Main {
    public static int elementMenorFinFinal(int[] mat , int indexInicial) {
        int indexElementMenor = indexInicial;

        //suposarem indexInicial coherent
        //int[] arrayDeProva = {5, 1, 12, -5, 16, 2, 12, 14}; index 0

        for (int i = indexInicial + 1; i < mat.length; i++) {
            if (mat[indexElementMenor] > mat[i])
                indexElementMenor = i;
        }
        return indexElementMenor;
    }

    public static void ordenaMatriu(int[] M) {
        int indexCanvi = 0;
        int temp = 0;

        for (int k = 0; k < M.length; k++) {
            indexCanvi = elementMenorFinFinal(M, k);

            temp = M[k];
            M[k] = M[indexCanvi];
            M[indexCanvi] = temp;
        }
    }

    public static void imprimirMatriu(int[] M) {
        System.out.println();
        System.out.print("{");
        for (int k = 0; k < M.length; k++) {
            System.out.print(M[k]+",");
            if (k<M.length -1);
        }
        System.out.print("}");
        System.out.println();
    }


    public static void main(String[] args) {
        //write your code
        int[] arrayDeProva = {5, 1, 12, -5, 16, 2, 12, 14};
        int indexElementAIntercanviar = elementMenorFinFinal(arrayDeProva,arrayDeProva.length);

        imprimirMatriu(arrayDeProva);
        ordenaMatriu(arrayDeProva);
        imprimirMatriu(arrayDeProva);
    }
}