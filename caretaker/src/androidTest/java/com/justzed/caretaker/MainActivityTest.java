package com.justzed.caretaker;

import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityTestCase;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Freeman Man
 * @version 1.0
 * @since 2015-8-21
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class MainActivityTest extends ActivityTestCase {

    private static final String TAG = MainActivityTest.class.getName();

    public MainActivityTest() {
        super();
        setActivity(new MainActivity());
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testTrue() {
        assertEquals(true, true);
    }


    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
