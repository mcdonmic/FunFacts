package info.sparq.funfacts;

import android.graphics.Color;
import java.util.Random;


public class ColorWheel {

    // member variables for the colors we want to alternate in our background
    public String[] memColor = {
            "#39add1", "#3079ab", "#c25975", "#e15258",
            "#2079ab", "#a177ab", "#f0761b", "#79791b",
            "#30397f", "#1379ca", "#3cb91b", "#307591"
    };

    String associatedColor = "";
    Random randGenerator = new Random();

    public int getColor(){
        int randomInt = randGenerator.nextInt(memColor.length);
        associatedColor = memColor[randomInt];
        // Original code declared Color.parseColor... as an int.  IDE marked as redundant.
        return Color.parseColor(associatedColor);
    };
}
