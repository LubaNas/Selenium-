package com.cybertek.tests.Day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickVsSubmit {

    /*
    Click()
        sybmit()
        task:
        1. go to forgot password web page
        http://practice.cybertekschool.com/forgot_password
       2.  enter any email
       3. click "retrieve password" bttb
        4. verify the URL is:
        http://practice.cybertekschool.com/email_sent

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //1. go to forgot password web page
        //        http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 2.  enter any email
        driver.findElement(By.name("email")).sendKeys("lnaseykina@gmail.com");
        //3. click "retrieve password" button
        driver.findElement(By.id("form_submit")).submit();
        // 4. verify the URL is:
        //        http://practice.cybertekschool.com/email_sent

        String ExpectedUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equals(ExpectedUrl)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        //verify that the confirmation message "Your e-mail's been sent!"

        String expectedText = "Your e-mail's been sent!";
        WebElement actualText = driver.findElement(By.name("confirmation_message"));
        String Actual = actualText.getText();
        if(expectedText.equals(Actual)){
            System.out.println("true");
        }else{
            System.out.println("fail");
        }

        driver.close();


    }
}
