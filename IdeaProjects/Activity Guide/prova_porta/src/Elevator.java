public class Elevator {
    boolean doorOpen = false; //per defecte la porta es troba tancada
    int currentFloor = 1; //ascensor comença a la planta 1
    final int top_floor = 10; //maxima planta
    final int min_floor = 1; //planta mínima

    public void openDoor() {
        System.out.println("Obrint porta.");
        doorOpen = true;
        System.out.println("Porta oberta.");
    }

    public void closeDoor() {
        System.out.println("Tancant porta.");
        doorOpen = false;
        System.out.println("Porta tancada.");
    }
}