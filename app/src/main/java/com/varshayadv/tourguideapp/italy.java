package com.varshayadv.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;
import static com.varshayadv.tourguideapp.R.id.visit;

public class italy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);
        TextView ro = (TextView) findViewById(R.id.roma);

        ro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent roIntent = new Intent(italy.this, RomaActivity.class);
                startActivity(roIntent);
            }
        });

        TextView fl = (TextView) findViewById(R.id.florance);

        fl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent flIntent = new Intent(italy.this, FloranceActivity.class);
                startActivity(flIntent);
            }
        });


        TextView pi = (TextView) findViewById(R.id.pisa);

        pi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent piIntent = new Intent(italy.this, PisaActivity.class);
                startActivity(piIntent);
            }
        });


        TextView ca = (TextView) findViewById(R.id.capri);

        ca.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent caIntent = new Intent(italy.this, CapriActivity.class);
                startActivity(caIntent);
            }
        });


    }
}


