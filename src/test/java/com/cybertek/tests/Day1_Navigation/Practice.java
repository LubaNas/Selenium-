package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {
    public static void main(String[] args) {

        /*
        Task:
1. Go to google webstite
2. save the title in a string variable
3. go to Etsy
4. save the Etst Title in a String
5. Navigate back to previouse page
6. Verify the title is same as step 2
7. Navigate forward to previoud page
8.Verify the title is same as step 4

         */
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");
        String googleTitle = "Google";
        driver.get("https://www.etsy.com/");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        String verifiedTitle = driver.getTitle();
        if (verifiedTitle.equalsIgnoreCase(googleTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.navigate().forward();
        String verifiedTitle1 = driver.getTitle();
        if (verifiedTitle1.equals(etsyTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        driver.close();
    }
}
