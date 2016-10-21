package com.example.xuanvinh.demoandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by XuanVinh on 14/10/2016.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter implements PagerSlidingTabStrip.IconTabProvider {

//    String[] mtitle={"Tab1","Tab2","Tab3"};

final int PAGE_COUNT = 3;
    private int tabIcons[] = {R.drawable.user, R.drawable.chat, R.drawable.setting};
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frg  = null;
        switch(position)
        {
            case 0:
                frg = new Tab1Fragment();
                break;
            case 1:
                frg = new Tab2Fragment();
                break;
            case 2:
                frg = new Tab3Fragment();
                break;
        }
        return frg;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }



    @Override
    public int getPageIconResId(int position) {
        return tabIcons[position];
    }
}
