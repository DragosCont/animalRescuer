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

        if (animalfood.name.equals(animalfood.favoriteFoodName)) {
            animal.mood ++;
        }else {
            animal.mood += 0;
        }

    }

    public void havingFun (Animal animal, RecreationActivity recreationActivity) {
        System.out.println(name + " is playing " + recreationActivity.name + " with " + animal.name);

        animal.mood ++;

        if(recreationActivity.name.equals(recreationActivity.favoriteActivityName)){
            animal.mood +=2;
        }else{
            animal.mood ++;
        }

    }
}
