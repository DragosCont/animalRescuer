package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal1 = new Animal();
        animal1.animalName = "Rex";
        animal1.animalAge = 2;
        animal1.animalHealth = 9;
        animal1.animalHunger = 9;
        animal1.animalMood = 10;
        animal1.animalFavoriteActivity = "running";
        animal1.animalFavoriteFood = "Pedigree";


        System.out.println("My animal name is " + animal1.animalName + " and age is " + animal1.animalAge + " years old.");

        Adopter adopter1 = new Adopter();
        adopter1.adopterName = "Dragos";
        adopter1.adopterMoney = 115.5;

        System.out.println("The adopter name is " + adopter1.adopterName + " and he has " + adopter1.adopterMoney + " money.");

        AnimalFood food1 = new AnimalFood();
        food1.foodName = "Pedigree";
        food1.foodQuantity = 15.25;
        food1.foodAvailability = 32;
        food1.foodPrice = 13.45;

        System.out.println("The animal eats " + food1.foodName + " at the price of " + food1.foodPrice + ".");

        RecreationActivity activity1 = new RecreationActivity();
        activity1.activityName = "Frisbee";

        System.out.println("The animal prefers the following activity: " + activity1.activityName + ".");

        Veterinary vet1 = new Veterinary();
        vet1.vetName = "John";
        vet1.vetSpecialization = "nutrition";

        System.out.println("Veterinary name is " + vet1.vetName + " and his specialization is " + vet1.vetSpecialization + ".");
    }

}
