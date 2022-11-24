import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 14");

        int numero1;
        int numero2;
        int resultado;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número 2: "));

        if (numero1 % 2 == 0 && numero2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Los números son pares.");
        }else if (numero1 % 2 != 0 && numero2 % 2 != 0){
            JOptionPane.showMessageDialog(null, "Los números son impares.");
        } else {
            JOptionPane.showMessageDialog(null, "Un número es par y el otro es impar.");
        }
    }
}