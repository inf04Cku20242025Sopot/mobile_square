package com.example.kwadrat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView bok, pole, obwod;
    Button obliczPole, obliczObwod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bok = findViewById(R.id.bok);
        pole=findViewById(R.id.pole);
        obwod=findViewById(R.id.obwod);
        obliczPole = findViewById(R.id.obliczPole);
        obliczObwod = findViewById(R.id.obliczObwod);

        obliczPole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bokStr = bok.getText().toString();
                if (bokStr.length()>0){
                    Double bokDbl = Double.parseDouble((bokStr));
                    Double poleWynik = bokDbl*bokDbl;
                    pole.setText(String.format("%.2f", poleWynik));

                }
            }
        });

        obliczObwod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bokStr = bok.getText().toString();
                if (bokStr.length()>0){
                    Double bokDbl = Double.parseDouble((bokStr));
                    Double obwodWynik = bokDbl*4.0;
                    obwod.setText(String.format("%.2f", obwodWynik));

                }
            }
        });



    }
}