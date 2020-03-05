package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class Locators {
    public static void main(String[] args) {
/*
1.Go to amazon  https://www.amazon.com/
2.Go to Ebay   https://www.ebay.com/
3.Enter a search term
4.Click on search button
5.Verify title contains search term
 */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wooden spoon");
        driver.findElement(By.className("nav-input")).click();
        driver.navigate().forward();

        if (driver.getTitle().contains("wooden spoon")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        driver.close();

        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.ebay.com/");

    }
}
