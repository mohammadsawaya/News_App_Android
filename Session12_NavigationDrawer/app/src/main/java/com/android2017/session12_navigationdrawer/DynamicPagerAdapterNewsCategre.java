package com.android2017.session12_navigationdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Mohammad on 28.10.2017.
 */

public class DynamicPagerAdapterNewsCategre extends FragmentStatePagerAdapter {
    List<String> categoreList;
    public DynamicPagerAdapterNewsCategre(FragmentManager fm, List<String> categoreList) {
        super(fm);
        this.categoreList=categoreList;
    }
//nomber of page .reterun the fragment for this page
    @Override
    public Fragment getItem(int position) {

        return NewsFragment.newInstance(categoreList.get(position));
    }

    //count of pages in (tabs)
    @Override
    public int getCount() {
                return categoreList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return categoreList.get(position);
    }


}
