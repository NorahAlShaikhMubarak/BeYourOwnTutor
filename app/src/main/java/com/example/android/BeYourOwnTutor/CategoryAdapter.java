package com.example.android.BeYourOwnTutor;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by admin on 26-06-2016.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Objects", "Action", "Pronounce", "Behaviour"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new ObjectsFragment();
        } else if (position == 1){
            return new ActionFragment();
        } else if (position == 2) {
            return new PronunciationFragment();
        } else {
            return new BehaviourFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
