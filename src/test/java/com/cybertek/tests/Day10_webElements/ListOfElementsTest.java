package com.cybertek.tests.Day10_webElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class ListOfElementsTest {
WebDriver driver;
    @BeforeMethod
    public void BeforeMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void afterTest(){
        driver.quit();
    }
    /*

     */
    @Test
    public void listOfRadioButtons(){
    driver.get("http://practice.cybertekschool.com/radio_buttons");

    //driver.findElements ----> returns LIST of elements
        //if the locator does not match anything, it does not throw exception, it just returns empty list
    List<WebElement> sports = driver.findElements(By.name("sport"));
        System.out.println(sports.size());
        for(WebElement radioButton: sports){
            Assert.assertFalse(radioButton.isSelected());
        }
    }

    /*
    get all the links on the page
    print their text
     */

    @Test
    public void getAllLinks(){
        driver.get("http://practice.cybertekschool.com/");
        //get all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //get the text of each link and print

        for (WebElement link: links){
            System.out.println(link.getText());
        }
    }

    /*
    go to amazon
    search
    number of results


     */

    @Test
    public void amazonTest(){
        driver.get("https://www.amazon.com/");
        WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
        input.sendKeys("paper towels"+ Keys.ENTER);
        List<WebElement> allResults = driver.findElements(By.cssSelector("span.a-size-base-plus"));
        System.out.println("number of results: "+allResults.size());

        System.out.println("First Result: "+allResults.get(0).getText());
        System.out.println("Second Result: "+allResults.get(1).getText());
        System.out.println("Last Result: "+allResults.get(allResults.size()-1).getText());
    }

            /*
        go to http://practice.cybertekschool.com/radio_buttons
        verify the all sports checkboxes are NOT checked by default
        randomly click any sport
        verify that that sport is clicked
        verify that all others are not clicked
        repeat the last step for 5 times
         */
    @Test
    public void buttonVerifies() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        List<WebElement> buttons = driver.findElements(By.name("sport"));
        for (int i = 0; i < buttons.size(); i++) {
            Assert.assertFalse(buttons.get(i).isSelected());

            }
        //randomly clicking and verifying
        Random ran = new Random();
        for(int q =0; q<5;q++){
            Thread.sleep(5000);
            int num = ran.nextInt(4);
            buttons.get(num).click();
            for (int i =0; i<buttons.size();i++){
                if(i==num){
                    Assert.assertTrue(buttons.get(num).isSelected());
                }else{
                    Assert.assertFalse(buttons.get(i).isSelected());
                }
            }
        }



    }

}
