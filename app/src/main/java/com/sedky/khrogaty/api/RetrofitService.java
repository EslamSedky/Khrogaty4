package com.sedky.khrogaty.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {


    public static Retrofit getInstance(){

        return new Retrofit.Builder()
                .baseUrl("http://reactnative.website")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
