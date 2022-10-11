package com.example.conversordivisas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    Button exBt;

    EditText editTextConv, editTextEx;

    TextView simbConv, simbEx;

    ImageButton changeBt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    public void init() {
        exBt = findViewById(R.id.convertirBoton);
        editTextConv = findViewById(R.id.textConvertir);
        editTextEx = findViewById(R.id.textConvertido);
        simbConv = findViewById(R.id.simbConvertir);
        simbEx = findViewById(R.id.simbConvertido);
        changeBt = findViewById(R.id.cambio);

        exBt.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
       // Do something in response to button click
         }
        });


        changeBt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Do something in response to button click


            }
        });
    }
}

