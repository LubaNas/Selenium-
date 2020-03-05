package com.cybertek.tests.Day3_Locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyErrorMessage {
    public static void main(String[] args) {
        /*
        1. go to login page
2. enter invalid username
3. enter invalid password
4. verify the error message
testers will gather test data in excell sheet
1. generate data from dummy data website -> generate.com
2. maven -> java faker
         */
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Faker fakeData = new Faker();

        //I need first name

        String name = fakeData.name().firstName();
        System.out.println(name);
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys(name);
        String password = fakeData.funnyName().name();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("wooden_spoon")).click();

        WebElement invalidMs = driver.findElement(By.id("flash"));
        String expected = "Your username is invalid!";

        String actual = invalidMs.getText();
        if(actual.equals(expected)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        driver.close();
    }
}
