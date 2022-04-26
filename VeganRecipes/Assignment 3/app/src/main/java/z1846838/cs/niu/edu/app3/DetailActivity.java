package z1846838.cs.niu.edu.app3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ScrollingView;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

/*
Vanessa Aguilar z1846838
CSCI322 APP3
 */

public class DetailActivity extends AppCompatActivity {

    //Variables needed
    private TextView foodLabelTV,recipeGuideTV;
    private String label,detailRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);

        //Getting the passed in info from the intent , this from main activity
        label = getIntent().getStringExtra("label");
        detailRecipe = getIntent().getStringExtra("recipeGuide");

        //Connections from .xml
        foodLabelTV = findViewById(R.id.foodTV);
        recipeGuideTV = findViewById(R.id.foodrecipeTV);

        //Setting the text from the information passed in from main activity
        foodLabelTV.setText(label);
        recipeGuideTV.setText(detailRecipe);


    }//end onCreate

    //Go back to the main activity when the button is clicked
    public void goBack(View view) {finish();}

}// end main