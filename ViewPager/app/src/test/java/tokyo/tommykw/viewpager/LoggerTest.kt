package tokyo.tommykw.viewpager

import org.junit.Test

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import tokyo.tommykw.viewpager.app.Logger

/**
 * Created by tommy on 15/12/24.
 */
class LoggerTest {
    private val logger = Logger("tab", "label")

    @Test
    @Throws(Exception::class)
    fun testDump() {
        logger.addSplit("hoge1")
        logger.addSplit("hoge2")
        logger.addSplit("hoge3")
        logger.dump()
        assertTrue(true)
    }
}
