package com.example.myapplication;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;

public class Contect {
    int img;
    String name;
    String gia;
    int soluong;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contect contect = (Contect) o;
        return name.equals(contect.name);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Contect() {
    }

    public Contect(int img, String name, String gia) {
        this.img = img;
        this.name = name;
        this.gia = gia;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
