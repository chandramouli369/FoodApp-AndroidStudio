package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodapp.Adapters.Ordersadapter;
import com.example.foodapp.Models.OrdersModel;
import com.example.foodapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class Orderactivity extends AppCompatActivity {
    ActivityOrderBinding binding;

   // RecyclerView ordersrecyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // ordersrecyclerview=findViewById(R.id.ordersrecyclerview);
        binding= ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //  recyclerview= findViewById(R.id.recyclerview);
        ArrayList<OrdersModel> list= new ArrayList<>();

        list.add(new OrdersModel(R.drawable.burger, "Burger","$ 110","Chicken Bugger with Extra cheese"));
        list.add(new OrdersModel(R.drawable.pizza, "Pizza","$ 150","Hot spicy pizza with Extra cheese"));
        list.add(new OrdersModel(R.drawable.biryani, "Biryani","$ 120","Hot spicy Biryani with Chicken pieces"));
        list.add(new OrdersModel(R.drawable.meals, "Meals","$ 80","Traditional Meals with two curries, curd and sweet"));
        list.add(new OrdersModel(R.drawable.noodles, "Noodles","$ 70","Spicy and tasty Egg noodles"));
        Ordersadapter adapter=new Ordersadapter(list,this);
        binding.ordersrecyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.ordersrecyclerview.setLayoutManager(layoutManager);
    }
}