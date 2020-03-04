package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEtsyTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //go to etsy --> data
        driver.get("https://www.etsy.com/");

        String expected = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        String actualTitle = driver.getTitle();

        if(expected.equalsIgnoreCase(actualTitle)){
            System.out.println("The test is PASS");
        }else{
            System.out.println("The test is FAILED");
        }
        driver.close();
    }
}
