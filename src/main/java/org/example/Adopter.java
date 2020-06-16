package org.example;

public class Adopter {
    String name;
    double money;


    public Adopter(String name) {
        this.name = name;
    }


    public void feeding (Animal animal, AnimalFood animalfood) {
        System.out.println(name + " just gave some " + animalfood.name + " food to " + animal.name);

        animal.hungerLevel --;

    }

    public void havingFun (Animal animal, RecreationActivity recreationActivity, Energy energy) {
        System.out.println(name + " is playing " + recreationActivity.name + " with " + animal.name);

        animal.mood ++;
        energy.energyLevel --;

    }
}
