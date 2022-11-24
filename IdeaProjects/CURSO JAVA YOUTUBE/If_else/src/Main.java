import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("IF, ELSE");
        System.out.println("--------------------------------------------");

        System.out.println("--------------------------------------------");
        /*
        if(condicion) {
        *       Instruccion1;
        * }
        * else {
        *       Instruccion2;
        * }
        */

        /*
        LOS OPERADORES QUE TIENE SON:
        == : Igualdad
        != : Diferencia
        > : Mayor
        >= : Mayor o igual
        < : Menor
        <= : Menor o igual
        */

        int numero, dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        //OPERADOR DE IGUALDAD
        /*
        if (numero == dato) { //== ES PARA SABER SI UN NÚMERO ES IGUAL A 5
            JOptionPane.showMessageDialog(null, "El número es 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número es diferente a 5");
        }
        System.out.println("El número introducido ha sido " + numero);
        System.out.println("--------------------------------------------");
        */

        //OPERADOR DE DIFERENCIA
        /*
        if (numero != dato) { //!= ES PARA SABER SI UN NÚMERO ES DIFERENTE A 5
            JOptionPane.showMessageDialog(null, "El número es diferente a 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número es 5");
        }
        System.out.println("El número introducido ha sido " + numero);
        System.out.println("--------------------------------------------");
        */

        //OPERADOR DE MAYOR
        /*
        if (numero > dato) { //> ES PARA SABER SI UN NÚMERO ES MAYOR A 5
            JOptionPane.showMessageDialog(null, "El número es mayor a 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número es 5 o menor");
        }
        System.out.println("El número introducido ha sido " + numero);
        System.out.println("--------------------------------------------");
        */

        /*
        //OPERADOR DE MAYOR O IGUAL
        if (numero >= dato) { //> ES PARA SABER SI UN NÚMERO ES MAYOR O IGUAL A 5
            JOptionPane.showMessageDialog(null, "El número es 5 o mayor");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número es menor a 5");
        }
        System.out.println("El número introducido ha sido " + numero);
        System.out.println("--------------------------------------------");
        */

        //OPERADOR DE MENOR

        /*
        if (numero > dato) { //> ES PARA SABER SI UN NÚMERO ES MENOR A 5
            JOptionPane.showMessageDialog(null, "El número es menor a 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número es 5 o mayor");
        }
        System.out.println("El número introducido ha sido " + numero);
        System.out.println("--------------------------------------------");
        */

        /*
        //OPERADOR DE MENOR O IGUAL
        if (numero <= dato) { //> ES PARA SABER SI UN NÚMERO ES MENOR O IGUAL A 5
            JOptionPane.showMessageDialog(null, "El número es 5 o menor");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número es mayor a 5");
        }
        System.out.println("El número introducido ha sido " + numero);
        System.out.println("--------------------------------------------");
        */
    }
}