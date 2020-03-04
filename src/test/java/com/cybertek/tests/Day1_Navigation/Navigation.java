package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();

        //I want to see full window
        driver1.manage().window().fullscreen();
       // driver1.manage().window().maximize();

        String practiceWebURL = "http://practice.cybertekschool.com";
        driver1.get(practiceWebURL);
        Thread.sleep(3000);

        //go to google
        String gglURL = "https://www.google.com/";
        driver1.navigate().to(gglURL);
        Thread.sleep(3000);
        //navigate to practice;
        driver1.navigate().back();
        Thread.sleep(3000);
        //navigate forward
        driver1.navigate().forward();
        Thread.sleep(3000);
        driver1.navigate().refresh();

        //close drive, close the current Website tab
        driver1.close();

        //close down all the windows in a browser
        driver1.quit();
    }
}
