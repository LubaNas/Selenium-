package com.cybertek.tests.Day16_page_object_model;

import com.cybertek.base.TestBase;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {
    LoginPage  loginpage;

    @BeforeMethod
    public void setUpTest(){
        driver.get(ConfigurationReader.getProperty("vytrack_url"));
        LoginPage loginpage = new LoginPage();

    }
    @Test
    public void wrongUsernametest() {

        loginpage.username.sendKeys("user3000");
        loginpage.password.sendKeys("UserUser123");
        loginpage.login.click();

        String actual = loginpage.errorMessage.getText();
        Assert.assertEquals(actual, "Invalid user name or password.");
        Assert.assertTrue(loginpage.errorMessage.isDisplayed());

    }

    @Test
    public void wrongPasswordtest() {
       loginpage.username.sendKeys("SalesManager110");
       loginpage.password.sendKeys("LS13");
       loginpage.login.click();
       String actual = loginpage.errorMessage.getText();
       Assert.assertEquals(actual,"Invalid user name or password.");
       Assert.assertTrue(loginpage.errorMessage.isDisplayed());

    }
}
