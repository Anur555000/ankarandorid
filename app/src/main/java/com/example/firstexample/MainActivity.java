package com.example.firstexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ex1, ex2, ex3, ex4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
////jhvjhvvj
        ex1 = findViewById(R.id.button1);
        ex2 = findViewById(R.id.button2);
        ex3 = findViewById(R.id.button3);
        ex4 = findViewById(R.id.button4);


        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Main2Activity.class);
                startActivity(myIntent);
            }
        });

        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Main3Activity.class);
                startActivity(myIntent);
            }
        });

        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Main4Activity.class);
                startActivity(myIntent);
            }
        });

        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Main5Activity.class);
                startActivity(myIntent);
            }
        });
    }


}
