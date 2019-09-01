package com.example.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.dagger2demo.Modal.RetroPhoto;
import com.example.dagger2demo.component.AppComponent;
import com.example.dagger2demo.component.DaggerAppComponent;
import com.example.dagger2demo.interfaces.ApiInterface;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();

    }

    private void initComponent(){
        AppComponent appComponent = DaggerAppComponent.builder().build();

        apiInterface = appComponent.getApiService();

        getRestApiData();
    }


    private void getRestApiData(){
        apiInterface.getAllPhotos().enqueue(new Callback<List<RetroPhoto>>() {
            @Override
            public void onResponse(Call<List<RetroPhoto>> call, Response<List<RetroPhoto>> response) {
                Log.e("onResponse","Yes" );
            }

            @Override
            public void onFailure(Call<List<RetroPhoto>> call, Throwable t) {
                Log.e("onFailure","Yes");
            }
        });
    }


}
