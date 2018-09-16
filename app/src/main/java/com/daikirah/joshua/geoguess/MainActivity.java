package com.daikirah.joshua.geoguess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<GeoObject> geoObjects = new ArrayList<>();
        for (int i = 0; i < GeoObject.GEO_IMAGE_ID.length; i++){
            geoObjects.add(new GeoObject(GeoObject.GEO_LIST_LOCATIONS[i],GeoObject.GEO_IMAGE_ID[i]));
        }

        final RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        final GeoAdapter geoAdapter = new GeoAdapter(this, geoObjects);
        recyclerView.setAdapter(geoAdapter);

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(ItemTouchHelper.LEFT, ItemTouchHelper.LEFT |ItemTouchHelper.RIGHT ) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                if (direction == 4) {
                    Log.d("Direction", "Left");
                    Log.d("City", geoObjects.get(viewHolder.getAdapterPosition()).getGeoInEurope());
                    Toast toast = Toast.makeText(getApplicationContext(), geoObjects.get(viewHolder.getAdapterPosition()).getGeoInEurope(), Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Log.d("Direction", "Right");
                    Log.d("City", geoObjects.get(viewHolder.getAdapterPosition()).getGeoInEurope());
                    Toast toast = Toast.makeText(getApplicationContext(), geoObjects.get(viewHolder.getAdapterPosition()).getGeoInEurope(), Toast.LENGTH_SHORT);
                    toast.show();

                }
                geoObjects.remove(viewHolder.getAdapterPosition());
                recyclerView.getAdapter().notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        });

        itemTouchHelper.attachToRecyclerView(recyclerView);






    }





}
