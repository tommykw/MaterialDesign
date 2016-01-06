package tokyo.tommykw.viewpager

import android.os.SystemClock
import android.util.Log

import java.util.ArrayList
import kotlin.properties.Delegates

/**
 * Created by tommy on 15/12/22.
 */
class Logger(val tag: String, val label: String) {
    private val mTag: String by lazy { tag }
    private val mLabel: String by lazy { label }
    private var mDisabled: Boolean = false
    internal var mSplits: ArrayList<Long>? = null
    internal var mSplitLabels: ArrayList<String>? = null

    fun reset() {
        mDisabled = !Log.isLoggable(mTag, Log.VERBOSE)
        if (mDisabled) return
        if (mSplits == null) {
            mSplits = ArrayList<Long>()
            mSplitLabels = ArrayList<String>()
        } else {
            mSplits!!.clear()
            mSplitLabels!!.clear()
        }
    }

    fun addSplit(splitLabel: String) {
        if (mDisabled) return
        val now = SystemClock.elapsedRealtime()
        mSplits!!.add(now)
        mSplitLabels!!.add(splitLabel)
    }

    fun dump() {
        if (mDisabled) return
        Log.d(mTag, mLabel!! + ":begin")
        val first = mSplits!![0]
        var now = first
        for (i in 1..mSplits!!.size - 1) {
            now = mSplits!![i]
            val splitLabel = mSplitLabels!![i]
            val prev = mSplits!![i - 1]
            Log.d(mTag, mLabel + ":    " + (now - prev) + " ms, " + splitLabel)
        }
        Log.d(mTag, mLabel + ": end, " + (now - first) + " ms")
    }
}
