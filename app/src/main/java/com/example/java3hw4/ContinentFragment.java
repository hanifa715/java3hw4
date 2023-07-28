package com.example.java3hw4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.java3hw4.databinding.FragmentContinentBinding;

import java.util.ArrayList;
import java.util.List;

public class ContinentFragment extends Fragment implements OnItemClickListener {

    private FragmentContinentBinding binding;
    private ContinentAdapter adapter;
    private ArrayList<Continent> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadContinentsFromDataSource();
        adapter = new ContinentAdapter(continentList,this);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadContinentsFromDataSource(){
        continentList.add(new Continent("Asia"));
        continentList.add(new Continent("Africa"));
        continentList.add(new Continent("North America"));
        continentList.add(new Continent("South America"));
        continentList.add(new Continent("Europe"));
        continentList.add(new Continent("Antarctica"));
        continentList.add(new Continent("Australia"));
    }



    @Override
    public void OnItemClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("hanifa",position);

        CountriesFragment countriesFragment = new CountriesFragment();
        countriesFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,countriesFragment).addToBackStack(null).commit();
    }
}