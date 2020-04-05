package com.cybertek.tests.Day16_page_object_model;

import com.cybertek.base.TestBase;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class PositiveLoginTests extends TestBase {
    LoginPage loginPage;
    WebDriverWait wait;

    @BeforeMethod
    public void setUpTest() {
        driver.get(ConfigurationReader.getProperty("vytrack_url"));
       loginPage = new LoginPage();
        wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void loginAsDrivers() {
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username, password);

        wait.until(ExpectedConditions.titleIs("Dashboard"));
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, "Dashboard");

    }

    @Test
    public void loginAsSalesManager() {
        String username = ConfigurationReader.getProperty("sales_manager_username");
        String password = ConfigurationReader.getProperty("sales_manager_password");
        loginPage.login(username, password);
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, "Dashboard");

    }
    @Test
    public void loginAsStoreManager() {
        String username = ConfigurationReader.getProperty("store_manager_username");
        String password = ConfigurationReader.getProperty("store_manager_password");
        loginPage.login(username, password);
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, "Dashboard");
    }

    }
