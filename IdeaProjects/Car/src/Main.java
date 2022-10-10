public class Main {
    public static void main(String[] args) {

        //Creació d'objecte
        Car car1;
        car1 = new Car();

        //Assignació de valors
        car1.name = "Opel";
        car1.model = "Corsa";
        car1.age = 12;
        car1.matricula = "1234 ABC";


        //Creació d'objecte
        Car car2;
        car2 = new Car();

        //Assignació de valors
        car2.name = "Dacia";
        car2.model = "Sandero";
        car2.age = 5;
        car2.matricula = "9382 TJC";


        //Creació d'objecte
        Car car3;
        car3 = new Car();

        //Assignació de valors
        car3.name = "Hyundai";
        car3.model = "Kona";
        car3.age = 1;
        car3.matricula = "4321 CBA";


        //Execució del mètode
        car1.displayCar();
        car2.displayCar();
        car3.displayCar();
    }
}