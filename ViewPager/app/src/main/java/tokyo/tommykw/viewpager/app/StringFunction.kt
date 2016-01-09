package tokyo.tommykw.viewpager.app

import java.util.*
import kotlin.collections.joinToString
import kotlin.text.forEach

/**
 * Created by tommy on 16/01/06.
 */
fun String?.unique(): String {
    var uniqueSet = HashSet<Char>()
    this?.subSequence(0, this.length)?.forEach { i -> uniqueSet.add(i) }
    return uniqueSet.joinToString("")
}