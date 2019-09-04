package com.prematix.profiledisplay;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    ImageButton contact_btn;
    ImageButton employee_btn;
    ImageButton doc_btn;
    private RecyclerView recyclerView;
    private ArrayList<Response> data;
    private DataAdapter dataAdapter;
    private EmployeeAdapter employeeAdapter;
    private DocAdapter docAdapter;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.card_recycler_view);
        contact_btn=findViewById(R.id.contactbtn);
        employee_btn=findViewById(R.id.employbtn);
        doc_btn=findViewById(R.id.docbtn);



        contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initViews();
            }
        });
        employee_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initViews1();

            }
        });
        doc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initViews2();
            }
        });
      }
    private void initViews() {
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
    }

    private void loadJSON() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.47:5006/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface request = retrofit.create(RequestInterface.class);
        Call<JSONResponse> call = request.getJSON();
        call.enqueue(new Callback<JSONResponse>() {

            @Override
            public void onResponse(Call<JSONResponse> call, retrofit2.Response<JSONResponse> response) {
                JSONResponse jsonResponse = response.body();
                assert jsonResponse != null;
                data = new ArrayList<>(Arrays.asList(jsonResponse.getResponse()));
                dataAdapter = new DataAdapter(data);
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
    private void initViews1() {
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON1();
    }

    private void loadJSON1() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.47:5006/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface request = retrofit.create(RequestInterface.class);
        Call<JSONResponse> call = request.getJSON();
        call.enqueue(new Callback<JSONResponse>() {

            @Override
            public void onResponse(Call<JSONResponse> call, retrofit2.Response<JSONResponse> response) {
                JSONResponse jsonResponse = response.body();
                assert jsonResponse != null;
                data = new ArrayList<>(Arrays.asList(jsonResponse.getResponse()));
                employeeAdapter = new EmployeeAdapter(data);
                recyclerView.setAdapter(employeeAdapter);
            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }
    private void initViews2() {
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON2();
    }

    private void loadJSON2() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.47:5006/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface request = retrofit.create(RequestInterface.class);
        Call<JSONResponse> call = request.getJSON();
        call.enqueue(new Callback<JSONResponse>() {

            @Override
            public void onResponse(Call<JSONResponse> call, retrofit2.Response<JSONResponse> response) {
                JSONResponse jsonResponse = response.body();
                assert jsonResponse != null;
                data = new ArrayList<>(Arrays.asList(jsonResponse.getResponse()));
                docAdapter = new DocAdapter(data);
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