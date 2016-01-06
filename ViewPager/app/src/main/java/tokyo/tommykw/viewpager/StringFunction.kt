package tokyo.tommykw.viewpager

import java.util.*
import kotlin.text.forEach

/**
 * Created by tommy on 16/01/06.
 */
fun String?.unique(): String {
    var uniqueSet = HashSet<Char>()
    this?.subSequence(0, this.length)?.forEach { i -> uniqueSet.add(i) }
    return uniqueSet.toString()
}