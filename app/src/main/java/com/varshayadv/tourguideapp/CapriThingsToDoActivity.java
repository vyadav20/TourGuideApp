package com.varshayadv.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CapriThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capri_things_to_do);

        ArrayList<custom> w = new ArrayList<custom>();
        w.add(new custom("You Can Take Capri Day Trip", R.drawable.c1));
        w.add(new custom("You Can Take Naples Tour", R.drawable.c2));
        w.add(new custom("You Can Take Napels Shore Tour", R.drawable.c3));
        w.add(new custom("You Can Visit Blue Grotto ", R.drawable.c4));
        w.add(new custom("You Can Visit Positano Sorrento", R.drawable.c5));
        w.add(new custom("You Can Visit Mt. Vesuvius", R.drawable.c6));

        customAdapter adapter = new customAdapter(this, w);

        ListView listView = (ListView) findViewById(R.id.things_to_do_in_capri);

        listView.setAdapter(adapter);

    }
}
