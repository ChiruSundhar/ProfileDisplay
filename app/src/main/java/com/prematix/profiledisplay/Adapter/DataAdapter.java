package com.prematix.profiledisplay.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prematix.profiledisplay.Bean.JSONResponse;
import com.prematix.profiledisplay.R;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {


    JSONResponse getresponce;

    public DataAdapter(JSONResponse getresponce) {
        this.getresponce = getresponce;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {


        holder.fullName.setText(getresponce.getResponse().get(position).getFullName());
        holder.aadharNo.setText(getresponce.getResponse().get(position).getAadharNo());
        holder.email.setText(getresponce.getResponse().get(position).getEmail());
        holder.permanentState.setText(getresponce.getResponse().get(position).getPermanentCity());
        holder.maritalStatus.setText(getresponce.getResponse().get(position).getPermanentPincode());
        holder.permanentPincode.setText(getresponce.getResponse().get(position).getPermanentState());
        holder.mobileNumber.setText(getresponce.getResponse().get(position).getMobileNumber());
        holder.permanentAddress.setText(getresponce.getResponse().get(position).getPermanentAddress());
        holder.gender.setText(getresponce.getResponse().get(position).getGender());
        holder.permanentCity.setText(getresponce.getResponse().get(position).getMaritalStatus());
//        holder.password.setText(getresponce.getResponse().get(position).getPassword());
//        int value = android.get(position).getDob();
//        Log.d("dobValue", String.valueOf(value));
//        String dobValue = Integer.toString(value);
//
//        holder.dob.setText(dobValue);
        holder.currPincode.setText(getresponce.getResponse().get(position).getCurrPincode());
        holder.currCity.setText(getresponce.getResponse().get(position).getCurrCity());
        holder.currState.setText(getresponce.getResponse().get(position).getCurrState());
        holder.CurrAddress.setText(getresponce.getResponse().get(position).getCurrAddress());
        holder.existingLoans.setText(getresponce.getResponse().get(position).getExistingLoans());
        holder.panNumber.setText(getresponce.getResponse().get(position).getPanNumber());

    }

    @Override
    public int getItemCount() {
        return getresponce.getResponse().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        private TextView fullName;
        private TextView email;
        private TextView mobileNumber;
        private TextView password;
        private TextView gender;
        private TextView maritalStatus;
        private TextView dob;
        private TextView permanentAddress;
        private TextView permanentState;
        private TextView permanentCity;
        private TextView permanentPincode;
        private TextView currState;
        private TextView currCity;
        private TextView currPincode;
        private TextView aadharNo;
        private TextView CurrAddress;
        private TextView existingLoans;
        private TextView panNumber;

        public ViewHolder(View itemView) {
            super(itemView);

            fullName = itemView.findViewById(R.id.full_name);
//            Log.d(TAG, "ViewHolder: "+fullName);
            aadharNo = itemView.findViewById(R.id.aadhaar);
            email = itemView.findViewById(R.id.email);
            permanentState = itemView.findViewById(R.id.permanent_state);
            maritalStatus = itemView.findViewById(R.id.martial_status);
            permanentPincode = itemView.findViewById(R.id.permanent_pincode);
            mobileNumber = itemView.findViewById(R.id.mobile_number);
            permanentAddress = itemView.findViewById(R.id.permanent_address);
            gender = itemView.findViewById(R.id.gender);
            permanentCity = itemView.findViewById(R.id.permanent_city);
            password = itemView.findViewById(R.id.pass_word);
            dob = itemView.findViewById(R.id.dob);
            currState = itemView.findViewById(R.id.cur_state);
            currCity = itemView.findViewById(R.id.cur_city);
            currPincode = itemView.findViewById(R.id.cur_pincode);
            CurrAddress = itemView.findViewById(R.id.curr_address);
            existingLoans = itemView.findViewById(R.id.loan);
            panNumber = itemView.findViewById(R.id.pan);

        }
    }
}