package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Task 1:
1. Go to Bookit login page
https://cybertek-reservation-qa.herokuapp.com/sign-in
2. Verify the title of the page
Task 2:
2. Go to Bookit login page
https://cybertek-reservation-qa.herokuapp.com/sign-in
2. Verify that URL contains “cybertek-reservation”

 */

public class WarmUpTasks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().fullscreen();
        //expected vs actual
        String expectedTitle = "bookit";
        if (driver.getTitle().equalsIgnoreCase(expectedTitle)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (driver.getCurrentUrl().contains("cybertek-reservation")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        driver.close();
    }
}
