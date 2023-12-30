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
import com.example.flipkart_clone_2.Model.MainModel;
import com.example.flipkart_clone_2.R;
import java.util.ArrayList;

public class MainAdapter extends  RecyclerView.Adapter<MainAdapter.ViewHolder> {

    ArrayList<MainModel> mainModels;
    Context context;
    OnItemClick onItemClick;

    public MainAdapter(Context context, ArrayList<MainModel> mainModels, OnItemClick onItemClick) {
        this.context = context;
        this.mainModels = mainModels;
        this.onItemClick = onItemClick;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);
        return new ViewHolder(view);
    }

     public interface OnItemClick{
         void onClick(int position );
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(mainModels.get(position).getLangLogo());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    onItemClick.onClick(position);

                }
            });

    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}
