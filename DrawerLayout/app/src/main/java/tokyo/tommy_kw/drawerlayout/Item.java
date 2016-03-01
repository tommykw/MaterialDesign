package tokyo.tommy_kw.drawerlayout;

import android.support.annotation.DrawableRes;

/**
 * Created by tommy on 16/02/29.
 */
public class Item {
    private int mDrawableRes;
    private String mTitle;

    public Item(@DrawableRes int res, String title) {
        mDrawableRes = res;
        mTitle = title;
    }

    public int getDrawableRes() {
        return mDrawableRes;
    }

    public String getTitle() {
        return mTitle;
    }
}
