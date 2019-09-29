package com.sedky.khrogaty.persistence;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.sedky.khrogaty.api.RestaurantAPI;
import com.sedky.khrogaty.api.RetrofitService;
import com.sedky.khrogaty.model.Restaurant;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepositoryRestaurant {


    private RestaurantAPI api;
    private static RepositoryRestaurant repository;
    private MutableLiveData<Restaurant> data;

    public RepositoryRestaurant() {

        api = RetrofitService.getInstance().create(RestaurantAPI.class);
    }

    public static RepositoryRestaurant getInstance() {

        if (repository == null) {

            repository = new RepositoryRestaurant();
        }
        return repository;
    }


    public MutableLiveData<Restaurant> getData(String categories) {

        data = new MutableLiveData<>();

        api.getRestaurant(categories).enqueue(new Callback<Restaurant>() {
            @Override
            public void onResponse(Call<Restaurant> call, Response<Restaurant> response) {

                if (response.isSuccessful()) {

                    Log.i("RRRRRRR", "onResponse: " + response.message());
                    Log.i("RRRRRRR", "onResponse: " + response.body().getTitle().getRendered());
                    data.setValue(response.body());
                }
            }


            @Override
            public void onFailure(Call<Restaurant> call, Throwable t) {

                Log.i("RRRRRRR", "onFailure: " + t.getMessage());
//                data.setValue(null);

            }
        });

        return data;
    }
}
