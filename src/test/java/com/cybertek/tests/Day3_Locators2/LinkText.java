package com.cybertek.tests.Day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        //Locator -> LinkText
        //<a> a tag is link. in this situation, we will use linkText locator to locate the element
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().maximize();

        WebElement example3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        String textVersionOfExample3 = example3.getText();
        System.out.println(textVersionOfExample3);

        //I want ot locate example3 with only a part of it
        System.out.println(driver.findElement(By.partialLinkText("Example 3:")).getText());
        //locate cybertek school
        System.out.println( driver.findElement(By.linkText("Cybertek School")).getText());

        System.out.println(driver.findElement(By.linkText("Home")).getText());
        driver.close();
    }
}
