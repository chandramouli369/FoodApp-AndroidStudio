package com.example.foodapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodapp.databinding.ActivityDetailBinding;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;


public class Detailactivity extends AppCompatActivity {
    ActivityDetailBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int image=getIntent().getIntExtra("image",0);
        String price=getIntent().getStringExtra("price");
        String name=getIntent().getStringExtra("Name");
        String desc=getIntent().getStringExtra("desc");
        binding.detailimage.setImageResource(image);
        binding.pricelbl.setText(price);
        binding.Namebox.setText(name);
        binding.detaildesc.setText(desc);

        final DBHelper helper = new DBHelper(this);
        binding.insertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              helper.insertOrders(binding.nameBox.getText().toString(),binding.phoneBox.getText().toString(),price,image,name,desc,
                      Integer.parseInt(binding.quantity.getText().toString)
                );
            }
        });


    }
}
