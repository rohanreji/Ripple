package com.maangalabs.android.frontscreen;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by rohan on 7/2/15.
 */
public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private List<CardInfo> cardList;

    public CardAdapter(List<CardInfo> cardList) {
        this.cardList = cardList;
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

    @Override
    public void onBindViewHolder(CardViewHolder cardViewHolder, int i) {
        CardInfo ci = cardList.get(i);

        cardViewHolder.vTitle.setText(ci.name );
        cardViewHolder.im.setImageResource(R.drawable.ic_launcher);

    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_layout, viewGroup, false);

        return new CardViewHolder(itemView);
    }

}