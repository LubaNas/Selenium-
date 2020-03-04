package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver (interface) object needs to be created;

        WebDriverManager.chromedriver().setup();
        //WebDriver (interface) object needs to be created;
        //I have a driver
        WebDriver driver = new ChromeDriver();
        // I want to open Google home page
        //how do you launch/open a web page
        //by using get() --> url as String
        // driver.get("https://www.google.com/");

        //Navigations
        //navigate().to  --> opens a webpage

        // driver.navigate().to("https://www.google.com/");

        //get() vs navigate().to
        //get() - wait to load the page
        //navigate().to --> does not wait

        //navigate().back

        //go to google -> go to cybertek practice website
//
//        driver.get("https://www.google.com/");
//        Thread.sleep(3000);
//        driver.navigate().to("http://practice.cybertekschool.com/");
//        Thread.sleep(3000);
//        driver.navigate().back();
//
        //navigate().forward()
        //go to practice website --> google --> back to practice --> forward to google
        /*
       Navigation:
       driver.navigate().to("URL")
       driver.navigate().back()
       driver.navigate().forward()
       driver.navigate().refresh()
        */
        driver.navigate().to("http://practice.cybertekschool.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();




    }
}
