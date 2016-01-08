package tokyo.tommykw.viewpager

import org.junit.Test
import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import tokyo.tommykw.viewpager.app.unique

/**
 * Created by tommy on 16/01/08.
 */
class StringFunctionTest {
    @Test
    @Throws(Exception::class)
    fun testUnique() {
        assertThat("hogehoge".unique(), `is`("hoge"))
        assertThat("aiueo".unique(), `is`("aiueo"))
    }
}