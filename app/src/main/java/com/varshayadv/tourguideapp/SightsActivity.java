package com.varshayadv.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);
        ArrayList<custom> w = new ArrayList<custom>();
        w.add(new custom(getString(R.string.first_attraction),R.drawable.r11));
        w.add(new custom(getString(R.string.second_attraction),R.drawable.r22));
        w.add(new custom(getString(R.string.third_attraction),R.drawable.r33));
        w.add(new custom(getString(R.string.fourth_attraction),R.drawable.r44));
        w.add(new custom(getString(R.string.fifth_attraction),R.drawable.r55));

        customAdapter adapter  = new customAdapter(this,w);

        ListView listView = (ListView) findViewById(R.id.sights_roma);

        listView.setAdapter(adapter);

    }
}
