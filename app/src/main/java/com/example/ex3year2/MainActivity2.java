package com.example.ex3year2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {
    /**
     * @author      Ziv Ankri adderss: za6200@bs.amalnet.k12.il
     * @version     7.3.1
     * @since       26\9\2023
     * the class will make a manu which has 3 colors and i add another one and every time you press a color it change the background
     color to the color clicked
     */
    private LinearLayout linlay2;
    private ImageView imageView2;
    Intent mainActivity;

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        /**
         *  function will add another color to the manu
         *
         * @param	manu the manu
         * @return	true
         */
        טיפ:

        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"black");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        /**
         * function will set the background color to the color clicked
         * <p>
         *
         * @param	item the item clicked
         * @return	true
         */

        String st = item.getTitle().toString();
        if(st.equals("red"))
        {
            linlay2.setBackgroundColor(Color.RED);//set background to red
        }
        else if(st.equals("blue"))
        {
            linlay2.setBackgroundColor(Color.BLUE);//set background to blue
        }
        else if(st.equals("green"))
        {
            linlay2.setBackgroundColor(Color.GREEN);//set background to green
        }
        else if(st.equals("black"))
        {
            linlay2.setBackgroundColor(Color.BLACK);//set background to black
        }
        return super.onOptionsItemSelected(item);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView2 = findViewById(R.id.imageView2);
        linlay2 = findViewById(R.id.linlay2);
        mainActivity = new Intent(this, MainActivity.class);
    }

    public void back(View view) {
        /**
         * start the first activity
         */

        startActivity(mainActivity);
    }
}