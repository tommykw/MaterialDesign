package tokyo.tommykw.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by tommy on 15/12/20.
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
    private final int mNumPages;


    public ScreenSlidePagerAdapter(FragmentManager fm, int numPages) {
        super(fm);
        mNumPages = numPages;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return mNumPages;
    }
}
