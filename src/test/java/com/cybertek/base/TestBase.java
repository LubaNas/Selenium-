package com.cybertek.base;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    protected static WebDriver driver;

    @BeforeMethod
    public void setUoTest(){
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(5000);
        Driver.closeDriver();
    }


}
