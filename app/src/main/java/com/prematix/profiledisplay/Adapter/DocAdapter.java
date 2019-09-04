package com.prematix.profiledisplay.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prematix.profiledisplay.Bean.JSONResponse;
import com.prematix.profiledisplay.R;
import com.squareup.picasso.Picasso;


public class DocAdapter extends RecyclerView.Adapter<DocAdapter.ViewHolder> {

    JSONResponse getresponce;
    private Context mcontext;

    public DocAdapter(JSONResponse getresponce, Context mcontext) {
        this.getresponce = getresponce;
        this.mcontext = mcontext;
    }


    @NonNull
    @Override
    public DocAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.doc,parent,false);
        return new DocAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(DocAdapter.ViewHolder holder, int position) {
        Picasso.get().load(getresponce.getResponse().get(position).getIdentityProof()).into(holder.identity);
        Picasso.get().load(getresponce.getResponse().get(position).getIdentityProof()).into(holder.bank);
        Picasso.get().load(getresponce.getResponse().get(position).getIdentityProof()).into(holder.property);
        Picasso.get().load(getresponce.getResponse().get(position).getIdentityProof()).into(holder.payslip);
        Picasso.get().load(getresponce.getResponse().get(position).getIdentityProof()).into(holder.photo_image);
    }

    @Override
    public int getItemCount() {
        return getresponce.getResponse().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView photo_image;
        ImageView payslip;
        ImageView property;
        ImageView bank;
        ImageView identity;

        public ViewHolder(View itemView) {
            super(itemView);
            photo_image = itemView.findViewById(R.id.photo_image);
            payslip = itemView.findViewById(R.id.salary_image);
            property = itemView.findViewById(R.id.property_image);
            bank = itemView.findViewById(R.id.bank_image);
            identity = itemView.findViewById(R.id.identity_image);
        }
    }
}