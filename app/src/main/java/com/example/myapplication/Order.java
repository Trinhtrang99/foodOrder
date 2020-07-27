package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Order extends AppCompatActivity {
    List<Contect> contectList;
    int j = 0;
    List<Contect> list;
    int tongtien;
    RecyclerView recyclerView;
    Contect contect1, contect2, contect3, contect4, contect5;
    Button order;
    ImageView imageView;
    TextView tvsoluong, tvTong;
    public static List<Contect> contectslistNew = new ArrayList<>();

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        tvsoluong = findViewById(R.id.tvSoLuong1);
        contectList = new ArrayList<>();
        tvTong = findViewById(R.id.tvtong);


        recyclerView = findViewById(R.id.rcView);
        order = findViewById(R.id.btOrder);
        imageView = findViewById(R.id.imgGioHang);
        contect1 = new Contect(R.drawable.banhbonglan, "Banh bong lan", "12000");
        contect2 = new Contect(R.drawable.calamen, "Calamen", "24000");
        contect3 = new Contect(R.drawable.banhngot, "Banh ngot", "32000");
        contect4 = new Contect(R.drawable.crepe, "Banh Crepe", "12000");
        contect5 = new Contect(R.drawable.chesseake, "Banh Chesse", "12000");

        contectList.add(contect1);
        contectList.add(contect2);
        contectList.add(contect3);
        contectList.add(contect4);
        contectList.add(contect5);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        adapterRcView adapterRcview = new adapterRcView(contectList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterRcview);


        adapterRcview.setOnclickItem(new onclick() {
            @Override
            public void click(Contect contect) {

                j++;
                contectslistNew.add(contect);

                tongtien = Integer.parseInt(tvTong.getText() + "");
                tongtien += Integer.parseInt(contect.getGia());
                tvTong.setText(tongtien + "");
                tvsoluong.setText(j + "");
            }

        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Order.this, detailOrder.class);
                intent.putExtra("tongTien", tvTong.getText().toString());
            startActivity(intent);
            }
        });


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getBaseContext(), "Ban đã order thành công", Toast.LENGTH_LONG).show();
            }
        });

    }

//    public void getFragment(Fragment fragment) {
//        try {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.framelayout, fragment).commit();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            Log.d("getFragment: ", "" + e.getMessage());
//        }
//    }
}