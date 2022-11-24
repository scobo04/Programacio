import javax.swing.*;
import java.awt.*;

public class Clock {
    int currentTime;

    public void displayPartOfDay() {
        currentTime = Integer.parseInt(JOptionPane.showInputDialog("Inserte la hora: "));
        if (currentTime >= 801 && currentTime <= 1200) {
            System.out.println("Morning");
        } else if (currentTime >= 1201 && currentTime <= 1700) {
            System.out.println("Afternoon");
        } else if (currentTime >= 1701 && currentTime <= 2400) {
            System.out.println("Evening");
        } else {
            System.out.println("Early Morning");
        }
    }
}
