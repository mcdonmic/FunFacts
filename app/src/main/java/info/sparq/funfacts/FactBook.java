package info.sparq.funfacts;

import java.util.Random;

public class FactBook {
    static Random randGen = new Random();

    private String[] facts = {
            "Ants stretch when they wake in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold metals are made mostly of silver.",
            "You are born with 300 bones.  By the time you are an adult, you will have 206.",
            "It takes about 8 minutes for light from the sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in one day.",
            "The state on Florida is bigger than England.",
            "Some penguins can leap 2 to 3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };

    public String makeFact() {
        int randValue = randGen.nextInt(facts.length);
        return facts[randValue];
    }
};
