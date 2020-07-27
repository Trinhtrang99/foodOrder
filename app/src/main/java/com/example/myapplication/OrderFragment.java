package com.example.myapplication;

import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.OrderBinding;


public class OrderFragment extends Fragment {
    OrderBinding orderBinding;
    Button bt1, bt2;

    public static OrderFragment newInstace() {
        Bundle bundle = new Bundle();
        OrderFragment orderFragment = new OrderFragment();
        orderFragment.setArguments(bundle);
        return orderFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        orderBinding = DataBindingUtil.inflate(inflater, R.layout.activity_order, container, false);

        return orderBinding.getRoot();
    }
}
