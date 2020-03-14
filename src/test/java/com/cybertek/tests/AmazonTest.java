package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
        //nameMatchTest();
        secondNameMatchTest();

    }

    private static void secondNameMatchTest() throws InterruptedException {
        /**
         * Test Case:
         * Open browser
         * Go to Amazon
         * Search for any item
         * remember the name of the second resuslt
         * click on the second result
         * verify that product name is same in the product page
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        String searchTerm = "disinfectant wipes";
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(searchTerm+Keys.ENTER);
        WebElement searchBtn = driver.findElement(By.className("nav-input"));
        searchBtn.click();
        Thread.sleep(2000);
        WebElement secondResult = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
        System.out.println(secondResult.getText());
        String expectedName = secondResult.getText();
        secondResult.click();

        Thread.sleep(2000);
        WebElement productName = driver.findElement(By.id("productTitle"));
        String actualName = productName.getText();
        System.out.println(actualName);
        Thread.sleep(3000);
        if(expectedName.equals(actualName)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("expected: "+expectedName);
            System.out.println("actual: "+actualName);
        }

        driver.quit();


    }



    private static void nameMatchTest() throws InterruptedException {
        /**
         * Test Case:
         * Open browser
         * Go to Amazon
         * Search for any item
         * remember the name of the first resuslt
         * click on the first result
         * verify that product name is same in the product page
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        String searchTerm = "disinfectant wipes";
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(searchTerm+Keys.ENTER);
        WebElement searchBtn = driver.findElement(By.className("nav-input"));
        searchBtn.click();
        Thread.sleep(2000);
        WebElement firstResult = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(firstResult.getText());
        String expectedName = firstResult.getText();
        firstResult.click();

        Thread.sleep(2000);
        WebElement productName = driver.findElement(By.id("productTitle"));
        String actualName = productName.getText();
        System.out.println(actualName);

        if(expectedName.equals(actualName)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("expected: "+expectedName);
            System.out.println("actual: "+actualName);
        }

        driver.quit();


    }
}
