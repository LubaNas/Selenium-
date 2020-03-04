package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {
        /*
        1. go to cybertek practice website
        http://practice.cybertekschool.com/
        2. verify Title expected Title: Practice

        Actual Title? --->


         */
//connect browser and driver;
        // setup browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().fullscreen();
        String expectedTitle = "Practice";

        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected "+expectedTitle);
            System.out.println("The actual title is "+actualTitle);
        }
        driver.close();
    }
}
