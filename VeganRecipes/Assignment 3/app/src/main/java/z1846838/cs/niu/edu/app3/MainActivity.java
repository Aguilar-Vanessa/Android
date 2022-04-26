 package z1846838.cs.niu.edu.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

/*
Vanessa Aguilar z1846838
CSCI322 APP3
 */
public class MainActivity extends AppCompatActivity {

    //Variables needed
    private Spinner recipeSpin;
    private ImageView imageSpin;
    private String pickedRecipe, foodLabel, recipeDetail;
    private Button recipeBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Making our image connection
        imageSpin = findViewById(R.id.imageSpin);

        //Button connection
        recipeBTN = findViewById(R.id.recipeButton);


        //Connecting Spinner
        recipeSpin = findViewById(R.id.recipeSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.recipesSpin, R.layout.spinnerlayout);

        recipeSpin.setAdapter(adapter);

        recipeSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected;

                //get the selection from the spinner
                selected = parent.getItemAtPosition(position).toString();
                imagePicked();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); //end of handling spinner

        //When go to recipe is clicked
        recipeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent that will manage bouncing over to the second activity
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);

                //Once the recipe button is clicked by the user this code will decide what gets sent over to the second activty
                if(v == recipeBTN){

                    pickedRecipe = recipeSpin.getSelectedItem().toString();

                    if(pickedRecipe.equals("Spicy Black Bean soup")){ //Soup is picked from spinner
                        foodLabel = "Spicy Black Bean Soup \n Recipe";
                        recipeDetail = "\nIngredients\n" +
                                " SOUP\n" +
                                "\n" +
                                "    2 Tbsp avocado or coconut oil\n" +
                                "    1/2 white or yellow onion (diced)\n" +
                                "    3 cloves garlic (minced)\n" +
                                "    1/2 red or orange pepper (diced)\n" +
                                "    1 1/2 tsp cumin\n" +
                                "    1 tsp chili powder\n" +
                                "    1 1/2 cups Red Chipotle Salsa (or any blended or chunky spicy salsa)\n" +
                                "    4 cups vegetable stock (DIY or store-bought)\n" +
                                "    2 Tbsp coconut sugar or maple syrup (to taste) (optional)\n" +
                                "    2 15-ounce black beans (cooked in salt // slightly drained)\n" +
                                "    1 15.25-ounce whole kernel corn (drained) "
                                + " Instructions\n" +
                                "\n" +
                                "    1. Heat a large pot over medium heat. Once hot, add oil, garlic, onion, pepper, an a pinch each salt and pepper and stir. Cook for 4-5 minutes, stirring frequently, until onions are translucent and the peppers have a bit of color.\n" +
                                "    2. Add cumin and chili powder and stir to coat. Then add salsa, vegetable stock and coconut sugar. Stir to combine, then increase heat to medium heat and bring to a low boil.\n" +
                                "    3. Once it’s boiling, add black beans and corn and stir. Reduce heat to low and simmer, covered, for 30 minutes or more, stirring occasionally. The longer it simmers, the more the flavor will develop. It’s even better the next day.\n" +
                                "    4. Serve as is or with recommended serving options above.\n" +
                                "    5. Leftovers will keep covered in the refrigerator for 5-6 days or in the freezer for 1 month.\n";
                        detailIntent.putExtra("label",foodLabel); //Load in the TV with the appropriate label and step by step recipe guide
                        detailIntent.putExtra("recipeGuide",recipeDetail);
                    }else if(pickedRecipe.equals("Banana Bread")){ //Banana Bread is picked from the spinner
                        foodLabel = "Banana Bread \n Recipe";
                        recipeDetail = "\nIngredients\n" +
                                "\n" +
                                "    250 g (2 cups) plain (all-purpose) flour\n" +
                                "    1 tsp baking powder\n" +
                                "    1/2 tsp bicarbonate of soda (baking soda)\n" +
                                "    1 tsp ground cinnamon\n" +
                                "    1/4 tsp salt\n" +
                                "    330 g (3 medium) very ripe banana\n" +
                                "    175 g (1 cup) light brown soft sugar\n" +
                                "    120 ml (1/2 cup) sunflower oil or another neutral oil OR melted coconut oil OR 120g vegan block butter, melted\n" +
                                "    60 ml (1/4 cup) unsweetened non-dairy milk (soy is best)\n" +
                                "    1/2 tsp cider or white wine vinegar\n" +
                                "    1 tsp vanilla extract\n" +
                                "\n" +
                                "Instructions\n" +
                                "\n" +
                                "    1. Preheat the oven to 180°C/160°fan/350°F/gas mark 4. Grease an approx 11.5 x 21.5 cm / 4.5 x 8.5 in loaf tin (2lb loaf tin) and line with a strip of baking parchment.\n" +
                                "    2. Place the flour, baking powder, bicarbonate of soda, cinnamon and salt in a large bowl and whisk to combine.\n" +
                                "    3. Mash the bananas well with a fork then add them to the bowl of flour along with the sugar, oil or melted butter, milk, vinegar and vanilla extract.\n" +
                                "    4. Whisk until no dry lumps remain but be careful not to over-beat the batter as that can make the cake tough. If you are adding any mix-ins fold them through now.\n" +
                                "    5. Pour the batter into the prepared tin and spread it level. Bake for 50-60 minutes until firm and springy to the touch and a skewer inserted into the centre comes out clean.\n" +
                                "    6. Leave to cool in the tin for 10 minutes then carefully turn out onto a wire rack and leave to cool completely. Once cold, store in an airtight container for up to five days. \n";

                        detailIntent.putExtra("label",foodLabel); //Load in the TV with the appropriate label and step by step recipe guide
                        detailIntent.putExtra("recipeGuide",recipeDetail);
                    }else if(pickedRecipe.equals("Cauliflower Buffalo Wings")){ //Wings are selected from spinner
                        foodLabel = "Cauliflower Buffalo Wings \n Recipe";
                        recipeDetail = "\nIngredients\n" +
                                "\n" +
                                "    1 large head cauliflower\n" +
                                "    1 cup all-purpose flour can substitute with white rice flour to make GF\n" +
                                "    1 teaspoon paprika\n" +
                                "    2 teaspoons garlic powder\n" +
                                "    1 teaspoon salt\n" +
                                "    1/2 teaspoon pepper\n" +
                                "    1+1/2 cup unsweetened almond milk\n" +
                                "    1/2 cup hot sauce I use Frank's\n" +
                                "    2 Tablespoons vegan butter melted; I use Earth Balance\n" +
                                "    1 Tablespoon lemon juice about 1/2 lemon\n" +
                                "\n" +
                                "Instructions\n" +
                                "\n" +
                                "    1. Preheat the oven to 450 degrees Fahrenheit. Line a baking sheet with parchment paper and top with a cooling rack. Set aside.\n" +
                                "    2. Cut the cauliflower: Remove the green leaves from the bottom and trim the stump. Turn the cauliflower right-side-up and cut into quarters. From each quarter, trim the center by making a cut diagonally. Using hands, break cauliflower into florets.\n" +
                                "    3. In a large mixing bowl, combine flour, paprika, garlic powder, salt, pepper, and almond milk. Whisk until smooth. The mixture should be thick and pourable like a cake batter.\n" +
                                "    4. Add cauliflower florets to the mixing bowl and using tongs, coat evenly. Place cauliflower on the prepared baking sheet and allow the excess batter to drip from the cooling rack to the parchment paper.\n" +
                                "    5. Discard the parchment paper and grease the baking sheet. Transfer the cauliflower from the cooling rack to the baking sheet. Bake for 20 minutes.\n" +
                                "    6. In a small mixing bowl, combine hot sauce, vegan butter, and lemon juice. When cauliflower is done baking, remove from the oven and brush each piece with buffalo sauce.\n" +
                                "    7. Bake cauliflower for an additional 10 minutes. Remove from the oven and coat with remaining buffalo sauce.\n" +
                                "    8. Serve with vegan ranch, carrots, and celery.\n";

                        detailIntent.putExtra("label",foodLabel); //Load in the TV with the appropriate label and step by step recipe guide
                        detailIntent.putExtra("recipeGuide",recipeDetail);

                    }else if(pickedRecipe.equals("Spinach Lasagna")){ //Lasagna is picked from spinner
                        foodLabel = "Spinach Lasagna \n Recipe";
                        recipeDetail = "\nIngredients\n" +
                                "\n" +
                                "    1 package gluten-free lasagna noodles (or lasagna noodles of choice)\n" +
                                "    6 cups fresh spinach\n" +
                                "    1.5 cups vegan ricotta (or homemade*)\n" +
                                "    1 (15 oz) jar tomato sauce of choice\n" +
                                "    1 - 2 tablespoons Italian seasoning (optional)\n" +
                                "    1 cup shredded vegan cheese\n" +
                                "    Salt & pepper if needed\n" +
                                "\n" +
                                "Instructions\n" +
                                "\n" +
                                "    1. Preheat the oven to 375 degreesºF.\n" +
                                "    2. Cook lasagna noodles according to the package instructions.\n" +
                                "    3. While the pasta is cooking, add the spinach in a small saute pan. Add a splash of water and allow spinach to wilt. Transfer the spinach to a colander and press out as much additional as possible. Set aside.\n" +
                                "    4. Once the noodles have finished cooking, line the bottom of a 9\" x 13\" with a thin layer of tomato sauce. Add a layer of noodles and some dollops of the ricotta. Spread evenly across the noodles. Sprinkle with Italian seasoning (if using), then top with some spinach and about 1/4 cup of tomato sauce and again spread evenly across the layer.\n" +
                                "    5. Repeat this step for another two or three layers (depending on the size of your pan and noodles).\n" +
                                "    6. Top with a final layer of noodles, spread with sauce and sprinkle with the shredded vegan cheese.\n" +
                                "    7. Bake in the center of the oven for about 35 - 45 minutes, until the cheese has melted and the lasagna is fully cooked and heated through.\n" +
                                "    8. Cool for about 10 minutes, then slice and serve immediately. Garnish with red pepper flakes and some fresh herbs if desired!\n";
                        detailIntent.putExtra("label",foodLabel); //Load in the TV with the appropriate label and step by step recipe guide
                        detailIntent.putExtra("recipeGuide",recipeDetail);
                    }else if (pickedRecipe.equals("Carrot Cake Oats")){ //Oats is selected from spinner
                        foodLabel = "Carrot Cake Oats \n Recipe";
                        recipeDetail = "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "Dry\n" +
                                "\n" +
                                "    1 cup rolled oats\n" +
                                "    1/2 cup carrot, finely grated\n" +
                                "    1 teaspoon ground cinnamon\n" +
                                "    1/4 teaspoon allspice\n" +
                                "    1 tablespoon chia seeds\n" +
                                "    3 tablespoons raisins\n" +
                                "\n" +
                                "Wet\n" +
                                "\n" +
                                "    1 teaspoon vanilla extract\n" +
                                "    3 tablespoons maple syrup\n" +
                                "    1 and 1/4 cup almond milk, unsweetened\n" +
                                "\n" +
                                "Instructions\n" +
                                "\n" +
                                "    1. First, mix all dry ingredients in a large bowl.\n" +
                                "    2. Add wet ingredients and mix again.\n" +
                                "    3. Place in the refrigerator, covered, for at least 2 hours or over night.\n" +
                                "    4. Top with Greek yogurt and pecans.\n" +
                                "\n";
                        detailIntent.putExtra("label",foodLabel); //Load in the TV with the appropriate label and step by step recipe guide
                        detailIntent.putExtra("recipeGuide",recipeDetail);
                    }

                startActivity(detailIntent); //Take care of starting the 2nd activity
                }


            }
        });



    }// end onCreate

    //Take care of changing the image that appears on the screen when the user picks something
    private void imagePicked(){
        pickedRecipe = recipeSpin.getSelectedItem().toString();

        if(pickedRecipe.equals("Spicy Black Bean soup")){    //soup is picked
            imageSpin.setImageResource(R.drawable.soupspin);
        }else if(pickedRecipe.equals("Cauliflower Buffalo Wings")){ //cauliflower wing is picked
            imageSpin.setImageResource(R.drawable.caulispin);
        }else if(pickedRecipe.equals("Spinach Lasagna")){   //lasagna is picked
            imageSpin.setImageResource(R.drawable.lasagnaspin);
        }else if(pickedRecipe.equals("Carrot Cake Oats")){  //oats is picked
            imageSpin.setImageResource(R.drawable.carrotspin);
        }else{
            imageSpin.setImageResource(R.drawable.nanaspin); //nana bread is default
        }



    }



    public void recipeDetail(View view){
        Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);

        startActivity(detailIntent);
    }

    /*

    Oats Recipe Used from site below
    https://fitfoodiefinds.com/carrot-cake-overnight-oats/print/37629/

    Lasagna Recipe is used from this site
    https://www.simplyquinoa.com/wprm_print/48484

    Black Bean soup is used from this site
    https://minimalistbaker.com/wprm_print/35589

    Wing Recipe is used from this site
    https://mindfulavocado.com/wprm_print/recipe/10357

    Banana Recipe is used from this site
    https://domesticgothess.com/wprm_print/11966

     */

}//end Main