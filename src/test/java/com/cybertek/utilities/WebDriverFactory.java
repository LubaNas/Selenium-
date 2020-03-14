package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
    //write a static return type method which returns WebDriver
    //getDriver (name)
    //it takes string as a parameter --> browser type
    //returns ChromeDriver and FirefoxDriver

    public static WebDriver getDriver(String browserType){
        //local variables;
        WebDriver driver = null;
        switch(browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
               break;
            case"edge":

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();


        }
        return driver;
    }
}
