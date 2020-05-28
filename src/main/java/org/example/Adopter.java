package org.example;

public class Adopter {
    String adopterName;
    double adopterMoney;

    public Adopter(String name, double money) {
        adopterName = name;
        adopterMoney = money;
    }
    public static void main( String[] args )
    {Adopter myAdopter = new Adopter("Dragos", 315.3);
        System.out.println(myAdopter.adopterName + " " + myAdopter.adopterMoney );

    }

}
