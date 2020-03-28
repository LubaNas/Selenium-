package com.cybertek.tests.Day13_synchronization_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VytrackLoginTestWithWait {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test(){
    driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("t shirt");
    }

}
