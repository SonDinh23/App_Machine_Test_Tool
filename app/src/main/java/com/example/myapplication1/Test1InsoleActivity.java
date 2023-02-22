package com.example.myapplication1;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Test1InsoleActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private ProgressBar progressBar1;

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    DatabaseReference buttonStartPush = database.getReference("btnStart1");
    DatabaseReference buttonPausePush = database.getReference("btnPause1");
    DatabaseReference buttonStopPush = database.getReference("btnStop1");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        progressBar1 = findViewById(R.id.progressBar3);

        textView1 = findViewById(R.id.textView16);
        textView2 = findViewById(R.id.textView17);
        textView3 = findViewById(R.id.textView20);
        textView4 = findViewById(R.id.textView21);
        textView5 = findViewById(R.id.textView23);



// send data to firebase
        myRef.child("data1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
                textView1.setText(String.valueOf(value));
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });

        myRef.child("countdata1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
                textView2.setText(String.valueOf(value));
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });
//
        myRef.child("datacount1L").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
                textView3.setText(String.valueOf(value));
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });

        myRef.child("datacount1R").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
                textView4.setText(String.valueOf(value));
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });

        myRef.child("data").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                Integer value = snapshot.getValue(Integer.class);
//                Integer a = (Integer) value;
                textView5.setText(String.valueOf(value));
                progressBar1.setProgress(value);
            }

            @Override
            public void onCancelled( DatabaseError error) {
            }
        });
////        myRef.setValue("Hello");
//
//
        button1 = findViewById(R.id.button16);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1InsoleActivity.this,TestInsoleActivity.class);
                startActivity(intent);
                Toast.makeText(Test1InsoleActivity.this, "Back!",
                        Toast.LENGTH_SHORT).show();
            }
        });
//
        button2 = findViewById(R.id.button17);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1InsoleActivity.this,MenuActivity.class);
                startActivity(intent);
                Toast.makeText(Test1InsoleActivity.this, "Home!",
                        Toast.LENGTH_SHORT).show();
            }
        });
//
        button3 = findViewById(R.id.button13);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStartPush.setValue("1");
                Toast.makeText(Test1InsoleActivity.this, "Start!",
                        Toast.LENGTH_SHORT).show();
            }
        });
//
        button4 = findViewById(R.id.button14);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonPausePush.setValue("1");
                Toast.makeText(Test1InsoleActivity.this, "Pause!",
                        Toast.LENGTH_SHORT).show();
            }
        });
//
        button5 = findViewById(R.id.button15);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStopPush.setValue("1");
                Toast.makeText(Test1InsoleActivity.this, "Stop!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
