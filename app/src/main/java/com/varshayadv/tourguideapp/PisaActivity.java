package com.varshayadv.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PisaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pisa);

        TextView ttdp = (TextView) findViewById(R.id.pisa_things_to_do);

        ttdp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent ttdfIntent = new Intent(PisaActivity.this, PisaThingsToDoActivity.class);
                startActivity(ttdfIntent);
            }
        });

        TextView sip = (TextView) findViewById(R.id.pisa_attractions);

        sip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent pifIntent = new Intent(PisaActivity.this, PisaSightsActivity.class);
                startActivity(pifIntent);
            }
        });

    }
}
