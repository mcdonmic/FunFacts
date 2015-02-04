package info.sparq.funfacts;

import android.support.v7.app.ActionBarActivity;

import java.util.Random;


public class ColorSelectionWheel extends ActionBarActivity {
    static Random randGen = new Random();

    private String[] mColors = {
            "#39add1", "#3079ab", "#c25975", "#e15258",
            "#2079ab", "#a177ab", "#f0761b", "#79791b",
            "#30397f", "#1379ca", "#3cb91b", "#307591"
    };

    public String pickColor() {

        // Pick a random value
        int randValue = randGen.nextInt(mColors.length);

        return mColors[randValue];
    }
};
