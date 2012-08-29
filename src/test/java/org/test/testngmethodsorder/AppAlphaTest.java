package org.test.testngmethodsorder;

import org.testng.annotations.Test;

/**
 *
 * @author jlocker
 */
//@Test(dependsOnGroups = "empty") // add dependency to all methods
public class AppAlphaTest
        extends TestWrapper // comment this out to disable inheritance
{

    public AppAlphaTest() {
    }

    @Test
    public void testAlpha1() {
        System.out.println("  alpha1");
    }

    @Test(dependsOnMethods = "testAlpha1")
    public void testAlpha2() {
        System.out.println("  alpha2");
    }
}
