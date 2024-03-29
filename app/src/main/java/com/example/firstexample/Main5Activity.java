package com.example.firstexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {


    Button submit;
    EditText name, password, email, contact, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        name = findViewById(R.id.editText1);
        password = findViewById(R.id.editText2);
        email = findViewById(R.id.editText3);
        contact = findViewById(R.id.editText4);
        date = findViewById(R.id.editText5);

        submit = findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty() || password.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() || date.getText().toString().isEmpty()
                        || contact.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter the Date", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Name - " + name.getText().toString() + "\n" + " Password ‐ " +
                            password.getText().toString() + "\n" + " Date ‐ " + date.getText().toString() + "\n" + " Contact ‐ "
                            + contact.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
