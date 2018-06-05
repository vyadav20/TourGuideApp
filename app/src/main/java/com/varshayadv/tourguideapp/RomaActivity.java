package com.varshayadv.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RomaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roma);

        TextView ttd = (TextView) findViewById(R.id.roma_things_to_do);

        ttd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent ttdIntent = new Intent(RomaActivity.this, ThingsToDoActivity.class);
                startActivity(ttdIntent);
            }
        });

        TextView si = (TextView) findViewById(R.id.roma_attractions);

        si.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent siIntent = new Intent(RomaActivity.this, SightsActivity.class);
                startActivity(siIntent);
            }
        });

    }
}
