package org.example;

public class Game {
    String nameAdopter;
    String nameAnimal;
    String nameVeterinary;

    public Game(String adopter, String animal, String veterinary) {
        nameAdopter = adopter;
        nameAnimal = animal;
        nameVeterinary = veterinary;
    }
    public static void main( String[] args )
    {Game animalGame = new Game("Dragos", "Rex", "John");
        System.out.println(animalGame.nameAdopter + " " + animalGame.nameAnimal + " " + animalGame.nameVeterinary);

    }

}
