package com.cybertek.tests.Day5_more_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.sound.midi.Soundbank;

public class ClassNameExample {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/login");
        WebElement link = driver.findElement(By.className("nav-link"));
        System.out.println(link.getText());
        //classname does not work if the value of the class attribute has a space;



    }
}
