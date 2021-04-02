package com.example.animated_navigathion_bottom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.animated_navigathion_bottom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation navBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        navBottom = findViewById(R.id.nav_bottom);
        navBottom.add(new MeowBottomNavigation.Model(1, R.drawable.ic_baseline_home_24));
        navBottom.add(new MeowBottomNavigation.Model(2, R.drawable.ic_baseline_blur_on_24));
        navBottom.add(new MeowBottomNavigation.Model(3, R.drawable.ic_baseline_supervised_user_circle_24));
        navBottom.add(new MeowBottomNavigation.Model(4, R.drawable.ic_baseline_send_24));


        //  binding.navBottom.add(new MeowBottomNavigation.Model(1 , R.drawable.ic_baseline_home_24));
//  binding.navBottom.add(new MeowBottomNavigation.Model(2, R.drawable.ic_baseline_blur_on_24));
//  binding.navBottom.add(new MeowBottomNavigation.Model(3 , R.drawable.ic_baseline_supervised_user_circle_24));
//  binding.navBottom.add(new MeowBottomNavigation.Model(4 , R.drawable.ic_baseline_send_24));
    }
}