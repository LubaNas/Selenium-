package com.cybertek.tests.Day13_synchronization_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); //will be applied to all tests

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        //driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); only once needed
        WebElement message = driver.findElement(By.cssSelector("#finish>h4"));
        Assert.assertTrue(message.isDisplayed());
        System.out.println(message.getText());

        driver.get("http://practice.cybertekschool.com/dynamic_loading/2");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        message = driver.findElement(By.cssSelector("#finish>h4"));
        Assert.assertTrue(message.isDisplayed());
        System.out.println(message.getText());
    }
}
