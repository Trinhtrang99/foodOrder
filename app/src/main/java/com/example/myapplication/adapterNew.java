package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterNew extends RecyclerView.Adapter<adapterNew.Viewhoder> {
    Order order = new Order();


    public adapterNew(List<Contect> contectList) {
        this.order.contectslistNew = contectList;
    }



    @NonNull
    @Override
    public adapterNew.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_your_order, parent, false);
        Viewhoder viewhoder = new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapterNew.Viewhoder holder, int position) {
        Contect contect = order.contectslistNew.get(position);
        holder.tvName.setText(contect.getName());
        holder.img.setImageResource(contect.getImg());
        holder.tvsoLuong.setText(contect.getSoluong() + "");
    }


    @Override
    public int getItemCount() {
        return order.contectslistNew.size();

    }



    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvName, tvsoLuong;
        ImageView img;

        public Viewhoder(@NonNull View itemView) {
            super(itemView);
            tvName = (itemView).findViewById(R.id.tvName);
            img = (itemView).findViewById(R.id.image);
            tvsoLuong = (itemView).findViewById(R.id.soLuong);
        }
    }
}
