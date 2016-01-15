package tokyo.tommykw.viewpager.app

import java.util.*

/**
 * Created by tommy on 16/01/14.
 */
class EnumSetConverter<T : EnumSet<T>>() {
    fun convert(enumSet: EnumSet<T>): String {
        Class<?> innerType = enumSet.iterator().next().getClass();
    }
}

