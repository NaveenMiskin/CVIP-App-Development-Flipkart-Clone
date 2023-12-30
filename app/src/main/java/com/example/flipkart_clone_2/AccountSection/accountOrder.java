package com.example.flipkart_clone_2.AccountSection;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flipkart_clone_2.R;

public class accountOrder extends Fragment {


    public accountOrder() {
        // Empty public constructor implemented
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_account_order, container, false);
    }
}