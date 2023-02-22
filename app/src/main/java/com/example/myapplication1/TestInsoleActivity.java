package com.example.myapplication1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestInsoleActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testinsole);

        button1 = findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestInsoleActivity.this,MenuActivity.class);
                startActivity(intent);
                Toast.makeText(TestInsoleActivity.this, "Home!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button2 = findViewById(R.id.button7);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestInsoleActivity.this,MenuActivity.class);
                startActivity(intent);
                Toast.makeText(TestInsoleActivity.this, "Back!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button3 = findViewById(R.id.button5);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestInsoleActivity.this,Test2InsoleActivity.class);
                startActivity(intent);
            }
        });

        button4 = findViewById(R.id.button3);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestInsoleActivity.this,Test1InsoleActivity.class);
                startActivity(intent);
            }
        });
    }
}
