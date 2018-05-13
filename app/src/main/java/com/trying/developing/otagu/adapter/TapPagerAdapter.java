package com.trying.developing.otagu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.trying.developing.otagu.fragments.SignInFragment;
import com.trying.developing.otagu.fragments.SignUpFragment;

/**
 * Created by developing on 5/13/2018.
 */

public class TapPagerAdapter extends FragmentPagerAdapter {

    int mNumOfTabs;

    public TapPagerAdapter(FragmentManager fm,int NumberOfTabs) {
        super(fm);
        this.mNumOfTabs=NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                SignInFragment signin=new SignInFragment();
                return signin;
            case 1:
                SignUpFragment signup=new SignUpFragment();
                return signup;
            default:
                return null;

        }


    }

    @Override
    public int getCount() {
        return this.mNumOfTabs;
    }
}
