import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {
        int randomNumber = 0; //Número aleatori
        int guess;
        if (args.length == 0 || args[0].compareTo("help") == 0) {
            //System.out.println("Paràmetres correctes : help o un número entre 1 i 5 .");
            //System.out.println("Introdueix un número entre 1 i 5.");

        }
        else {
            randomNumber = ((int) (Math.random() * 5 ) + 1);
            guess = Integer.parseInt(JOptionPane.showInputDialog("Numero:")); //Quadre de diàleg per insertar el número.
            System.out.println(guess);
            if (guess < 1 || guess > 5) {
                System.out.println("Argument invàlid: introdueix un número entre 1 i 5.");
            }
            else {
                if (guess == randomNumber) {
                    System.out.println("Bona elecció. Està correcte.");
                }
                else {
                    System.out.println("El número era " + randomNumber + ". Torna a intentar-ho.");
                }
            }
        }
    }
}
