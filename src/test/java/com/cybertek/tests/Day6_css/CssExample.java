package com.cybertek.tests.Day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssExample {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("edge");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // # means ID in css
        WebElement button = driver.findElement(
                By.cssSelector("#disappearing_button"));
        System.out.println(button.getText());

        // . means classname in . we can use this type for elements that have spaces
        WebElement button1 = driver.findElement(
                By.cssSelector(".nav-link"));
        System.out.println(button1.getText());

       



    }
}
