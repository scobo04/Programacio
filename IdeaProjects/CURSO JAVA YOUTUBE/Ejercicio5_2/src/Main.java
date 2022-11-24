import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 13");

        int horanormal;
        int horaextra;
        int total;

        horanormal = Integer.parseInt(JOptionPane.showInputDialog("Número de horas realizadas: "));
        if (horanormal <= 40) {
            total = horanormal * 16;
            JOptionPane.showMessageDialog(null, "El obrero trabajando " + horanormal + " horas " +
                    "semanales gana " + total + " €.");
        } else {
            total = (40*16) + (horanormal - 40) * 20;
            JOptionPane.showMessageDialog(null, "El obrero trabajando " + horanormal + " " +
                    "horas semanales gana " + total + " €");
        }
    }
}