package tokyo.tommykw.viewpager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by tommy on 15/12/24.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class LoggerTest {
    private Logger logger;

    @Before
    public void setUp() throws Exception {
        logger = new Logger("tab", "label");
    }

    @Test
    public void testDump() throws Exception {
        logger.addSplit("hoge1");
        logger.addSplit("hoge2");
        logger.addSplit("hoge3");
        logger.dump();
        assertTrue(true);
    }
}
