package com.cybertek.tests.Day14_test_base_props_driver;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingTestBaseTests extends TestBase {

    @Test
    public void testTitle() {
        String url = ConfigurationReader.getProperty("url");
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "Practice");

    }
}
