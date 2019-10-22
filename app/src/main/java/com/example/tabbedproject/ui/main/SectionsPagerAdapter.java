package com.example.tabbedproject.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabbedproject.R;
import com.example.tabbedproject.Tab1Contacts;
import com.example.tabbedproject.Tab2Chat;
import com.example.tabbedproject.Tab3Online;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //returning the current tab
        switch (position){
            case 0:
                Tab1Contacts tab1 = new Tab1Contacts();
                return tab1;
            case 1:
                Tab2Chat tab2 = new Tab2Chat();
                return tab2;
            case 2:
                Tab3Online tab3 = new Tab3Online();
                return tab3;
            default: return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}