package com.example.java3hw4;

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

public class CountriesAdapter extends RecyclerView.Adapter <CountriesAdapter.CountriesViewHolder>{

    private ArrayList<Country> countriesList;
    private OnItemClickListener onItemClickListener;

    public CountriesAdapter(ArrayList<Country> countriesList) {
        this.countriesList = countriesList;

    }

    @NonNull
    @Override
    public CountriesAdapter.CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountriesAdapter.CountriesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_countries,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        holder.bind(countriesList.get(position));

    }

    @Override
    public int getItemCount() {
        return countriesList.size() ;
    }

    public class CountriesViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNameCountry;
        private TextView tvCapitalCountry;
        private ImageView imgFlag;

        public CountriesViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameCountry = itemView.findViewById(R.id.tvCountryName);
            tvCapitalCountry = itemView.findViewById(R.id.tvCapital);
            imgFlag = itemView.findViewById(R.id.img_flag);
        }
        public void bind (Country country){
            tvNameCountry.setText(country.getName());
            tvCapitalCountry.setText(country.getName());
            Glide.with(imgFlag).load(country.getFlagUrl()).into(imgFlag);
        }
    }
}
