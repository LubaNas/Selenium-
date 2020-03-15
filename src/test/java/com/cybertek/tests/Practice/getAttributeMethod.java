package com.cybertek.tests.Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getAttributeMethod {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        //get Title
        System.out.println(driver.getTitle());

        //get current Url
        System.out.println(driver.getCurrentUrl());

        //get page source
        System.out.println(driver.getPageSource());



        WebElement myEbayLink = driver.findElement(By.linkText("My eBay"));
        // get certain values of attributes of the webelement

        String classValue = myEbayLink.getAttribute("class");
        System.out.println(classValue);
        String href = myEbayLink.getAttribute("href");
        System.out.println(href);

        //get text of the webElement

        System.out.println(myEbayLink.getText());

        WebElement input = driver.findElement(By.id("gh-ac"));
        input.sendKeys("wooden spoon");
        System.out.println(input.getAttribute("value"));

        // .getAttribute("innerHTML")  ---> returns text of the element
        System.out.println(myEbayLink.getAttribute("innerHTML"));
       // System.out.println(input.getAttribute("innerHTML")); does not work
        // gives you the whole info about the particular element
        System.out.println(myEbayLink.getAttribute("outerHTML"));

        driver.close();



    }
}
