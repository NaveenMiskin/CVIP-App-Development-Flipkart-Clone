package com.example.flipkart_clone_2.BottomNavFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flipkart_clone_2.TabView.CartAdapter;
import com.example.flipkart_clone_2.R;
import com.google.android.material.tabs.TabLayout;


public class DFragment extends Fragment {
    TabLayout tab;
    ViewPager viewPager;


    public DFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tab = view.findViewById(R.id.tab);
        viewPager = view.findViewById(R.id.viewPager);

        CartAdapter adapter = new CartAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.cart_d, container, false);
    }
}