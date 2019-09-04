package com.prematix.profiledisplay.Activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.prematix.profiledisplay.Adapter.DataAdapter;
import com.prematix.profiledisplay.Adapter.DocAdapter;
import com.prematix.profiledisplay.Adapter.EmployeeAdapter;
import com.prematix.profiledisplay.Api.ClientProfile;
import com.prematix.profiledisplay.Bean.JSONResponse;
import com.prematix.profiledisplay.Api.RequestInterface;
import com.prematix.profiledisplay.Bean.Response;
import com.prematix.profiledisplay.R;

import java.util.ArrayList;
import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;


public class MainActivity extends AppCompatActivity {

ImageView photo_image;
    ImageButton contact_btn;
    ImageButton employee_btn;
    ImageButton doc_btn;
    private RecyclerView recyclerView;
    private ArrayList<Response> data;
    private DataAdapter dataAdapter;
    private EmployeeAdapter employeeAdapter;
    private DocAdapter docAdapter;
    private View view;
    public Context mcontext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        photo_image = findViewById(R.id.photo_image);
        recyclerView =findViewById(R.id.card_recycler_view);
        contact_btn=findViewById(R.id.contactbtn);
        employee_btn=findViewById(R.id.employbtn);
        doc_btn=findViewById(R.id.docbtn);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Contact();
            }
        });
        employee_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Employee();

            }
        });
        doc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Document();
            }
        });
      }

    private void Contact() {
        RequestInterface request = ClientProfile.getRetrofitInstance().create(RequestInterface.class);
        Call<JSONResponse> call = request.getJSON();
        call.enqueue(new Callback<JSONResponse>() {

            @Override
            public void onResponse(Call<JSONResponse> call, retrofit2.Response<JSONResponse> response) {
                JSONResponse jsonResponse = response.body();
                assert jsonResponse != null;
                dataAdapter = new DataAdapter( jsonResponse);
                recyclerView.setAdapter(dataAdapter);
            }

            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("Error", Objects.requireNonNull(t.getMessage()));
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }

    private void Employee() {
        RequestInterface request = ClientProfile.getRetrofitInstance().create(RequestInterface.class);
        Call<JSONResponse> call = request.getJSON();
        call.enqueue(new Callback<JSONResponse>() {

            @Override
            public void onResponse(Call<JSONResponse> call, retrofit2.Response<JSONResponse> response) {
                JSONResponse jsonResponse = response.body();
                assert jsonResponse != null;
                employeeAdapter = new EmployeeAdapter( jsonResponse);
//                data = new ArrayList<>(Arrays.asList(jsonResponse.getResponse()));
//                employeeAdapter = new EmployeeAdapter(data);
                recyclerView.setAdapter(employeeAdapter);
            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Document() {
        RequestInterface request = ClientProfile.getRetrofitInstance().create(RequestInterface.class);
        Call<JSONResponse> call = request.getJSON();
        call.enqueue(new Callback<JSONResponse>() {

            @Override
            public void onResponse(Call<JSONResponse> call, retrofit2.Response<JSONResponse> response) {
                JSONResponse jsonResponse = response.body();
                docAdapter = new DocAdapter( jsonResponse, mcontext);
                recyclerView.setAdapter(docAdapter);
            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }

}