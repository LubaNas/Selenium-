package com.cybertek.tests.Day14_test_base_props_driver;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class FileUploadTests extends TestBase {

    @Test
    public void filupLoadTest(){
        String url = ConfigurationReader.getProperty("url");
        driver.get(url);

        WebElement file_upload = driver.findElement(By.linkText("File Upload"));
        file_upload.click();
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys("C:\\Users\\lnase\\Desktop\\my_file.txt");
        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();

        WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
        Assert.assertEquals(uploadedFile.getText(), "my_file.txt");
    }
}
