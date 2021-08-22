package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);

       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startService(new Intent(MainActivity.this,MyServices.class));

           }
       });

       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               stopService(new Intent(MainActivity.this, MyServices.class));
           }
       });
    }
}