import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 4");

        Scanner entrada = new Scanner(System.in);
        final int sempleado = 1000;
        int coche; //Comisión del empleado
        float cempleado,vempleado,suma; //Ventas del empleado

        //Calculamos el sueldo de un empleado
        System.out.println("El salario del empleado son 1000 $.");
        System.out.print("Valor total de las ventas: ");
        coche = entrada.nextInt();
        System.out.println("El valor del total de las ventas son " + coche + " $.");
        System.out.print("Ventas del empleado en ese mes: ");
        vempleado = entrada.nextFloat();
        cempleado = vempleado * 150;
        vempleado = coche * 0.05f;
        suma = sempleado + cempleado + vempleado;

        System.out.println("\nEl sueldo total de ese mes del empleado son " + suma + " $.");
    }
}