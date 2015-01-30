package info.sparq.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.Color;
import java.util.Random;


public class ColorSelectionWheel extends ActionBarActivity {

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


    /*  Default Android Studio Code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_selection_wheel);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color_selection_wheel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}
