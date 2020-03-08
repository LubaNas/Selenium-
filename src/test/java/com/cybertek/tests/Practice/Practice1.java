package com.cybertek.tests.Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://cybertekschool.okta.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement emailbox = driver.findElement(By.id("okta-signin-username"));
        Thread.sleep(2000);
        emailbox.sendKeys("lnaseykina@gmail.com");
        System.out.println(emailbox.getAttribute("name"));
        System.out.println(emailbox.getAttribute("value"));
        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("hjjkklll");
        System.out.println(passwordBox.getAttribute("value"));

        WebElement signinButton = driver.findElement(By.xpath("//input[@class='button button-primary']"));
        
        signinButton.click();

        driver.close();






    }
}
