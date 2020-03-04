package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");


        //to verify title --> getTitle();
        //to verify URL -->

        String expectedUrl = "https://www.etsy.com/";
        String actualURL = driver.getCurrentUrl();

        if(expectedUrl.equals(actualURL)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        driver.close();
    }
}
