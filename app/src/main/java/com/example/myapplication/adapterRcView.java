package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterRcView extends RecyclerView.Adapter<adapterRcView.Viewhoder> {

    List<Contect> contectList;
    onclick onclickItem;

    int i;
    int count = 0;


    public void setOnclickItem(onclick onclickItem) {
        this.onclickItem = onclickItem;
    }

    public adapterRcView(List<Contect> contectList) {

        this.contectList = contectList;
    }

    @NonNull
    @Override
    public adapterRcView.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_rcview, parent, false);
        Viewhoder viewhoder = new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull final adapterRcView.Viewhoder holder, int position) {

        final Contect contect = contectList.get(position);
        holder.tvName.setText(contect.getName());
        holder.tvPrice.setText(contect.getGia());
        holder.img.setImageResource(contect.getImg());
        holder.add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                contect.setSoluong(count);
                onclickItem.click(contect);

            }
        });
    }

    @Override
    public int getItemCount() {
        return contectList.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvName, tvPrice;
        ImageView add;


        public Viewhoder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvGia);
            img = itemView.findViewById(R.id.image);
            add = itemView.findViewById(R.id.btadd);

        }
    }
}
