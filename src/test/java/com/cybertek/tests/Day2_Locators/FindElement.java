package com.cybertek.tests.Day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
        //Locator 1.ID
        //task
        // go to cybertek okta login page
        //write email to the text box

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");

        //write email to the text box
        /*
        1. find the text box first --> findElement() from WebDriver
         */
        String word = "java";
        //WebElement = data type/interface
        WebElement emailBox = driver.findElement(By.id("okta-signin-username"));
        emailBox.sendKeys("lnaseykina@gmail.com");
        //write your password to the password box
        WebElement passwordBox = driver.findElement(By.id("okta-signin-password"));
        passwordBox.sendKeys("Designated13");
        driver.findElement(By.id("okta-signin-submit")).click();
        driver.findElement(By.linkText("Send Push")).click();



    }
}
