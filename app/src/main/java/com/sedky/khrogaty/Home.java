package com.sedky.khrogaty;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.sedky.khrogaty.ui.home.HomeFragment;
import com.sedky.khrogaty.ui.restaurants.RestaurantsFragment;
import com.sedky.khrogaty.ui.search.SearchFragment;

public class Home extends AppCompatActivity {

    private View decorView;
    Fragment selectedFragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        final FrameLayout frame = findViewById(R.id.frame);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navView, navController);





        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                
                int item = menuItem.getItemId();
                
                switch (item){
                    
                    case R.id.home :
                        Toast.makeText(Home.this, "home", Toast.LENGTH_SHORT).show();

                        addFragment(new HomeFragment());
                        return true;
                    case R.id.filter :
                        Toast.makeText(Home.this, "search", Toast.LENGTH_SHORT).show();
                        addFragment(new SearchFragment());
                        return true;
                    case R.id.find_places :
                        Toast.makeText(Home.this, "places", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.restaurant :
                        Toast.makeText(Home.this, "restaurant", Toast.LENGTH_SHORT).show();
                        addFragment(new RestaurantsFragment());
                        return true;
                    case R.id.things :
                        Toast.makeText(Home.this, "what", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });


        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int visibility) {

                decorView.setSystemUiVisibility(hideNavigationBar());
            }
        });
    }

    private void addFragment(Fragment fragment) {
        FrameLayout frame = findViewById(R.id.frame);
        if(frame != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame, fragment)
                    .commit();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        if(hasFocus){
            decorView.setSystemUiVisibility(hideNavigationBar());
        }
    }

    private int hideNavigationBar() {
        return View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LOW_PROFILE;
    }


}
