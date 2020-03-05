package com.cybertek.tests.Day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();
        //locating welcome message with tagName

        WebElement welcomeMsg = driver.findElement(By.tagName("h4"));

        //verify the welcome message
        //expected vs actual

        String expected = "Welcome to the Secure Area. When you are done click logout below.";

        //String vs Webelement

        String actualWelcomeMsge = welcomeMsg.getText();

        //.getText() is a method to convert WebElement into a String

        if(actualWelcomeMsge.equals(expected)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        driver.close();

    }
}
