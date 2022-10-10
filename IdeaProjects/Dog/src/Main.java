public class Main {
    public static void main(String[] args) {

        //Creació d'objecte
        Dog dog1;
        dog1 = new Dog();

        //Assignació de valors
        dog1.name = "Tobby";
        dog1.age = 2;
        dog1.race = "Husky";
        dog1.dangerous = false;


        //Creació d'objecte
        Dog dog2;
        dog2 = new Dog();

        //Assignació de valors
        dog2.name = "Lucas";
        dog2.age = 7;
        dog2.race = "Pastor alemà";
        dog2.dangerous = false;


        //Creació d'objecte
        Dog dog3;
        dog3 = new Dog();

        //Assignació de valors
        dog3.name = "Paco";
        dog3.age = 9;
        dog3.race = "Bichón maltés";
        dog3.dangerous = true;

        //Execució del mètode
        dog1.displayDog();
        dog2.displayDog();
        dog3.displayDog();
    }
}