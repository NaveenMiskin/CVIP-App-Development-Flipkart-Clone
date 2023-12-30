package com.example.flipkart_clone_2.BottomNavFragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.flipkart_clone_2.AccountSection.accountOrder;
import com.example.flipkart_clone_2.AccountSection.account_Coupon;
import com.example.flipkart_clone_2.AccountSection.account_naveen;
import com.example.flipkart_clone_2.AccountSection.account_Wishlist;
import com.example.flipkart_clone_2.AccountSection.account_helpcenter;
import com.example.flipkart_clone_2.AccountSection.account_naveen;
import com.example.flipkart_clone_2.MainActivity;
import com.example.flipkart_clone_2.R;
import com.example.flipkart_clone_2.AccountSection.account_Address;
import com.example.flipkart_clone_2.AccountSection.account_Cards;
import com.example.flipkart_clone_2.AccountSection.account_Languages;
import com.example.flipkart_clone_2.AccountSection.account_LogOut;
import com.example.flipkart_clone_2.AccountSection.account_QuesAndAns;
import com.example.flipkart_clone_2.AccountSection.account_Reviews;
import com.example.flipkart_clone_2.AccountSection.account_TermsANdPolicies;
import com.example.flipkart_clone_2.AccountSection.account_browseFaqs;
import com.example.flipkart_clone_2.AccountSection.account_creatorStudio;
import com.example.flipkart_clone_2.AccountSection.account_creditCard;
import com.example.flipkart_clone_2.AccountSection.account_editProfile;
import com.example.flipkart_clone_2.AccountSection.account_flipkartplus;
import com.example.flipkart_clone_2.AccountSection.account_paylater;
import com.example.flipkart_clone_2.AccountSection.account_sell;

public class EFragment extends Fragment {

    public EFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.account_e, container, false);
    }


        @Override
        public void onViewCreated( View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
//            TextView accountOrder = view.findViewById(R.id.accountOrder);
//            accountOrder.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    ((MainActivity)getActivity()).loadFrag(new accountOrder(), false);   //change
//                }
//            });




            TextView joinflipkartplus = view.findViewById(R.id.joinfipkartplus);
            joinflipkartplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_naveen(), false);
                }
            });

//            TextView accountWishlist = view.findViewById(R.id.accountWishlist);
//            accountWishlist.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    ((MainActivity)getActivity()).loadFrag(new account_Wishlist(), false);// change
//                }
//            });
//
//
//
//            TextView accountCoupon = view.findViewById(R.id.accountcoupon);
//            accountCoupon.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    ((MainActivity)getActivity()).loadFrag(new account_Coupon(), false);
//                }
//            });
//
//
//            TextView accounthelpCenter = view.findViewById(R.id.accounthelpCenter);
//            accounthelpCenter.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    ((MainActivity)getActivity()).loadFrag(new account_helpcenter(), false);  //change i made
//                }
//            });


            TextView payLater = view.findViewById(R.id.payLater);
            payLater.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_paylater(), false);
                }
            });




            TextView creditCard = view.findViewById(R.id.creditCard);
            creditCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_creditCard(), false);
                }
            });



            TextView flipkartPlus = view.findViewById(R.id.flipkartPlus);
            flipkartPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_flipkartplus(), false);
                }
            });


            TextView editProfile = view.findViewById(R.id.editProfile);
            editProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_editProfile(), false);
                }
            });

            TextView cardAndWallet = view.findViewById(R.id.cardAndWallet);
            cardAndWallet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_Cards(), false);
                }
            });


            TextView address = view.findViewById(R.id.address);
            address.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_Address(), false);
                }
            });

            TextView languages = view.findViewById(R.id.languages);
            languages.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_Languages(), false);
                }
            });




            TextView reviews = view.findViewById(R.id.reviews);
            reviews.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_Reviews(), false);
                }
            });


            TextView quesAndAns = view.findViewById(R.id.quesAndAns);
            quesAndAns.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_QuesAndAns(), false);
                }
            });



            TextView creatorStudio = view.findViewById(R.id.creatorStudio);
            creatorStudio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_creatorStudio(), false);
                }
            });



            TextView sell = view.findViewById(R.id.sell);
            sell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_sell(), false);
                }
            });



            TextView termsAndPolicies = view.findViewById(R.id.termsAndPolicies);
            termsAndPolicies.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_TermsANdPolicies(), false);
                }
            });


            TextView browseFaq = view.findViewById(R.id.browseFaq);
            browseFaq.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_browseFaqs(), false);
                }
            });


            TextView logOut = view.findViewById(R.id.logOut);
            logOut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((MainActivity)getActivity()).loadFrag(new account_LogOut(), false);
                }
            });



        }


    }
