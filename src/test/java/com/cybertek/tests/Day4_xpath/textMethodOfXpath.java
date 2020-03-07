package com.cybertek.tests.Day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textMethodOfXpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/context_menu");
        WebElement ActualText = driver.findElement(By.xpath("//h3[text()='Context Menu']"));
        String actText = ActualText.getText();
        String expText = "Context Menu";
        if(actText.equals(expText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

       driver.close();

    }
}

