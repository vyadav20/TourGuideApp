package com.varshayadv.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FloranceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_florance);

        TextView ttdf = (TextView) findViewById(R.id.florance_things_to_do);

        ttdf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent ttdfIntent = new Intent(FloranceActivity.this, FloranceThingsToDoActivity.class);
                startActivity(ttdfIntent);
            }
        });

        TextView sif = (TextView) findViewById(R.id.florance_attractions);

        sif.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sifIntent = new Intent(FloranceActivity.this, FloranceSightsActivity.class);
                startActivity(sifIntent);
            }
        });

    }
}
