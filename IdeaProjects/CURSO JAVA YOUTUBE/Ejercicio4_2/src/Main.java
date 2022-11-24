import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 12");

        float compra;
        float descuento;

        compra = Float.parseFloat(JOptionPane.showInputDialog("El total de la compra es de : "));
        if (compra > 300) {
            descuento = compra * 0.20f;
            compra -= descuento;
            JOptionPane.showMessageDialog(null, "El total de la compra con el decuento es de " + compra);
        } else {
            JOptionPane.showMessageDialog(null, "El total de la compra con el decuento es de " + compra);
        }
    }
}