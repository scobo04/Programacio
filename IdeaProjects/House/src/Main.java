public class Main {
    public static void main(String[] args) {

        //Creació d'objectes
        House house1;
        house1 = new House();

        //Assignació de valors
        house1.name = "Casa 1";
        house1.rooms = 4;
        house1.bathrooms = 2;
        house1.garage = true;
        house1.price = 130000;

        //Execució del mètode
        house1.displayHouse();
    }
}