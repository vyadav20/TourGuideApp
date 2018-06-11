package com.varshayadv.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by himanshuyadav on 06/06/18.
 */

public class customAdapter extends ArrayAdapter<custom> {

    public customAdapter(Activity context, ArrayList<custom> w) {
        super(context, 0, w);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        custom currentcustom = getItem(position);

        TextView mTextView = (TextView) listItemView.findViewById(R.id.text_list);
        mTextView.setText(currentcustom.gettext());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_list);

        imageView.setImageResource(currentcustom.getimage());

        return listItemView;

    }
}