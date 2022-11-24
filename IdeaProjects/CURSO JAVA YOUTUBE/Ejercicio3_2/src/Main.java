import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 11");

        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra " + letra + " es mayúscula.");
        } else {
            JOptionPane.showMessageDialog(null, "La letra " + letra + " es minúscula.");
        }
    }
}