package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CommerceStream extends AppCompatActivity implements View.OnClickListener {

    EditText Point1, Point2, Point3, Point4, Point5, Point6, Point7, Results;
    Button Btn1;
    double a1, a2, a3, a4, a5, a6, a7, a8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercestream);

        Point1 = (EditText)findViewById(R.id.Point1);
        Point2 = (EditText)findViewById(R.id.Point2);
        Point3 = (EditText)findViewById(R.id.Point3);
        Point4 = (EditText)findViewById(R.id.Point4);
        Point5 = (EditText)findViewById(R.id.Point5);
        Point6 = (EditText)findViewById(R.id.Point6);
        Point7 = (EditText)findViewById(R.id.Point7);
        Results = (EditText)findViewById(R.id.Results);
        Btn1 = (Button)findViewById(R.id.Btn1);
        Btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        a1 = Double.parseDouble(Point1.getText().toString());
        a2 = Double.parseDouble(Point2.getText().toString());
        a3 = Double.parseDouble(Point3.getText().toString());
        a4 = Double.parseDouble(Point4.getText().toString());
        a5 = Double.parseDouble(Point5.getText().toString());
        a6 = Double.parseDouble(Point6.getText().toString());
        a7 = Double.parseDouble(Point7.getText().toString());
        a8 = a1 + a2 + a3 + a4 + a5 + a6 + a7;
        Results.setText(Double.toString(a8));

        Intent intent = new Intent(this, WebActivity.class);
        if(a8 >= 17) {
            startActivity(intent);
        }
    }

}
