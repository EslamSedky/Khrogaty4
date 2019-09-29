package com.sedky.khrogaty.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.sedky.khrogaty.ui.restaurants.tabs.All;
import com.sedky.khrogaty.ui.restaurants.tabs.CoffeeShopOnly;
import com.sedky.khrogaty.ui.restaurants.tabs.RestaurantOnly;


public class PagerAdapter extends FragmentStatePagerAdapter {


    private int  numTabs;
    Fragment[] frags = {new All() , new RestaurantOnly() , new CoffeeShopOnly() };
    String titles[] = {"All" , "Restaurants" , "Coffee Shop"};

    public PagerAdapter(FragmentManager fm) {
        super(fm);

        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int i) {

//        switch (i){
//
//            case 0:
//                All tab1 = new All();
//                return tab1;
//            case 1:
//                RestaurantOnly tab2 = new RestaurantOnly();
//                return tab2;
//            case 2:
//                CoffeeShopOnly tab3 = new CoffeeShopOnly();
//                return tab3;
//            default:
//                return null;
//        }

        return frags[i];

    }

    @Override
    public int getCount() {
        return frags.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
