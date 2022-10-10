package com.company;

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
        dog2.name = "Paco";
        dog2.age = 6;
        dog2.race = "Bichón Maltés";
        dog2.dangerous = false;

        //Execució de mètode
        dog1.displayDog();
        dog2.displayDog();

    }
}