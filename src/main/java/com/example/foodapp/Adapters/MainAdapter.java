package com.example.foodapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.Detailactivity;
import com.example.foodapp.Models.MainModel;
import com.example.foodapp.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder> {

    ArrayList<MainModel>list;
    Context context;

    public MainAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_mainfood,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
     final MainModel model=list.get(position);
     holder.foodimage.setImageResource(model.getImage());
     holder.mainName.setText(model.getName());
     holder.price.setText(model.getPrice());
     holder.description.setText(model.getDescription());
     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent=new Intent(context, Detailactivity.class);
             intent.putExtra("image",model.getImage());
             intent.putExtra("price",model.getPrice());
             intent.putExtra("desc",model.getDescription());
             intent.putExtra("Name",model.getName());
             context.startActivity(intent);

         }
     });

    }

    @Override
    public int getItemCount() {
       return list.size();
    }
    public class viewholder extends RecyclerView.ViewHolder {
        ImageView foodimage;
        TextView mainName,price,description;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            foodimage=itemView.findViewById(R.id.orderimg);
            mainName=itemView.findViewById(R.id.FoodName);
            price=itemView.findViewById(R.id.price1);
            description=itemView.findViewById(R.id.desc);

        }


    }

}
