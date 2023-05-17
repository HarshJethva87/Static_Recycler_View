package com.example.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler extends RecyclerView.Adapter<Recycler.ViewHolder> {

    Context context;
    ArrayList<BusModel> busModel;
    Recycler(Context context, ArrayList<BusModel> busModel){
        this.context=context;
        this.busModel = busModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.bus_cardview,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtsimg.setImageResource(busModel.get(position).simg);
        holder.txteimg.setImageResource(busModel.get(position).eimg);
        holder.fsname.setText(busModel.get(position).sname);
        holder.lename.setText(busModel.get(position).ename);



    }

    @Override
    public int getItemCount() {
        return busModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView txtsimg,txteimg;
        TextView fsname,lename;

        public ViewHolder(View itemview){
            super(itemview);

            txtsimg = itemview.findViewById(R.id.one);
            txteimg = itemview.findViewById(R.id.two);
            fsname = itemview.findViewById(R.id.startpoint);
            lename = itemview.findViewById(R.id.endpoint);

        }
    }
}
