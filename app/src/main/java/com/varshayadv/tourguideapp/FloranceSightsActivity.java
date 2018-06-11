package com.varshayadv.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FloranceSightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_florance_sights);

        ArrayList<custom> w = new ArrayList<custom>();
        w.add(new custom("First Attraction", R.drawable.f11));
        w.add(new custom("Second Attraction", R.drawable.f22));
        w.add(new custom("Third Attraction", R.drawable.f33));
        w.add(new custom("Fourth Attraction", R.drawable.f44));
        w.add(new custom("Fifth Attraction", R.drawable.f55));

        customAdapter adapter = new customAdapter(this, w);

        ListView listView = (ListView) findViewById(R.id.sights_florance);

        listView.setAdapter(adapter);

    }
}
