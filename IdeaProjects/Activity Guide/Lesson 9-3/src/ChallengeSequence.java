public class ChallengeSequence {
    int firstNumber = 0;
    int secondNumber = 1;
    int nextNumber;
    final int SEQUENCE_LIMIT = 100;
    final int SEQUENCE_COUNT = 10;

    public void displaySequence() {
        System.out.println("El valor del valor1 és " + firstNumber);
        System.out.println("El valor del valor2 és " + secondNumber);
        nextNumber = firstNumber + secondNumber;
        for (int count = 2; count < SEQUENCE_COUNT; count++) {
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }
        System.out.println();
    }
}
