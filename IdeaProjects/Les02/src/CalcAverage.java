import java.util.Scanner;

public class CalcAverage {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Mete solo tres integers con espacios: (ejemplo 20 30 40)");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int avg = (i1 + i2 + i3)/3;
        System.out.println();

        System.out.println("Media = " + avg);
    }   //fin del método main
} //fin de la clase
