package org.example;

public class AnimalFood {
    String foodName;
    double foodPrice;
    double foodQuantity;
   // java.time.LocalDate foodExpirationDate;
    int foodAvailability;

    public AnimalFood(String name, double price, double quantity, int availability) {
        foodName = name;
        foodPrice  = price;
        foodQuantity = quantity;
        foodAvailability = availability;
    }
    public static void main( String[] args )
    {AnimalFood myAnimalFood = new AnimalFood("Pedigree", 20.5, 50.5, 11);
        System.out.println(myAnimalFood.foodName + " " + myAnimalFood.foodPrice + " " + myAnimalFood.foodQuantity + " "
        + myAnimalFood.foodAvailability);

    }

}
