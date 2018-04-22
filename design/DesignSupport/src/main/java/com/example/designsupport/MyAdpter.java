package com.example.designsupport;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by cqian on 2018/4/13.
 */

public class MyAdpter extends FragmentPagerAdapter {
    private final List<String> mList;

    public MyAdpter(FragmentManager fm, List<String> list) {
        super(fm);
        this.mList = list;
    }

    @Override
    public Fragment getItem(int i) {
        return OneFragment.newInstance(mList.get(i));
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "第"+position+"页";
    }
}
