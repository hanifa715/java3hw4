package com.example.java3hw4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.java3hw4.databinding.FragmentCountriesBinding;

import java.util.ArrayList;
import java.util.List;

public class CountriesFragment extends Fragment {

    private FragmentCountriesBinding binding;
    private CountriesAdapter countriesAdapter;
    private ArrayList<Country> countriesList;
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCountriesBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("hanifa");

        checkPosition(position);
        countriesAdapter = new CountriesAdapter(countriesList);
        binding.rvCountries.setAdapter(countriesAdapter);
    }

    private void checkPosition(int position) {
        if (position == 0){
            loadAsia();
        }
        else if(position == 1){
            loadAfrica();
        }
        else if(position == 2){
            loadNorthAmerica();
        }
        else if(position == 3){
            loadSouthAmerica();
        } else if (position == 4) {
            loadAustralia();
        } else if (position == 5) {
            loadEurope();
        } else if (position == 6) {
            Toast.makeText(requireActivity(), "Нету стран", Toast.LENGTH_SHORT).show();
        }
    }

    private void loadAsia() {
        countriesList = new ArrayList<>();
        countriesList.add(new Country("China", "Beijing", "https://freepngimg.com/thumb/china/159852-flag-vector-china-free-clipart-hq.png"));
        countriesList.add(new Country("Kyrgyzstan", "Bishkek", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/2560px-Flag_of_Kyrgyzstan.svg.png"));
        countriesList.add(new Country("Kazakhstan", "Astana", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/240px-Flag_of_Kazakhstan.svg.png"));
        countriesList.add(new Country("India", "New Delhi", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/India-flag-a4.jpg/1280px-India-flag-a4.jpg"));
        countriesList.add(new Country("Thailand", "Bangkok", "https://media.istockphoto.com/id/471686876/vector/flag-of-thailand.jpg?s=612x612&w=0&k=20&c=5lAciWtQb1VzB6dUy8jzJ82yMxAUeITBcdDsRxMPOm8="));
    }

    private void loadAfrica(){
        countriesList = new ArrayList<>();
        countriesList.add(new Country("Egypt", "Cairo", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/2560px-Flag_of_Egypt.svg.png"));
        countriesList.add(new Country("Kenya", "Nairobi", "https://cdn.britannica.com/15/15-004-B5D6BF80/Flag-Kenya.jpg"));
        countriesList.add(new Country("Ghana", "Accra", "https://media.istockphoto.com/id/471793389/photo/ghana-flag.jpg?s=612x612&w=0&k=20&c=AGRYnAb4QDBeRUhvxCoYlwl09_7gN4UPrLb6tSJzstg="));
        countriesList.add(new Country("Morocco", "Rabat", "https://cdn.webshopapp.com/shops/94414/files/52406302/flag-of-morocco.jpghttps://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_the_United_Kingdom_%283-5%29.svg/240px-Flag_of_the_United_Kingdom_%283-5%29.svg.png"));
        countriesList.add(new Country("Uganda", "Kampala", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Flag_of_Uganda.svg/1280px-Flag_of_Uganda.svg.png"));
    }

    private void loadNorthAmerica(){
        countriesList = new ArrayList<>();
        countriesList.add(new Country("United States", "Washington", "https://img.freepik.com/free-vector/illustration-usa-flag_53876-18165.jpg"));
        countriesList.add(new Country("Canada", "Ottawa", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/240px-Flag_of_Canada_%28Pantone%29.svg.png"));
        countriesList.add(new Country("Cuba", "Havana", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/1024px-Flag_of_Cuba.svg.png"));
        countriesList.add(new Country("Denmark", "Nuuk", "https://thumbs.dreamstime.com/b/denmark-paper-flag-patriotic-background-national-138241023.jpg"));
        countriesList.add(new Country("Mexico", "Mexico city", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/240px-Flag_of_Mexico.svg.png"));
    }

    private void loadSouthAmerica(){
        countriesList = new ArrayList<>();
        countriesList.add(new Country("Brazil", "Brasilia", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/1200px-Flag_of_Brazil.svg.png?20230130104947"));
        countriesList.add(new Country("Colombia", "Bogota", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/2560px-Flag_of_Colombia.svg.png"));
        countriesList.add(new Country("Argentina", "Buenos Aires", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/240px-Flag_of_Argentina.svg.png"));
        countriesList.add(new Country("Chile", "Santiago", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/240px-Flag_of_Chile.svg.png"));
        countriesList.add(new Country("Peru", "Lima", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/240px-Flag_of_Peru_%28state%29.svg.png"));
    }

    private void loadAustralia(){
        countriesList = new ArrayList<>();
        countriesList.add(new Country("Australia", "Canberra", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/240px-Flag_of_Australia_%28converted%29.svg.png"));
        countriesList.add(new Country("Fiji", "Suva", "https://cdn.britannica.com/86/3286-004-ADA8C1B4/Flag-Fiji.jpg"));
        countriesList.add(new Country("New Zealand", "Wellington", "https://www.viiisvaa.net/?_=%2Fwikipedia%2Fcommons%2Fthumb%2F3%2F3e%2FFlag_of_New_Zealand.svg%2F800px-Flag_of_New_Zealand.svg.png%23KJWqMZBBlEP7J%2BIUVFP3joD8dYRkEl7vpPE3"));
        countriesList.add(new Country("Nauru", "Yaren", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Flag_of_Nauru.svg/2560px-Flag_of_Nauru.svg.png"));
        countriesList.add(new Country("Kiribati", "Tarawa", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Kiribati_National_Flag.jpg/1200px-Kiribati_National_Flag.jpg"));

    }
    private void loadEurope(){
        countriesList = new ArrayList<>();
        countriesList.add(new Country("United Kingdom", "London", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_the_United_Kingdom_%283-5%29.svg/240px-Flag_of_the_United_Kingdom_%283-5%29.svg.pnghttps://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/240px-Flag_of_Australia_%28converted%29.svg.png"));
        countriesList.add(new Country("Germany", "Berlin", "https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/188px-Flag_of_Germany.svg.png"));
        countriesList.add(new Country("France", "Paris", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg/240px-Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg.png"));
        countriesList.add(new Country("Spain", "Madrid", "https://media.istockphoto.com/id/967321166/vector/vector-flag-of-spain-proportion-2-3-spanish-national-bicolor-flag-rojigualda.jpg?s=612x612&w=0&k=20&c=FK8YG5rnLACfcXLzhpdCqwxUFySs5mojqPqQG15sBc0="));
        countriesList.add(new Country("Italy", "Rome", "https://img.freepik.com/free-vector/illustration-italy-flag_53876-27098.jpg"));
    }


}