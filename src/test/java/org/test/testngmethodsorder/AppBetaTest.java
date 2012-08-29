package org.test.testngmethodsorder;

import org.testng.annotations.Test;

/**
 *
 * @author jlocker
 */
//@Test(dependsOnGroups = "empty") // add dependency to all methods
public class AppBetaTest
        extends TestWrapper // comment this out to disable inheritance
{

    public AppBetaTest() {
    }

    @Test(dependsOnMethods = "testBeta2")
    public void testBeta1() {
        System.out.println("  beta1");
    }

    @Test
    public void testBeta2() {
        System.out.println("  beta2");
    }

    @Test(dependsOnMethods = "testBeta2")
    public void testBeta3() {
        System.out.println("  beta3");
    }

}
