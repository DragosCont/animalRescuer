package org.example;


import java.time.LocalDate;

public class AnimalFood {
    String name;
    double price;
    double quantity;
    LocalDate expirationDate = LocalDate.now().plusYears(1);
    boolean availability;
    String favoriteFoodName;


    public AnimalFood(String name, double price, double quantity, boolean availability) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.availability = availability;
    }
}
