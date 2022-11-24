public class prueba1 {
    public static void main(String[] args) {
        prueba1 Ascensor = new prueba1();


        Ascensor.goDown();
        Ascensor.goUp();
        Ascensor.setFloor();
        Ascensor.checkDoorStatus();
    }
    int currentFloor = 2;
    int desiredFloor = 5;
    boolean doorOpen = false;

    final int planta_superior = 5;
    final int planta_inferior = -1;

    public void doorOpen() {
        if (!checkDoorStatus()) {

        }
    }

    public void goUp() {
        while (currentFloor < desiredFloor) {
            System.out.println("---------------------------------------");
            System.out.println("La planta actual es: " + currentFloor);
            currentFloor++;
            System.out.println("Ascensor subiendo");
        }
    }
    public void goDown() {
        while (currentFloor > desiredFloor) {
            currentFloor--;
            System.out.println("Ascensor bajando");
        }
    }

    public void setFloor() {
        while (currentFloor != desiredFloor) {
            if (currentFloor < desiredFloor) {
                goUp();
            }else {
                goDown();
            }
        }
    }
    public void checkDoorStatus() {
        while (currentFloor < desiredFloor) {
            doorOpen = false;
            System.out.println("La puerta está cerrada");
        }
        if (currentFloor == desiredFloor) {
            doorOpen = true;
            System.out.println("---------------------------------------");
            System.out.println("La puerta está abierta");
            System.out.println("---------------------------------------");
        }
    }
}
