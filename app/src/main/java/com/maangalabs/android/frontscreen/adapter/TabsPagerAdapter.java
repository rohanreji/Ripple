package com.maangalabs.android.frontscreen.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.maangalabs.android.frontscreen.FollowersFragment;
import com.maangalabs.android.frontscreen.NewsFeedFragment;
import com.maangalabs.android.frontscreen.TrendingFragment;

/**
 * Created by rohan on 7/2/15.
 */
public class TabsPagerAdapter  extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new NewsFeedFragment();
            case 1:
                // Games fragment activity
                return new TrendingFragment();
            case 2:
                // Movies fragment activity
                return new FollowersFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}