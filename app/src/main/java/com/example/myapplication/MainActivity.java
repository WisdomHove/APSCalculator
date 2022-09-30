package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void CommerceStream(View view) {
        Intent intent = new Intent(this, CommerceStream.class);
        startActivity(intent);
    }

    public void ScienceStream(View view) {
        Intent intent = new Intent(this, ScienceStream.class);
        startActivity(intent);
    }

    public void ServicesStream(View view) {
        Intent intent = new Intent(this, ServicesStream.class);
        startActivity(intent);
    }

    public void GeneralScienceStream(View view) {
        Intent intent = new Intent(this, GeneralscienceStream.class);
        startActivity(intent);

    }
}