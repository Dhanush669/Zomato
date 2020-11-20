package com.example.zomato;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapterql extends RecyclerView.Adapter<RecyclerAdapterql.MyViewHolder>{
    List<Integer> quick=new ArrayList<>();
    Context context;

    public RecyclerAdapterql(List<Integer> datagetsets, Context context) {
        this.quick = datagetsets;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.quicklink,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(quick.get(position)).centerCrop()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return quick.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.quicklink);

        }
    }
}