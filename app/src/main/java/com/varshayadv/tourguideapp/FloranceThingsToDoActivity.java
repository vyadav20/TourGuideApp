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
        w.add(new custom(getString(R.string.first_thing), R.drawable.f1));
        w.add(new custom(getString(R.string.second_thing), R.drawable.f2));
        w.add(new custom(getString(R.string.third_thing), R.drawable.f3));
        w.add(new custom(getString(R.string.fourth_thing), R.drawable.f4));

        customAdapter adapter = new customAdapter(this, w);

        ListView listView = (ListView) findViewById(R.id.things_to_do_in_florance);

        listView.setAdapter(adapter);

    }
}
