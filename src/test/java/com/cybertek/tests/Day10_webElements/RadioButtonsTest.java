package com.cybertek.tests.Day10_webElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class RadioButtonsTest {
// radio button only can be selected one at time, no multiple is allowed
    WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        driver = WebDriverFactory.getDriver("firefox");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }

    @AfterMethod
    public void afterTest(){
        driver.quit();
    }

    /*
            test case 1:
            go to http://practice.cybertekschool.com/radio_buttons
            verify that blue is selected
            red is not selected
             */

    @Test
    public void test1(){

        WebElement blue = driver.findElement(By.id("blue"));
        //returns/prints true is element is selected, only for radio button
        System.out.println(blue.isSelected());
        //verifying if its selected
        Assert.assertTrue(blue.isSelected());

        WebElement red = driver.findElement(By.id("red"));
        //print red is not selected
        System.out.println(red.isSelected());

        //verifies if the statement is false. if its false, it passes. if true, it fails
        Assert.assertFalse(red.isSelected());
    }

           /*
            default behaviour of application
            test case 2:
            go to http://practice.cybertekschool.com/radio_buttons
            verify that red is selected
            blue is not selected
             */
    @Test
    public void test2(){

        WebElement red = driver.findElement(By.id("red"));
        WebElement blue = driver.findElement(By.id("blue"));
        red.click();
        //verify that blue is not selected
        Assert.assertFalse(blue.isSelected());
        //verify that red is selected
        Assert.assertTrue(red.isSelected());

    }


}
