package com.cybertek.tests.Day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        /*
        User story: As a user, I should be able to login VyTrack app.
        test case1: happy path
        1. go to VyTrack login page
        2. write username data: storemanager52
        3. write password UserUser123
        4. click login button
        5. verify that the user is on the homepage;

        test case2: login invalid credential
        1. go to VyTrack login page
        2. write invalid username
        3. write invalid password
        4. click login button
        5. Verify that error message appears

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://app.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");

        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        //verify title or url

        if (driver.getTitle().equalsIgnoreCase("Dashboard")) {
            System.out.println("Pass. Its a homepage");
        } else {
            System.out.println("fail");
        }

        if (driver.getCurrentUrl().equalsIgnoreCase("https://app.vytrack.com/")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        driver.close();
    }
}
