package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleIt {
//    1. Go to google webstite
//2. save the title in a string variable
//3. go to Etsy
//4. save the Etsy Title in a String
//5. Navigate back to previous page
//6. Verify the title is same as step 2
//            7. Navigate forward to previous page
//8.Verify the title is same as step 4
//            */

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        String title = "Google";
        driver.get("https://www.etsy.com/");
        String etsyTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver.navigate().back();

        if(driver.getTitle().equals(title)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.navigate().forward();

        if(driver.getTitle().equals(etsyTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}
