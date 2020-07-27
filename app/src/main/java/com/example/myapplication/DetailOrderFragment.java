package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;


import com.example.myapplication.databinding.DetailOrderBinding;

public class DetailOrderFragment extends Fragment {
DetailOrderBinding detailOrderBinding;
    public static DetailOrderFragment newInstace()
    {
        Bundle bundle = new Bundle();
        DetailOrderFragment detailOrderFragment = new DetailOrderFragment();
        detailOrderFragment.setArguments(bundle);
        return detailOrderFragment;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        detailOrderBinding = DataBindingUtil.inflate(inflater,R.layout.detail_order,container,false);


        return detailOrderBinding.getRoot();
    }
}
