package org.test.testngmethodsorder;

import java.lang.reflect.Method;
import org.testng.annotations.*;

/**
 *
 * @author jlocker
 */
public class TestWrapper {

    private String getTestName() {
        return this.getClass().getSimpleName();
    }

    @BeforeClass
    public void setUpClass() throws Exception {
        System.out.printf("CLASS in  >>>> [%s]%n", getTestName());
    }

    @AfterClass
    public void tearDownClass() throws Exception {
        System.out.printf("CLASS out <<<< [%s]%n", getTestName());
    }

    @BeforeMethod
    public void setUpMethod(Method m) throws Exception {
        System.out.println("running " + m);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
