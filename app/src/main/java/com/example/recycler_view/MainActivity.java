package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<BusModel> busModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.RV);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        BusModel bm = new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV");

        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_One"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Two"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Three"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV-Four"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Five"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Six"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Seven"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Eight"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Nine"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Ten"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Eleven"));
        busModel.add( new BusModel(R.drawable.busview_icon,"RKU",R.drawable.busview_icon,"KKV_Twelve"));

        Recycler ra =new Recycler(this,busModel);
        recyclerView.setAdapter(ra);

    }
}