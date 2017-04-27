package com.wtmk.alexis.spiritanimal;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {



    Drawable dolphin;
    Drawable redPanda;
    Drawable monkey;
    Drawable elephant;
    Drawable tiger;
    ImageView animalView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dolphin = ResourcesCompat.getDrawable(getResources(),R.drawable.dolphin,null);
        redPanda = ResourcesCompat.getDrawable(getResources(),R.drawable.redpanda,null);
        monkey = ResourcesCompat.getDrawable(getResources(),R.drawable.monkey,null);
        elephant = ResourcesCompat.getDrawable(getResources(),R.drawable.elephant,null);
        tiger = ResourcesCompat.getDrawable(getResources(),R.drawable.tiger,null);
        Intent intent = getIntent();
        String animal = intent.getStringExtra(MainActivity.TAG);
        animalView = (ImageView) findViewById(R.id.textImageView);

            switch (animal) {
                case "Monkey":

                    animalView.setImageDrawable(monkey);
                    Toast.makeText(Main2Activity.this,
                            "You're a monkey!", Toast.LENGTH_SHORT).show();

                    break;

                case "Red panda":

                    animalView.setImageDrawable(redPanda);
                    Toast.makeText(Main2Activity.this,
                            "You're a red panda!", Toast.LENGTH_SHORT).show();

                    break;

                case "Dolphin":

                    animalView.setImageDrawable(dolphin);
                    Toast.makeText(Main2Activity.this,
                            "You're a dolphin", Toast.LENGTH_SHORT).show();

                    break;

                case "Elephant":

                    animalView.setImageDrawable(elephant);
                    Toast.makeText(Main2Activity.this,
                            "You're an elephant!", Toast.LENGTH_SHORT).show();

                    break;

                case "Tiger":

                    animalView.setImageDrawable(tiger);
                    Toast.makeText(Main2Activity.this,
                            "You're a tiger!", Toast.LENGTH_SHORT).show();

                    break;
            }


    }

}
