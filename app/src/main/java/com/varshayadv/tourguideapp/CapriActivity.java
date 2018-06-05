package com.varshayadv.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CapriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capri);

        TextView ttdc = (TextView) findViewById(R.id.capri_things_to_do);

        ttdc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent ttcfIntent = new Intent(CapriActivity.this, CapriThingsToDoActivity.class);
                startActivity(ttcfIntent);
            }
        });

        TextView sic = (TextView) findViewById(R.id.capri_attractions);

        sic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sicIntent = new Intent(CapriActivity.this, CapriSightsActivity.class);
                startActivity(sicIntent);
            }
        });

    }
}
