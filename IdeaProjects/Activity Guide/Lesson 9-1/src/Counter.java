public class Counter {
    final int MAX_COUNT = 100;

    public void displayCount() {
        for (int count = 1; count < 100; count++) { //bucle de la variable count mentres el seu valor sigui menor a 100.
            if (count % 12 == 0) {
                System.out.println("El número " + count + " és divisible per 12.");
            }
        }
    }
}
