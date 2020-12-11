package com.example.esercitazione1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button incremento, decremento, incremento5, decremento5, reset;
    EditText input;
    int minValue=0;
    int maxValue=100;
    int modelValue=50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incremento = findViewById(R.id.incremento);
        decremento = findViewById(R.id.decremento);
        input = findViewById(R.id.input);
        incremento5 = findViewById(R.id.incremento5);
        decremento5 = findViewById(R.id.decremento5);
        reset = findViewById(R.id.reset);
        updateValue(modelValue);
        incremento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateValue(++modelValue);
            }
        });
        decremento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateValue(--modelValue);
            }
        });
        incremento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateValue(modelValue+5);
            }
        });
        decremento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                updateValue(modelValue-5);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateValue(0);
            }
        });

    }
    protected void updateValue(int newValue){
        newValue = newValue>maxValue ? 0 : newValue;
        newValue = newValue<minValue ? minValue : newValue;
        this.modelValue=newValue;
        input.setText(""+modelValue);

    }


    /*
    @Override
    protected void onStop(){
        super.onStop();

        TextView prova = findViewById(R.id.provaId);
        prova.setText("Cambio Testo onStop");
    }
    */

}