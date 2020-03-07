package com.cybertek.tests.Day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement link = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        String link1 = link.getAttribute("href");
        System.out.println(link1);

        driver.close();
    }
}
