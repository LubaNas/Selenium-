package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        //all page object classes need constructor.
        //here we have to call PageFactory.initElements(); from selenium
        // and pass a webdriver object and this class as param.
        PageFactory.initElements(Driver.getDriver(),this);

    }
    // FindBy -> we provide the locator of the webelement
    @FindBy(id="prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement login;

    @FindBy(css = ".alert-error>div")
    public WebElement errorMessage;
}
