package com.example.safety2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.Instant;

public class listAdapter extends RecyclerView.Adapter<listAdapter.myHolder> {

    Context context;
    int rImage[];

    public listAdapter( Context c, int[] rImage) {
        this.rImage = rImage;
        this.context =c;

    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_single_row_item, parent,false);

        return new myHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder holder, int position) {

        holder.imageView.setImageResource(rImage[position]);

    }

    @Override
    public int getItemCount() {
        return rImage.length;
    }

    class myHolder extends RecyclerView.ViewHolder{
   ImageView imageView;
        public myHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        Intent intent = new Intent(context,rear_bear_hug.class);
                        context.startActivity(intent);
                }
            });
        }
    }
}
