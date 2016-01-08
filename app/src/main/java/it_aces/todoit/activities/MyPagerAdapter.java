package it_aces.todoit.activities;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Rialzista on 26.07.2015.
 */
class MyPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;

    public MyPagerAdapter(FragmentManager fm, @NonNull List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public Fragment getItem(int position) {
        return (Fragment)this.fragments.get(position);
    }

    public int getCount() {
        return this.fragments.size();
    }

    @NonNull
    public List<Fragment> getFragments() {
        return this.fragments;
    }
}
