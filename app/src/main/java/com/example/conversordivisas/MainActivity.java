package com.example.conversordivisas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int counter;
    Button button, res1, res2, res3, res4;
    TextView textView;
    TextView operation;
    int a, b, c, s;

    int n = (int) (Math.random() * (11 - (-10))) + (-10);


    Random r = new Random();
    Random menDiez = new Random();
    Random masDiez = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        operation = (TextView) findViewById(R.id.operacion);

        res1 = (Button) findViewById(R.id.res1);
        res2 = (Button) findViewById(R.id.res2);
        res3 = (Button) findViewById(R.id.res3);
        res4 = (Button) findViewById(R.id.res4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generaNum();
                generarRes();
                button.setEnabled(false);
                new CountDownTimer(30000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        textView.setText(String.valueOf(counter));
                        counter++;
                    }
                    public void onFinish() {
                        textView.setText("FINISH!!");
                    }
                }.start();
            }
        });
    }

    public void generaNum() {


        a = (int) (Math.random() * n);
        b = (int) (Math.random() * n);
        c = (int) (Math.random() * n);

        s = a + b * c;

        operation.setText(a + "+" + b + "*" + c);

    }


    public void generarRes() {
        ArrayList<Button> respuestas = new ArrayList<Button>();

        respuestas.add(res1);
        respuestas.add(res2);
        respuestas.add(res3);
        respuestas.add(res4);

        int k = (int) (r.nextInt(4));
        String correcta =String.valueOf(s);
        String falsa = String.valueOf(s + n);

        respuestas.get(k).setText(correcta);
        respuestas.get(k+1).setText(falsa);
        for (int i = 0; i < 3; i++) {

            if (respuestas.get(i) == null){
                respuestas.get(i).setText(falsa);
            }
        }





    }
}

