package com.maangalabs.android.frontscreen;

/**
 * Created by rohan on 7/2/15.
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class NewsFeedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.newsfeed_layout, container, false);
        RecyclerView recList = (RecyclerView) rootView.findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this.getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        ArrayList<CardInfo> cards= new ArrayList<CardInfo>();
        cards.add(new CardInfo("rohan"));
        cards.add(new CardInfo("tom"));
        cards.add(new CardInfo("johan"));
        CardAdapter ca=new CardAdapter(cards);
        recList.setAdapter(ca);


        return rootView;
    }


}