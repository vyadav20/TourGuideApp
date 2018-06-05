package com.varshayadv.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.varshayadv.tourguideapp.R.id.visit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView it = (TextView) findViewById(visit);

        it.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent itIntent = new Intent(MainActivity.this, italy.class);
                startActivity(itIntent);
            }
        });

    }
}
