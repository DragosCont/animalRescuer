package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal1 = new Animal("Rex");
       // animal1.name = "Rex";
        animal1.age = 2;
        animal1.health = 9;
        animal1.hungerLevel = 9;
        animal1.mood = 9;
        animal1.favoriteActivity = "running";
        animal1.favoriteFood = "Pedigree";
  //      animal1.wings.fly = false;



        System.out.println("My animal name is " + animal1.name + " and age is " + animal1.age + " years old.");

        Adopter adopter1 = new Adopter("Dragos");
       // adopter1.name = "Dragos";
        adopter1.money = 115.5;




        System.out.println("The adopter name is " + adopter1.name + " and he has " + adopter1.money + " money.");

        AnimalFood food1 = new AnimalFood("Pedigree", 13.45,15.25,true);
//        food1.name = "Pedigree";
//        food1.quantity = 15.25;
//        food1.availability = true;
//        food1.price = 13.45;



        System.out.println("The animal eats " + food1.name + " at the price of " + food1.price + ".");
        System.out.println("The food expires in " + food1.expirationDate);

        RecreationActivity activity1 = new RecreationActivity();
        activity1.name = "Frisbee";
        activity1.energyLevel = 8;


        System.out.println("The animal prefers the following activity: " + activity1.name + ".");

        Veterinary vet1 = new Veterinary("John");
       // vet1.vetName = "John";
        vet1.vetSpecialization = "nutrition";

        System.out.println("Veterinary name is " + vet1.vetName + " and his specialization is " + vet1.vetSpecialization + ".");



        adopter1.feeding(animal1,food1);
        System.out.println("New hunger level is: " + animal1.hungerLevel);

        Energy energy1 = new Energy();
        energy1.energyLevel = 8;
        adopter1.havingFun(animal1,activity1,energy1);
        System.out.println("New mood is: " + animal1.mood + " and new energy level is: " + energy1.energyLevel);


    }

}
