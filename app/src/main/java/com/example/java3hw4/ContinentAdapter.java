package com.example.java3hw4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContinentAdapter extends RecyclerView.Adapter <ContinentAdapter.ContinentViewHolder>{

    private ArrayList<Continent> continentsList;
    private OnItemClickListener onItemClickListener;

    public ContinentAdapter(ArrayList<Continent> continentsList, OnItemClickListener onItemClickListener) {
        this.continentsList = continentsList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder,int position) {
        holder.bind(continentsList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.OnItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
//        if(continentsList==null) return 0;
//        return continentsList.size();
        return continentsList.size();
    }

    public class ContinentViewHolder extends RecyclerView.ViewHolder {
        private TextView tvContinentName;

        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvContinentName = itemView.findViewById(R.id.tvContinentName);
        }
        public void bind(Continent continent) {
            tvContinentName.setText(continent.getName());
        }
    }

}
