package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class fragment extends AppCompatActivity {
Button bt1 , bt2;
FrameLayout flagment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        bt1 = findViewById(R.id.home);
        bt2  = findViewById(R.id.imgGioHang);
        getFragmet(OrderFragment.newInstace());
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmet(OrderFragment.newInstace());
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmet(DetailOrderFragment.newInstace());
            }
        });
    }

public void getFragmet(Fragment fragment)
{
    try {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flagment, fragment).commit();

    } catch (Exception e) {
        e.printStackTrace();
        Log.d("getFragment: ", "" + e.getMessage());
    }
}
}