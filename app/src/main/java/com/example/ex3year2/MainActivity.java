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
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {
    /**
     * @author      Ziv Ankri adderss: za6200@bs.amalnet.k12.il
     * @version     7.3.1
     * @since       26\9\2023
     * the class will make a manu which has 3 colors and every time you press a color it change the background
    color to the color clicked
     */

    private LinearLayout linlay;
    private ImageView imageView;
    Intent mainActivity2;

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        /**
         * the function will change the background color depends on the color clicked
         * @param	item the item clicked on the manu
         * @return	boolean true
         */

        String st = item.getTitle().toString();
        if(st.equals("red"))
        {
            linlay.setBackgroundColor(Color.RED);//set background to red
        }
        else if(st.equals("blue"))
        {
            linlay.setBackgroundColor(Color.BLUE);//set background to blue
        }
        else if(st.equals("green"))
        {
            linlay.setBackgroundColor(Color.GREEN);//set background to green
        }
        return super.onOptionsItemSelected(item);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        linlay = findViewById(R.id.linlay);
        mainActivity2 = new Intent(this, MainActivity2.class);

    }

    public void next1(View view) {
        /**
         * function will start the next activity
         */

        startActivity(mainActivity2);

    }
}



