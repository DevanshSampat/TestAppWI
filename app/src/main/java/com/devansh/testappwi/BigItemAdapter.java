package com.devansh.testappwi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BigItemAdapter extends RecyclerView.Adapter<BigItemAdapter.ViewHolder> {
    private ArrayList<ItemData> itemDataArrayList;
    private String mode;

    public BigItemAdapter(ArrayList<ItemData> itemDataArrayList,String mode) {
        this.itemDataArrayList = itemDataArrayList;
        this.mode = mode;
    }

    @NonNull
    
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        if(mode.equals("big")) return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_item,parent,false));
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  BigItemAdapter.ViewHolder holder, int position) {
        holder.mrp.setText(itemDataArrayList.get(position).getMrp());
        holder.name.setText(itemDataArrayList.get(position).getName());
        if(!itemDataArrayList.get(position).getExtras().equals("null")) holder.extra.setText(itemDataArrayList.get(position).getExtras());
    }

    @Override
    public int getItemCount() {
        return itemDataArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mrp,name,extra;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            mrp = itemView.findViewById(R.id.mrp);
            name = itemView.findViewById(R.id.item);
            extra = itemView.findViewById(R.id.extra);
        }
    }
}
