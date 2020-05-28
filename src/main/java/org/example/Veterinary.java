package org.example;

public class Veterinary {
    String vetName;
    String vetSpecialization;

    public Veterinary(String name, String specialization) {
        vetName = name;
        vetSpecialization = specialization;
    }
    public static void main( String[] args )
    {Veterinary animalDoctor = new Veterinary("John", "radiology");
        System.out.println(animalDoctor.vetName + " " + animalDoctor.vetSpecialization );

    }

}
