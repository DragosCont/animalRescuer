package org.example;

public class Animal {
    String animalName;
    int animalAge;
    int animalHealth;
    int animalHunger;
    int animalMood;
    String animalFavoriteFood;
    String animalFavoriteActivity;

public Animal(String name, int age, int health, int hunger, int mood, String food, String activity) {
    animalName = name;
    animalAge = age;
    animalHealth = health;
    animalHunger = hunger;
    animalMood = mood;
    animalFavoriteFood = food;
    animalFavoriteActivity = activity;

}
    public static void main( String[] args )
    {Animal myAnimal = new Animal("Rex", 3, 9, 9,10, "Pedigree",
            "running");
    System.out.println(myAnimal.animalName + " " + myAnimal.animalAge + " " + myAnimal.animalHealth
    +" " + myAnimal.animalHunger + " " + myAnimal.animalMood + " " +myAnimal.animalFavoriteFood + " " +myAnimal.animalFavoriteActivity);

    }
}
