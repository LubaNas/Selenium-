package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTestWithText {
    public static void main(String[] args) throws InterruptedException {
        /*

         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div[3]/div/input"));
        searchInput.sendKeys("selenium cookbook edition"+Keys.ENTER);

        Thread.sleep(2000);
        WebElement result = driver.findElement(By.xpath("//span[.='Selenium Testing Tools Cookbook - Second Edition']"));
        System.out.println(result.getText());
        driver.close();

    }
}
