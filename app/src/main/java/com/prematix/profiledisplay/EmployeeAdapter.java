package com.prematix.profiledisplay;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {

    private ArrayList<Response> android;

    EmployeeAdapter(ArrayList<Response> android) {
        this.android = android;
    }

    @NonNull
    @Override
    public EmployeeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employ, parent, false);
        return new EmployeeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.employeeCode.setText(android.get(position).getEmployeeCode());
        float net = android.get(position).getNetMonthlyIncome();
        String income = Float.toString(net);
        holder.netMonthlyIncome.setText(income);
        float expValue = android.get(position).getCurCompanyExperience();
                String test1 = Float.toString(expValue);
        holder.curCompanyExperience.setText(test1);
        float texpValue = android.get(position).getTotalExperience();
        String test2 = Float.toString(texpValue);
        holder.totalExperience.setText(test2);
        holder.occupation.setText(android.get(position).getOccupation());
        holder.employementType.setText(android.get(position).getEmployementType());

        holder.companyName.setText(android.get(position).getCompanyName());
        holder.companyAddress.setText(android.get(position).getCompanyAddress());
        holder.companyWebsite.setText(android.get(position).getCompanyWebsite());
        float turn =  android.get(position).getAnnTurnover();
        String over = Float.toString(turn);
//        Log.d("dobValue", over);

        holder.annTurnover.setText(over);


    }


    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView employeeCode;
        private TextView occupation;//Employee
        private TextView employementType;
        private TextView curCompanyExperience;
        private TextView totalExperience;
        private TextView netMonthlyIncome;

        //Buisness
        private TextView companyName;
        private TextView companyWebsite;
        private TextView companyAddress;
        private TextView annTurnover;

        public ViewHolder(View itemView) {
            super(itemView);

            employeeCode = itemView.findViewById(R.id.employee_code);
            totalExperience = itemView.findViewById(R.id.total_experiance);
            companyName = itemView.findViewById(R.id.company_name);
            employementType = itemView.findViewById(R.id.employement_type);
            annTurnover = itemView.findViewById(R.id.ann_turn_over);
            companyWebsite = itemView.findViewById(R.id.comapany_website);
            netMonthlyIncome = itemView.findViewById(R.id.monthly_income);
            companyAddress = itemView.findViewById(R.id.company_address);
//
            occupation = itemView.findViewById(R.id.occupation);
            curCompanyExperience = itemView.findViewById(R.id.cur_company_experiance);


        }
    }
}