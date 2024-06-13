package com.example.foodapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.Models.OrdersModel;
import com.example.foodapp.R;

import java.util.ArrayList;

public class Ordersadapter extends RecyclerView.Adapter<Ordersadapter.viewholder>{
    ArrayList<OrdersModel>list;
    Context context;

    public Ordersadapter(ArrayList<OrdersModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.order_sample,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final OrdersModel model=list.get(position);
        holder.orderimage.setImageResource(model.getOrderimage());
        holder.ordername.setText(model.getOrdername());
        holder.orderprice.setText(model.getOrderprice());
        holder.ordernumber.setText(model.getOrdernumber());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView orderimage;
        TextView ordername, orderprice, ordernumber;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            orderimage=itemView.findViewById(R.id.soldimg);
            ordername=itemView.findViewById(R.id.orderName);
            orderprice=itemView.findViewById(R.id.orderprice);
            ordernumber=itemView.findViewById(R.id.orderimg);
            }

    }
}
