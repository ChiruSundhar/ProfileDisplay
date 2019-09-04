package com.prematix.profiledisplay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DocAdapter extends RecyclerView.Adapter<DocAdapter.ViewHolder> {

    private ArrayList<Response> android;
    Context context;

    DocAdapter(ArrayList<Response> android) {
        this.android = android;
    }

    @NonNull
    @Override
    public DocAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.doc, parent, false);
        return new DocAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DocAdapter.ViewHolder holder, int position) {
//        Glide
//                .with(context)
//                .load(android.get(position).getPhoto())
//                .into(holder.photo_image);


    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView photo_image;


        public ViewHolder(View itemView) {
            super(itemView);
            photo_image = itemView.findViewById(R.id.photo_image);

        }
    }
}