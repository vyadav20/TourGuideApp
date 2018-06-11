package com.varshayadv.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        ArrayList<custom> w = new ArrayList<custom>();
        w.add(new custom("You Can Visit Vatican Museums", R.drawable.r1));
        w.add(new custom("You Can Visit Colosseum", R.drawable.r2));
        w.add(new custom("You Can Visit Ruins Of Pompeii", R.drawable.r3));
        w.add(new custom("You Can Visit Rome Combo", R.drawable.r4));
        w.add(new custom("You Can Take Hop-On Hop-Of", R.drawable.r5));
        w.add(new custom("You Can Visit St Peter's", R.drawable.r6));

        customAdapter adapter = new customAdapter(this, w);

        ListView listView = (ListView) findViewById(R.id.things_to_do_in_roma);

        listView.setAdapter(adapter);


    }
}
