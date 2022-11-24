import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 9");

        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        if (numero%10==0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es múltiple de 10.");
        }else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no es múltiple de 10.");
        }
    }
}