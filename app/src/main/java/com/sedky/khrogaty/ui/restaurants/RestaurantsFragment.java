package com.sedky.khrogaty.ui.restaurants;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.sedky.khrogaty.R;
import com.sedky.khrogaty.adapter.PagerAdapter;

public class RestaurantsFragment extends Fragment {

    private RestaurantsViewModel mViewModel;

    public static RestaurantsFragment newInstance() {
        return new RestaurantsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.restaurants_fragment, container, false);

//        Toolbar toolbar =  root.findViewById(R.id.toolbar);
//        TabLayout tabLayout =  root.findViewById(R.id.tabs);
//        tabLayout.addTab(tabLayout.newTab().setText("All"));
//        tabLayout.addTab(tabLayout.newTab().setText("Restaurants"));
//        tabLayout.addTab(tabLayout.newTab().setText("Coffee Shops"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//        ViewPager viewPager = root.findViewById(R.id.pager);
//        PagerAdapter adapter = new PagerAdapter
//                (getFragmentManager());
//        viewPager.setAdapter(adapter);
//        tabLayout.setupWithViewPager(viewPager);
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//            }
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//            }
//        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RestaurantsViewModel.class);
        // TODO: Use the ViewModel
    }

}
