package com.sedky.khrogaty.api;

import com.sedky.khrogaty.model.Restaurant;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestaurantAPI {

    @GET("/iti/wp-json/wp/v2/posts")
    Call<Restaurant> getRestaurant(@Query("categories") String categories);
}
