package com.cybertek.tests.Day12_popUps_alerts_iframes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeExamples {


    WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
    }

    @AfterMethod
    public void afterTest(){
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/tinymce");
        Thread.sleep(3000);
        WebElement textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        //TODO switch by id/name
        driver.switchTo().frame("mce_0_ifr");
        textBox.sendKeys("great! Thanks!");
        // get out of the frame
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h3")));

        //TODO switch by webelement
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        // TODO switch by index
        driver.switchTo().frame(0);
        textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("great! Thanks!");
        }
    }

