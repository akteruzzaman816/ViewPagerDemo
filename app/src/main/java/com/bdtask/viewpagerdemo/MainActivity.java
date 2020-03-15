package com.bdtask.viewpagerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

/**
 *      created by AkterUzzaman
 *      3/15/2020
 */

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout   = findViewById(R.id.tablayout);
        viewPager   = findViewById(R.id.view_pager);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addfragment(new FirstFragment(),"First");
        viewPagerAdapter.addfragment(new SecondFragment(),"Second");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);







    }
}
