package com.cybertek.tests.Day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //got ot practice login page
        //locate username box with absolute xpath
        //locate username box with relative xpath

        driver.get("http://practice.cybertekschool.com/login");
        WebElement usernameBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[1]/div/input")); //absolute path
        usernameBox.sendKeys("tom");
        // //tagname[@attribute='value']
        //*[@id='email']        * dont need to locate tag/ start anywhere in html
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div/input")); //relative path

        driver.close();


    }
}
