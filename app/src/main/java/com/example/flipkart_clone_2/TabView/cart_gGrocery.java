package com.example.flipkart_clone_2.TabView;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.flipkart_clone_2.R;

public class cart_gGrocery extends Fragment {
    public cart_gGrocery() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cart_g_grocery, container, false);
    }
}