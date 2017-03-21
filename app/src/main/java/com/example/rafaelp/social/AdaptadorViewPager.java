package com.example.rafaelp.social;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Rafael p on 17/3/2017.
 */

public class AdaptadorViewPager extends FragmentPagerAdapter {
    ArrayList<Fragment>fragments;

    public AdaptadorViewPager(FragmentManager fm,ArrayList<Fragment>fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
       return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
