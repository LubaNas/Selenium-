package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WebElementToStringList {
    public static List<String> getElementsText(List<WebElement> listEl){

        List<String> listSt = new ArrayList<>();
        for(WebElement element :listEl){
            listSt.add(element.getText());
        }

        return listSt;
    }
}
