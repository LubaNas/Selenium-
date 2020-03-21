package com.cybertek.tests.Day10_webElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisplayedAndDisabledTest {
    WebDriver driver;

    @BeforeMethod
    public void BeforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }


    @Test
    public void disabledTest() throws InterruptedException {
        Thread.sleep(2000);
        WebElement green = driver.findElement(By.id("green"));
        WebElement black = driver.findElement(By.id("black"));
        //isEnabled --> returns true if the element is enabled, active
        System.out.println(green.isEnabled());
        System.out.println(black.isEnabled());
        Assert.assertFalse(green.isEnabled());
        Assert.assertTrue(black.isEnabled());

    }

    @Test
    public void disabledTestWithAtribute() throws InterruptedException {
        Thread.sleep(2000);
        WebElement green = driver.findElement(By.id("green"));
        WebElement black = driver.findElement(By.id("black"));
        System.out.println("black: "+black.getAttribute("disabled"));
        System.out.println("green: "+green.getAttribute("disabled"));

        //verify that certain value equals to null. verify element is enabled;
        Assert.assertEquals(black.getAttribute("disabled"),null);
        //verify that value of black.getAttribute("disabled") is null
        Assert.assertNull(black.getAttribute("disabled"));

        //verify that certain value is equal to TRUE. verify element is DISABLED
        Assert.assertEquals(green.getAttribute("disabled"),true);
        Assert.assertTrue(Boolean.parseBoolean(green.getAttribute("disabled")));

    }
    @Test
    public void testElementVisible() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement username = driver.findElement(By.id("username"));
        WebElement start = driver.findElement(By.tagName("button"));
        //verify that username is not visible
        //isDisplayed -> returns true element we found in HTML is visible on page
        System.out.println(username.isDisplayed());
        start.click();
        Thread.sleep(5000);
        System.out.println("Username is visible: "+username.isDisplayed());
        Assert.assertTrue(username.isDisplayed());
    }
}
