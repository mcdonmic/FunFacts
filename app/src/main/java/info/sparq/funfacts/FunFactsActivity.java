package info.sparq.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.util.Log;

public class FunFactsActivity extends Activity {
/*

    private FactBook mFactBook = new FactBook();
    private ColorSelectionWheel freshColor = new ColorSelectionWheel();
    public static final String TAG = FunFactsActivity.class.getSimpleName();
*/
    /*
    The next method is created by the IDE.  I sure wish I knew what setContentView() meant...

         It means use the the provided xml to define our view.
         It's a method within the Activity classes that allows your xml definition file to
         substitute for the code java would otherwise need to fully define your view.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final FactBook mFactBook = new FactBook();
        ColorSelectionWheel freshColor = new ColorSelectionWheel();
        String TAG = FunFactsActivity.class.getSimpleName();


        setContentView(R.layout.activity_fun_facts);
        final View mBackground = findViewById(R.id.Layout);
        final ColorSelectionWheel mColorSelector = new ColorSelectionWheel();

        // Declare our View variables
        final TextView tvFactLabel;  //See notes at call statement for reason the value is FINAL
        final Button btnShowFact;


        // then Assign them to views from our layout
        tvFactLabel = (TextView) findViewById(R.id.layoutTxtLbl_FunFact);
        btnShowFact = (Button) findViewById(R.id.layoutBtn_ShowNewFunFact);

        View.OnClickListener androidViewListener_Handy = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The listener detected a click.  Now run the following code.
                String fact = "";

                // Move entire logic block of fact generation to FactBook for compliance with Class Single Responsibility Principle

                fact = mFactBook.makeFact();
                tvFactLabel.setText(fact);
                  /* FINAL! This variable must be declared FINAL because the listener is looking for
                     a view object outside the scope of its' runtime target, which is the button it
                     will be set to. Since the label must remain in existence for the listener call to
                     function. FINAL makes sure it stays available.

                     Any view accessed directly within a listener must be declared FINAL.
                     This need can be avoided by calling a public method to do the work
                     instead of accessing the objects directly.*/
                int newColorAsInt = Color.parseColor(mColorSelector.pickColor());

                mBackground.setBackgroundColor(newColorAsInt);
                btnShowFact.setTextColor(newColorAsInt);
            }
        };
        btnShowFact.setOnClickListener(androidViewListener_Handy);

        // Outside the OnClickListener declaration.  Back in the OnCreateMethod...
        // Toast.makeText(this, "Yah! Our activity was created.",Toast.LENGTH_LONG).show;
        Log.d(TAG,"Hello again. FunFactsActivity loaded successfully");

    }
}
