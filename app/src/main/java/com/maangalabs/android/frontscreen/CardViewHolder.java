package com.maangalabs.android.frontscreen;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rohan on 7/2/15.
 */
public class CardViewHolder extends RecyclerView.ViewHolder {

    protected TextView vTitle;
    protected ImageView im;

    public CardViewHolder(View v) {
        super(v);

        vTitle = (TextView) v.findViewById(R.id.textView);
        im= (ImageView) v.findViewById(R.id.imageView);
    }
}