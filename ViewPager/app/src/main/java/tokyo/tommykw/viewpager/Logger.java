package tokyo.tommykw.viewpager;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by tommy on 15/12/22.
 */
public class Logger {
    private String mTag;
    private String mLabel;
    private boolean mDisabled;
    ArrayList<Long> mSplits;
    ArrayList<String> mSplitLabels;

    public Logger(String tag, String label) {
        reset(tag, label);
    }

    public void reset(String tag, String label) {
        mTag = tag;
        mLabel = label;
        reset();
    }

    public void reset() {
        mDisabled = !Log.isLoggable(mTag, Log.VERBOSE);
        if (mDisabled) return;
        if (mSplits == null) {
            mSplits = new ArrayList<Long>();
            mSplitLabels = new ArrayList<String>();
        } else {
            mSplits.clear();
            mSplitLabels.clear();
        }
    }

    public void dump() {
        //TODO implement
    }
}
