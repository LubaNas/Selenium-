package com.cybertek.tests.Day13_synchronization_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitExamples {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
       wait = new WebDriverWait(driver,10);
        }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void test1TitleTest(){
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.get("https://store.steampowered.com/");
        //wait for the title of the 2nd page
        //explicit wait code has two steps:
        //1. create webdriver wait class. using this object we can define for how long we want to wait. Creating
        //this object will not trigger the wait
        //2. kick of the wait by providing the expected condition using:
        // - wait.until() method as parameter
      //  WebDriverWait wait = new WebDriverWait(driver,10);
        //start waiting fot title containing text
       // wait.until(ExpectedConditions.titleContains("Steam"));
        System.out.println(driver.getTitle());
    }

    @Test
    public void test2WaitForVisible(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("pwd"));
        //waits for given element to be visible on page
        wait.until(ExpectedConditions.visibilityOf(username));
        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("johndoe");
    }

    @Test
    public void test2WaitForVisibleFail(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("pwd"));
        //give not enough time
        wait.withTimeout(Duration.ofSeconds(2));

        //waits for given element to be visible on page
        wait.until(ExpectedConditions.visibilityOf(username));
        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("johndoe");
    }
    @Test
    public void test4WaitForClickable(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/6");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("pwd"));
        WebElement button = driver.findElement(By.tagName("button"));
        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword");
        // wait for element to disappear
        //wait until the overlay elements disappear
        WebElement overlay = driver.findElement(By.className("loadingoverlay"));
        wait.until(ExpectedConditions.invisibilityOf(overlay));
        //wait for element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }
    @Test

    public void Test4WaitForInvisible(){
        driver.get("https://app.vytrack.com/user/login");
        WebElement username = driver.findElement(By.id("prependedInput"));
        WebElement password = driver.findElement(By.id("prependedInput2"));
        username.sendKeys("salesmanager110");
        password.sendKeys("UserUser123");
        password.sendKeys();

        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        WebElement myCalendar = driver.findElement(By.linkText("My Calendar"));
        //wait until th element with class loader-mask is not visible

        //WebElement overlay = driver.findElement(By.cssSelector(".loader-mask"));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader-mask")));
        myCalendar.click();
    }

    @Test
    public void test5Fluent(){
       // driver.get();
    }
}
