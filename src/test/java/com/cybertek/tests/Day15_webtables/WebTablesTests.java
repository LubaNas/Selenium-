package com.cybertek.tests.Day15_webtables;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTests extends TestBase {
    @BeforeMethod
    public void setUpTest(){
        driver.get(ConfigurationReader.getProperty("url"));
        driver.findElement(By.linkText("Sortable Data Tables")).click();
    }

    @Test
    public void printTable(){

        //to print the whole table
        WebElement myTable = driver.findElement(By.id("table1"));
        System.out.println(myTable.getText());


    }
    @Test
    public void getHeaders(){
        //get all headers
        WebElement header = driver.findElement(By.tagName("thead"));
        System.out.println(header.getText());

        //get all headers in in a list
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println(headers.size());
        // use BrowserUtils to get the list of headers as text and print
        System.out.println(BrowserUtils.getElementsText(headers));


    }

    //get table size
    @Test
    public void getTableSize(){
        //get number of columns
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Number of columns: "+headers.size());

        //get number of rows including header

        List<WebElement> rowsWithHeader = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("Number of row with header: "+rowsWithHeader.size());

        //get number of rows without header

        List<WebElement>rowsWithOUTHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("Number of rows without header: "+rowsWithOUTHeader.size());

    }
    @Test
    public void getSingleRowByIndex() {
        // get the first row (in the body)
        WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]"));
        System.out.println(row.getText());
        //get the first row (in the body) dynamic path
        String xpath = getTableRowXpath(2);
        row = driver.findElement(By.xpath(xpath));
        System.out.println(row);
    }
    //getTableRowXpath based on Index
    public static String getTableRowXpath(int index){
        String xpath = "//table[@id='table1']/tbody/tr["+index+"]";
        return xpath;
    }

    //get single cell based on index
    @Test
    public void getSingleBasedOnIndex(){
        WebElement cell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"));
        System.out.println(cell.getText());
    }

    //go thru the table using loops and get all values
    @Test
    public void iterateTheTableUsingLoops(){
        //get the number of rows
int rowCount = getRowCount();

        //get the number of columns
        int colCount = getColCount();
        for(int i =1; i<=rowCount; i++){
            for (int j = 1; j <= colCount; j++) {
                String xpath = getCellXpathByIndex(i,j);
                WebElement cell = driver.findElement(By.xpath(xpath));
                System.out.println(cell.getText());
            }
        }
    }

    private String getCellXpathByIndex(int row, int col) {
        String xpath = "//table[@id='table1']/tbody/tr["+row+"]/td["+col+"]";
        return xpath;
    }

    //returns number of rows excluding the table header
    public static int getRowCount(){
        return driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
    }

    //return number of rows
    public int getColCount(){
        return  driver.findElements(By.xpath("//table[@id='table1']//th")).size();
    }
}
