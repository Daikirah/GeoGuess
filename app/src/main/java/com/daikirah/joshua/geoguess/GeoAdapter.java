package com.daikirah.joshua.geoguess;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class GeoAdapter extends RecyclerView.Adapter<GeoObjectViewHolder> {

    private Context context;
    public List<GeoObject> geoObjectList;

    public GeoAdapter(Context context, List<GeoObject> geoObjectList) {
        this.context = context;
        this.geoObjectList = geoObjectList;
    }

    @NonNull
    @Override
    public GeoObjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,parent,false );
            return new GeoObjectViewHolder(view);
        }

    @Override
    public void onBindViewHolder(@NonNull GeoObjectViewHolder holder, int position) {
        holder.geoImage.setImageResource(geoObjectList.get(position).getGeoImage());
        holder.inEurope = geoObjectList.get(position).getGeoInEurope();
    }


    @Override
    public int getItemCount() {
        return geoObjectList.size();
    }
}
