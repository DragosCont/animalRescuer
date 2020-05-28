package org.example;

public class RecreationActivity {
    String activityName;


    public RecreationActivity(String name) {
        activityName = name;
    }
    public static void main( String[] args )
    {RecreationActivity animalActivity = new RecreationActivity("running");
        System.out.println(animalActivity.activityName);

    }



}
