import javax.swing.*;

public class DateTwo {
    int dayNumber;
    public void displayDay() {
        dayNumber = Integer.parseInt(JOptionPane.showInputDialog("Inserte el día: "));
        if (dayNumber == 1) {
            System.out.println("Es lunes");
        }
        else if (dayNumber == 2) {
            System.out.println("Es martes");
        }
        else if (dayNumber == 3) {
            System.out.println("Es miércoles");
        }
        else if (dayNumber == 4) {
            System.out.println("Es jueves");
        }
        else if (dayNumber == 5) {
            System.out.println("Es viernes");
        }
        else if (dayNumber == 6) {
            System.out.println("Es sábado");
        }
        else if (dayNumber == 7) {
            System.out.println("Es domingo");
        }
        else {
            System.out.println("No es correcto");
        }
    }
}
