package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class detailOrder extends AppCompatActivity {

    Order order = new Order();
    RecyclerView recyclerView;
    TextView t;

    int count = 0;


    public int getCount() {
        return count;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_order);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        recyclerView = findViewById(R.id.rcView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        t = findViewById(R.id.tvtong);

        recyclerView.setLayoutManager(layoutManager);

        adapterNew adapterNew = new adapterNew(order.contectslistNew);
for(int i = 0 ; i<order.contectslistNew.size();i++)
{
    for(int k = i+1; k<order.contectslistNew.size();k++)
    {
        if(order.contectslistNew.get(k).getName().equals(order.contectslistNew.get(i).getName())==true)
        {
            order.contectslistNew.remove(k);
            k--;
        }
    }
}



        recyclerView.setAdapter(adapterNew);

        Bundle bundle = getIntent().getExtras();
        String tongtien = bundle.getString("tongTien");
        t.setText(tongtien);



    }
}