package com.cybertek.tests.Day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        String signinBut = driver.findElement(By.tagName("button")).getAttribute("submit");
        System.out.println(signinBut);
    }
}
