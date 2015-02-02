package info.sparq.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorSelectionWheel freshColor = new ColorSelectionWheel();
    Random randGen = new Random();

    /*
    The next method is created by the IDE.  I sure wish I knew what setContentView() meant...

         It means use the the provided xml to define our view.
         It's a method within the Activity classes that allows your xml definition file to
         substitute for the code java would otherwise need to fully define your view.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables
        final TextView tvFactLabel;  //See notes at call statement for reason the value is FINAL
        Button btnShowFact;

        // then Assign them to views from our layout
        tvFactLabel = (TextView) findViewById(R.id.layoTxtLbl_FunFact);
        btnShowFact = (Button) findViewById(R.id.layoBtn_ShowNewFunFact);

        View.OnClickListener androidViewListener_Handy = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The listener detected a click.  Now run the following code.
                String fact = "initialized";
                String[] facts = {
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
                // Pick a random value
                int randValue = randGen.nextInt(facts.length);
                fact = randValue + "";

                // Update the Fun Fact.
                // The following code works fine, is left here for learning, and is
                // commented out to replace code with array usage methods.

                /*
                if (randValue == 0) fact = "Ants stretch when they wake in the morning.";
                else if (randValue ==1) fact = "Ostriches can run faster than horses.";
                else if (randValue ==2) {
                    fact = "Olympic gold metals are made mostly of silver.";
                };
                */


                // Update the Fun Fact.
                fact = facts[randValue];
                tvFactLabel.setText(fact);
                  /* FINAL! This variable must be declared FINAL because the listener is looking for
                     a view object outside the scope of its' runtime target, which is the button it
                     will be set to. Since the label must remain in existence for the listener call to
                     function. FINAL makes sure it stays available.

                     Any view accessed directly within a listener must be declared FINAL.
                     This need can be avoided by calling a public method to do the work
                     instead of accessing the objects directly.*/
            }
        };
        btnShowFact.setOnClickListener(androidViewListener_Handy);
    }

}
