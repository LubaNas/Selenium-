package com.cybertek.tests.Day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/login");
        //i want to add value of type attribute
        //type = "text" -> getAttribute("attribute name")
        //locate username box
        WebElement username = driver.findElement(By.name("username"));
        String valueOfType = username.getAttribute("type");
        System.out.println(valueOfType); //getAttribute() is useful for dropdown menu
        WebElement loginbttn = driver.findElement(By.id("wooden_spoon"));
        //i want to print class attributes value
        loginbttn.getAttribute("class");
    }
}
