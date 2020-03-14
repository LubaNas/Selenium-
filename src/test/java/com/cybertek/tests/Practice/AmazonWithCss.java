package com.cybertek.tests.Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonWithCss {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement todaysDeal = driver.findElement(By.cssSelector("a[tabindex='47']"));
        todaysDeal.click();
       // Thread.sleep(2000);


        String expected = "Today's Deals";
        WebElement topMessage = driver.findElement(By.cssSelector(".nav-a-content"));
        System.out.println(topMessage.getText());

        if (expected.equals(topMessage.getText())){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected: "+expected);
            System.out.println("actual: "+topMessage.getText());
        }

        WebElement bottomHeader = driver.findElement(By.cssSelector("h1>div:nth-of-type(1)"));
        if (expected.equals(bottomHeader.getText())){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected: "+expected);
            System.out.println("actual: "+bottomHeader.getText());
        }
         driver.close();

    }
}
