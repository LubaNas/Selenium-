package com.cybertek.base;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.pages.VehiclesPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.google.gson.internal.$Gson$Preconditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class VytrackTestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected VehiclesPage vehiclesPage;
    @BeforeMethod
    public void setUoTest(){
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.getProperty("vytrack_url"));
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(5000);
        Driver.closeDriver();
    }


}
