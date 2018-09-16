package com.daikirah.joshua.geoguess;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

class GeoObjectViewHolder extends RecyclerView.ViewHolder{

    ImageView geoImage;
    String inEurope;
    View view;

    public GeoObjectViewHolder(View itemView) {
        super(itemView);
        geoImage = itemView.findViewById(R.id.geoImage);
        view = itemView;
    }


}
