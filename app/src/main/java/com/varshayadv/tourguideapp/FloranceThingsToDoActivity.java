package com.varshayadv.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FloranceThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_florance_things_to_do);

        ArrayList<custom> w = new ArrayList<custom>();
        w.add(new custom("You Can Go For Tuscany Sightseeing", R.drawable.f1));
        w.add(new custom("You Can Take Cinque Day Trip", R.drawable.f2));
        w.add(new custom("You Can Take Pisa Trip", R.drawable.f3));
        w.add(new custom("You Can Go For Florance Walking Tour", R.drawable.f4));

        customAdapter adapter = new customAdapter(this, w);

        ListView listView = (ListView) findViewById(R.id.things_to_do_in_florance);

        listView.setAdapter(adapter);

    }
}
