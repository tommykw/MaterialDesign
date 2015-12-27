package tokyo.tommykw.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by tommy on 15/12/20.
 */
class ScreenSlidePagerAdapter(fm: FragmentManager, private val mNumPages: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        return null
    }

    override fun getCount(): Int {
        return mNumPages
    }
}
