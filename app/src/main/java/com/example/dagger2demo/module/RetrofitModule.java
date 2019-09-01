package com.example.dagger2demo.module;

import com.example.dagger2demo.interfaces.ApiInterface;
import com.example.dagger2demo.interfaces.ApplicationScope;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetrofitModule {

    @Provides
    public ApiInterface retrofitApi(Retrofit retrofit){
        return retrofit.create(ApiInterface.class);
    }

    @ApplicationScope
    @Provides
    public Retrofit retrofit(GsonConverterFactory gsonConverterFactory, Gson gson){
        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Provides
    public Gson gson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
    public GsonConverterFactory gsonConverterFactory(Gson gson){
        return GsonConverterFactory.create(gson);
    }


}
