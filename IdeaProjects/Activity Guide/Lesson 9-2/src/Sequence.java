public class Sequence {
    int firstNumber = 0;
    int secondNumber = 1;
    int nextNumber;
    final int SEQUENCE_LIMIT = 100;

    public void displaySequence() {
        System.out.println("El valor del valor1 és " + firstNumber);
        System.out.println("El valor del valor2 és " + secondNumber);
        nextNumber = firstNumber + secondNumber;
        while (nextNumber <= SEQUENCE_LIMIT) {
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }
        System.out.println();
    }
}
