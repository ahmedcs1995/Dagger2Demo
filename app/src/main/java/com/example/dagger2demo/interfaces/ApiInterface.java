package com.example.dagger2demo.interfaces;

import com.example.dagger2demo.Modal.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface ApiInterface {

    @GET("photos")
    Call<List<RetroPhoto>> getAllPhotos();
}