package com.cybertek.tests.officehours.office_hours3;

import com.cybertek.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EtsyTets extends TestBase {
    /*
    search for wooden spoon
    verify title by assertion
    verify that default ship location is Ship to
    verify ship to countries include Australia
     */

    @Test
    public void verifyCountryList() {
        driver.get("https://www.etsy.com/");


        WebElement input = driver.findElement(By.id("global-enhancements-search-query"));
        input.sendKeys("wooden spoon" + Keys.ENTER);
        String pageTitle = driver.getTitle();
        String expectedTitle = "Wooden Spoon | Etsy";
        WebDriverWait wait = new WebDriverWait(driver,10);
        //using explicit wait to wait until title contains Wooden spoon | Etsy
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertEquals(pageTitle,expectedTitle);



    }
}
