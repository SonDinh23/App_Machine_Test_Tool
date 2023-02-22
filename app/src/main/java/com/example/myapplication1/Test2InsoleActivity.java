package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Test2InsoleActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef1 = database.getReference();

    DatabaseReference buttonStartPush = database.getReference("btnStart2");
    DatabaseReference buttonPausePush = database.getReference("btnPause2");
    DatabaseReference buttonStopPush = database.getReference("btnStop2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
//        myRef.setValue("Hello, World!");
        textView1 = findViewById(R.id.textView16);
        textView2 = findViewById(R.id.textView17);
        textView3 = findViewById(R.id.textView20);
        textView4 = findViewById(R.id.textView21);
        textView5 = findViewById(R.id.textView25);

        myRef1.child("runtimeH").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
                textView1.setText(String.valueOf(value));
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });

        myRef1.child("runtimeM").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
                textView5.setText(String.valueOf(value));
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });

        myRef1.child("countdata2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
                textView2.setText(String.valueOf(value));
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });

        myRef1.child("datacount2L").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
                textView3.setText(String.valueOf(value));
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });

        myRef1.child("datacount2R").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
                textView4.setText(String.valueOf(value));
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });

        button1 = findViewById(R.id.button16);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test2InsoleActivity.this,TestInsoleActivity.class);
                startActivity(intent);
                Toast.makeText(Test2InsoleActivity.this, "Back!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button2 = findViewById(R.id.button17);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test2InsoleActivity.this,MenuActivity.class);
                startActivity(intent);
                Toast.makeText(Test2InsoleActivity.this, "Home!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button3 = findViewById(R.id.button13);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStartPush.setValue("1");
                Toast.makeText(Test2InsoleActivity.this, "Start!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button4 = findViewById(R.id.button14);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonPausePush.setValue("1");
                Toast.makeText(Test2InsoleActivity.this, "Pause!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button5 = findViewById(R.id.button15);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStopPush.setValue("1");
                Toast.makeText(Test2InsoleActivity.this, "Stop",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
