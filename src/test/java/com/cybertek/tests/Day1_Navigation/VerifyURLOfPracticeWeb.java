package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) {
        /*

        1. go to cybertek practice website
        2. verify the URL

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("http://practice.cybertekschool.com/");

        String Expected = "http://practice.cybertekschool.com/";
        String actualUrl = driver.getCurrentUrl();

        if(Expected.equalsIgnoreCase(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();
    }
}
