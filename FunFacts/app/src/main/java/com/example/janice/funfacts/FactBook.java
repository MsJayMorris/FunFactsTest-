package com.example.janice.funfacts;

import java.util.Random;

/**
 * Created by Janice on 10/14/2014.
 */
public class FactBook {

    //Member variables (properties about the object)
    public String[] mfacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster then horses.",
            "Olympic gold medals are made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 286.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow just about a meter in one day.",
            "The state of Florida is bigger than England.",
            "Some pgenguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days for form a new habit.",
            "Mammoths still walked the Earth when the Great Pyramid was being built."};

    // Method (abilities: things the object can do)

    public String getFact(){

        String fact = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mfacts.length);

        fact = mfacts[randomNumber];

        return fact;


    }
}
