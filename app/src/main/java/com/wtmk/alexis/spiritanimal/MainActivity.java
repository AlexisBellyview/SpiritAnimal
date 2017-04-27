package com.wtmk.alexis.spiritanimal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;


public class MainActivity extends AppCompatActivity  {

    public static final String TAG = "com.wtmk.alexis.spiritanimal";

    Spinner spinner;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    Button submit;
    ArrayAdapter<CharSequence> adapter;
    private String selected;
    private Animals animals = new Animals();
    NavigableMap<Integer,String> animalMap = new TreeMap<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        submit = (Button) findViewById(R.id.submit);
        adapter = ArrayAdapter.createFromResource(this,R.array.Answers,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);


        //When the first spinner is selected

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            selected = spinner.getSelectedItem().toString();
                switch (selected){

                    case "0 - Never":
                        animals.setRedPanda(2);

                        break;

                    case "1 - Meh, probably not.":
                        animals.setMonkey(2);

                        break;

                    case "2 - ...Maybe":
                        animals.setDolphin(1);

                        break;

                    case "3 - Kinda.":
                        animals.setElephant(1);

                        break;

                    case "4 - Yep!":
                        animals.setTiger(3);

                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //When the second spinner is selected

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected = spinner2.getSelectedItem().toString();
                    switch(selected){

                        case "0 - Never":
                            animals.setElephant(1);

                        break;

                        case "1 - Meh, probably not.":
                            animals.setRedPanda(1);


                            break;

                        case "2 - ...Maybe":


                            break;

                        case "3 - Kinda.":
                            animals.setTiger(1);

                            break;

                        case "4 - Yep!":
                            animals.setDolphin(2);

                            break;

                    }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //When the third spinner is selected

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected = spinner3.getSelectedItem().toString();
                    switch(selected){

                        case "0 - Never":
                            animals.setTiger(1);

                            //todo add another option to your spinners that is a null first value so no value is added

                            break;

                        case "1 - Meh, probably not.":


                            break;

                        case "2 - ...Maybe":
                            animals.setRedPanda(1);

                            break;

                        case "3 - Kinda.":
                            animals.setElephant(1);

                            break;

                        case "4 - Yep!":
                            animals.setMonkey(3);

                            break;

                    }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //When the fourth spinner is selected

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected = spinner4.getSelectedItem().toString();
                switch(selected){

                    case "0 - Never":
                        animals.setDolphin(2);

                        break;

                    case "1 - Meh, probably not.":
                        animals.setTiger(1);

                        break;

                    case "2 - ...Maybe":
                        animals.setRedPanda(2);

                        break;

                    case "3 - Kinda.":
                        animals.setMonkey(1);

                        break;

                    case "4 - Yep!":
                        animals.setElephant(3);

                        break;

                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //When the fifth spinner is selected

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected = spinner5.getSelectedItem().toString();
                switch(selected){

                    case "0 - Never":
                        animals.setDolphin(3);

                        break;

                    case "1 - Meh, probably not.":
                        animals.setElephant(1);

                        break;

                    case "2 - ...Maybe":
                        animals.setTiger(1);

                        break;

                    case "1 - 3 - Kinda.":
                        animals.setMonkey(2);

                        break;

                    case "4 - Yep!":
                        animals.setRedPanda(3);

                        break;

                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int monkey = animals.getMonkey();
                int dolphin = animals.getDolphin();
                int redPanda = animals.getElephant();
                int tiger = animals.getTiger();
                int elephant = animals.getElephant();

                animalMap.put(monkey, "Monkey");
                animalMap.put(dolphin, "Dolphin");
                animalMap.put(redPanda, "Red Panda");
                animalMap.put(tiger, "Tiger");
                animalMap.put(elephant, "elephant");

                Map.Entry<Integer, String> lastEntry = animalMap.lastEntry();
                String chosen = lastEntry.getValue();

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra(TAG, chosen);
                startActivity(intent);

            }
        });


    }
}
