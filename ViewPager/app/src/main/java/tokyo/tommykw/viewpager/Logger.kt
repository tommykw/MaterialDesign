package tokyo.tommykw.viewpager

import android.os.SystemClock
import android.util.Log

import java.util.ArrayList
import kotlin.properties.Delegates

/**
 * Created by tommy on 15/12/22.
 */
class Logger(val tag: String, val label: String) {
    private val logTag by lazy { tag }
    private val logLabel by lazy { label }
    private var splits = ArrayList<Long>()
    private var splitLabels = ArrayList<String>()
    private var disabled = false

    fun reset() {
        disabled = !Log.isLoggable(logTag, Log.VERBOSE)
        if (disabled) return
        if (splits == null) {
            splits = ArrayList()
            splitLabels = ArrayList()
        } else {
            splits.clear()
            splitLabels.clear()
        }
    }

    fun addSplit(splitLabel: String) {
        if (disabled) return
        splits.add(SystemClock.elapsedRealtime())
        splitLabels.add(splitLabel)
    }

    fun dump() {
        if (disabled) return
        Log.d(logTag, logLabel + ":begin")
        val first = splits[0]
        var now = first
        for (i in 1..splits.size - 1) {
            now = splits[i]
            val prev = splits[i - 1]
            val splitLabel = splitLabels[i]
            Log.d(logTag, logTag + ":    " + (now - prev) + " ms, " + splitLabel)
        }
        Log.d(logTag, logLabel + ": end, " + (now - first) + " ms")
    }
}
