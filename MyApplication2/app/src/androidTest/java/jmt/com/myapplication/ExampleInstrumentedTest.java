package jmt.com.myapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
=======
import static org.junit.Assert.*;
>>>>>>> 5609cde3a951a782714179dbeb0cf436ad4fc7cb

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("jmt.com.myapplication", appContext.getPackageName());
    }
}
