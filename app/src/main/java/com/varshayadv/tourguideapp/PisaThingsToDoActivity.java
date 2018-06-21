package com.varshayadv.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PisaThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pisa_things_to_do);

        ArrayList<custom> w = new ArrayList<custom>();
        w.add(new custom(getString(R.string.first_thing), R.drawable.p1));
        w.add(new custom(getString(R.string.second_thing), R.drawable.p2));
        w.add(new custom(getString(R.string.third_thing), R.drawable.p3));
        w.add(new custom(getString(R.string.fourth_thing), R.drawable.p4));
        w.add(new custom(getString(R.string.fifth_thing), R.drawable.p5));
        w.add(new custom(getString(R.string.sixth_thing), R.drawable.p6));
        w.add(new custom(getString(R.string.seventh_thing), R.drawable.p7));
        w.add(new custom(getString(R.string.eighth_thing), R.drawable.p8));

        customAdapter adapter = new customAdapter(this, w);

        ListView listView = (ListView) findViewById(R.id.things_to_do_in_pisa);

        listView.setAdapter(adapter);

    }
}
