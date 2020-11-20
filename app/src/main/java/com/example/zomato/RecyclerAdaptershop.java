package com.example.zomato;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdaptershop extends RecyclerView.Adapter<RecyclerAdaptershop.MyViewHolder>{
    List<Datagetsetshop> datagetsets=new ArrayList<>();
    Context context;

    public RecyclerAdaptershop(List<Datagetsetshop> datagetsets, Context context) {
        this.datagetsets = datagetsets;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.resnearyouholder,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(datagetsets.get(position).getName());
        holder.time.setText(datagetsets.get(position).getTime());
        holder.loc.setText(datagetsets.get(position).getLoc());
        holder.rate.setText(datagetsets.get(position).getRate());
        Glide.with(context).load(datagetsets.get(position).getPhoto()).centerCrop()
                .into(holder.photo);
    }

    @Override
    public int getItemCount() {
        return datagetsets.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView photo;
        TextView name,loc,time,rate;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            photo=itemView.findViewById(R.id.near);
            name=itemView.findViewById(R.id.shopname);
            loc=itemView.findViewById(R.id.shoploc);
            time=itemView.findViewById(R.id.shoptime);
            rate=itemView.findViewById(R.id.rate);
        }
    }
}
