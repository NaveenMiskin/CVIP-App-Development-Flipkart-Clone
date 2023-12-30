package com.example.flipkart_clone_2.Adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flipkart_clone_2.Model.MainModel2;
import com.example.flipkart_clone_2.R;

import java.util.ArrayList;

public class MainAdapter2 extends  RecyclerView.Adapter<MainAdapter2.ViewHolder> {


    ArrayList<MainModel2> mainModels2;
    Context context;

    OnItemClickNew onItemClick;


    public MainAdapter2(Context context, ArrayList<MainModel2> mainModels2, OnItemClickNew onItemClick) {
        this.context = context;
        this.mainModels2 = mainModels2;
        this.onItemClick = onItemClick;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item2, parent, false);
        return new ViewHolder(view);

    }

    public interface OnItemClickNew{
        void onClickNew(int position );

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageView2.setImageResource(mainModels2.get(position).getLangLogos());    // LANG LOGOS?
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClickNew(position);
            }
        });
    }
    @Override
    public int getItemCount() {
        return mainModels2.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView2;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.image_view2);
        }
    }
}
