package com.cybertek.tests.Day16_page_object_model;

import com.cybertek.base.VytrackTestBase;
import com.cybertek.pages.DashboardPage;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PageHeadersTests extends VytrackTestBase {
    /*
    go to vytrack
    login as driver
    //verify header is "Quick Launchpad"
     */

    @Test
    public void dashboardPageTest(){
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username,password);

        dashboardPage = new DashboardPage();
        //wait until your element has certain text
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageHeader,"Quick Launchpad"));
        String actual = dashboardPage.pageHeader.getText();
        assertEquals(actual, "Quick Launchpad");

    }
    /*
    go to vytrcak
    go to fleet
    login as driver
    verify header is "Cars"
     */
    @Test
    public void fleetVechiclesTest(){
        //use login page to login
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username,password);
        //use dashboard change page
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.fleet));
        dashboardPage.fleet.click();
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.vehicles));
        dashboardPage.vehicles.click();
        //use
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageHeader, "Cars"));

        String actual = dashboardPage.pageHeader.getText();
        assertEquals(actual,"Cars");
    }


}
