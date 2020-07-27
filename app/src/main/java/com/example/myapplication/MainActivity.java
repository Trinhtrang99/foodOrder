package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btDangNhap;
    EditText edtPass,edtUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        btDangNhap=findViewById(R.id.btDangnhap);
        edtPass=findViewById(R.id.edtPword);
        edtUser = findViewById(R.id.edtUser);
        final checkLogin checkLogin = new checkLogin();

        btDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkLogin.check(edtPass.getText().toString())==true &&

                        edtUser.getText().toString().length()!=0 &&
                        edtPass.getText().toString().length()>=8) {
                       Toast.makeText(MainActivity.this,"Đăng nhập thành công",Toast.LENGTH_SHORT).show();

                    Intent intent1 = new Intent(MainActivity.this,Order.class);
                    startActivity(intent1);
                }
                else {
                    Toast.makeText(MainActivity.this,"Đăng nhập không thành công",Toast.LENGTH_SHORT).show();
                    edtPass.setText("");
                }
            }
        });
    }


}