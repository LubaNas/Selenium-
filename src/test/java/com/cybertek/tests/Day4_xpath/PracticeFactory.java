package com.cybertek.tests.Day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class PracticeFactory {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("internetExplorer");
        driver.get("https://www.google.com/");
    }
}
