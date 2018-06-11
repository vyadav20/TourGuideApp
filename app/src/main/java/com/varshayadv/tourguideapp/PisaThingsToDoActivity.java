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
        w.add(new custom("You Can Visit Pnte Vecchio", R.drawable.p1));
        w.add(new custom("You Can Take Half Day Chianti Tour", R.drawable.p2));
        w.add(new custom("You Can Take Chianti Terre Tour", R.drawable.p3));
        w.add(new custom("You Can Visit Leaning Tower Of Pisa", R.drawable.p4));
        w.add(new custom("You Can Go For Pisa Food Tour", R.drawable.p5));
        w.add(new custom("You Can Go For Pisa Day Trip", R.drawable.p6));
        w.add(new custom("You Can Take Cooking Lessons", R.drawable.p7));
        w.add(new custom("You Can Take Cinqui Terre Tour", R.drawable.p8));

        customAdapter adapter = new customAdapter(this, w);

        ListView listView = (ListView) findViewById(R.id.things_to_do_in_pisa);

        listView.setAdapter(adapter);

    }
}
