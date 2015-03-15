package com.startup.junior.otherproject.Adapter;

/**
 * Created by Junior on 26/01/2015.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.startup.junior.otherproject.Fragments.ImageFragment;
import com.startup.junior.otherproject.R;
import com.viewpagerindicator.IconPagerAdapter;

public class CircleFragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
    //protected static final String[] IMAGES = new String[] { "This", "Is", "A", "Test", };
    public static final int[] IMAGES = new int[] {
            R.drawable.discoteca2,
            R.drawable.discoteca2,
            R.drawable.discoteca2,
            R.drawable.discoteca2
    };

    private int mCount = IMAGES.length;

    public CircleFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new ImageFragment(IMAGES[position]);
        //return TestFragment.newInstance(IMAGES[position % IMAGES.length]);
    }

    @Override
    public int getIconResId(int index) {
        return 0;
    }

    @Override
    public int getCount() {
        return mCount;
    }

    /* @Override
     public CharSequence getPageTitle(int position) {
       return TestFragmentAdapter.IMAGES[position % IMAGES.length];
     }

     @Override
     public int getIconResId(int index) {
       return ICONS[index % ICONS.length];
     }
     */
    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }
}