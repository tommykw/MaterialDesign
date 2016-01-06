package tokyo.tommykw.viewpager

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricGradleTestRunner
import org.robolectric.annotation.Config

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*

/**
 * Created by tommy on 15/12/24.
 */
@RunWith(RobolectricGradleTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(21))
class LoggerTest {
    private var logger: Logger? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        logger = Logger("tab", "label")

        //logger = Logger("tab", "label")
    }

    @Test
    @Throws(Exception::class)
    fun testDump() {
        logger!!.addSplit("hoge1")
        logger!!.addSplit("hoge2")
        logger!!.addSplit("hoge3")
        logger!!.dump()
        assertTrue(true)
    }
}
