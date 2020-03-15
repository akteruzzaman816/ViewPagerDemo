package com.bdtask.viewpagerdemo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;


public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList=new ArrayList<Fragment>();
    private final List<String> nameList=new ArrayList<String>();


    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addfragment(Fragment f, String list){
        fragmentList.add(f);
        nameList.add(list);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return nameList.get(position);
    }





}
