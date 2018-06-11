package com.varshayadv.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CapriSightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capri_sights);

        ArrayList<custom> w = new ArrayList<custom>();
        w.add(new custom("First Attraction", R.drawable.c11));
        w.add(new custom("Second Attraction", R.drawable.c22));
        w.add(new custom("Third Attraction", R.drawable.c33));
        w.add(new custom("Fourth Attraction", R.drawable.c44));
        w.add(new custom("Fifth Attraction", R.drawable.c55));
        w.add(new custom("Sixth Attraction", R.drawable.c66));

        customAdapter adapter = new customAdapter(this, w);

        ListView listView = (ListView) findViewById(R.id.sights_capri);

        listView.setAdapter(adapter);

    }
}
