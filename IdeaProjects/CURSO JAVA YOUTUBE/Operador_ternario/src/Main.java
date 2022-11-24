import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("OPERADOR TERNARIO");

        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        JOptionPane.showMessageDialog(null, (numero%2==0) ? "Es par" : "Es impar");

	  /*mensaje = (numero%2==0) ? "Es par" : "Es impar";
	  */
    }
}