package com.cybertek.tests.Day3_Locators2;

import com.github.javafaker.Faker;

public class FakerPractice {
    public static void main(String[] args) {
        //create Faker object
        //generatedata.com; needs to be reflected in dependencies in pom.xml

        Faker fakeData = new Faker();

        //I need first name

        String name = fakeData.name().firstName();
        System.out.println(name);
    }
}
