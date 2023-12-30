package com.example.flipkart_clone_2.TabView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CartAdapter extends FragmentPagerAdapter {

    public CartAdapter( FragmentManager fm) {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new cart_Flipkart();

        } else if (position == 1) {
            return new cart_gGrocery();
        } else {
            return new cart_Quick();
        }

    }

    @Override
    public int getCount() {
        return 3;

    }
    @Override
    public CharSequence getPageTitle(int position) {
       if(position == 0){

           return "Flipkart";

       }else if(position == 1){

           return "Grocery";

       }else{

           return "Quick";

       }

    }
}
