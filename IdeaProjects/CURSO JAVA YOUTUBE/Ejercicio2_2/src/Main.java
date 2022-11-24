import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 10");

        int numero1;
        int numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número2: "));

        if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "Los números son iguales.");
        } else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "El número " + numero2 + " es mayor que el número " + numero1);
        } else if (numero2 < numero1) {
            JOptionPane.showMessageDialog(null, "El número " + numero1 + " es mayor que el número " + numero2);
        }
    }
}