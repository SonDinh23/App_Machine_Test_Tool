package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,TestInsoleActivity.class);
                startActivity(intent);
                Toast.makeText(MenuActivity.this, "Welcome Test Insole!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Để slide hand
                Toast.makeText(MenuActivity.this, "Welcome Test Hand!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button3 = findViewById(R.id.button4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "Welcome Test ...!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button4 = findViewById(R.id.button5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "Welcome Test ...!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
