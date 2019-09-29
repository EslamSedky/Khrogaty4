package com.sedky.khrogaty.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.sedky.khrogaty.model.Restaurant;
import com.sedky.khrogaty.persistence.RepositoryRestaurant;

public class HomeViewModel extends ViewModel {


    RepositoryRestaurant repository;
    private MutableLiveData<Restaurant> data;

    public void init(){

        if(repository !=null){
            return;
        }
        repository = RepositoryRestaurant.getInstance();
        data = repository.getData("3");
    }

    public LiveData<Restaurant> getData(){
        return data;
    }
}