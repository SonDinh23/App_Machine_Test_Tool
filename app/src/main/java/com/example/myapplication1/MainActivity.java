package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Muốn làm gì khi bấm vào Button thì
                //Viết code ở đây - Ví dụ:
                Intent intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Welcome!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}