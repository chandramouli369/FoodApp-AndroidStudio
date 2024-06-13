package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.foodapp.Adapters.MainAdapter;
import com.example.foodapp.Models.MainModel;
import com.example.foodapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ActivityMainBinding binding;
  // RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
      //  recyclerview= findViewById(R.id.recyclerview);
        ArrayList<MainModel> list= new ArrayList<>();

        list.add(new MainModel(R.drawable.burger, "Burger","$ 110","Chicken Bugger with Extra cheese in tomato flavour"));
        list.add(new MainModel(R.drawable.pizza, "Pizza","$ 150","Hot spicy pizza with Extra cheese in tomato flavour"));
        list.add(new MainModel(R.drawable.biryani, "Biryani","$ 120","Hot spicy Biryani with Chicken pieces and added masala"));
        list.add(new MainModel(R.drawable.meals, "Meals","$ 80","Traditional Meals with two curries, curd and sweet"));
        list.add(new MainModel(R.drawable.noodles, "Noodles","$ 70","Spicy and tasty Egg noodles with added ingredients"));
        MainAdapter adapter=new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }
}