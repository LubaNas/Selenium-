package com.cybertek.tests.Day9_testNG_intro;

import org.testng.annotations.*;

public class BeforeAndAfterTest {

@BeforeClass
public void beforeClass(){
    System.out.println("BEFORE CLASS");
}

@AfterClass
public void afterClass(){
    System.out.println("AFTER CLASS");
}

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }

    @Test
    public void test1(){
        System.out.println("this is test one");
    }
    @Test
    public void test2(){
        System.out.println("this is test two");
    }



}
