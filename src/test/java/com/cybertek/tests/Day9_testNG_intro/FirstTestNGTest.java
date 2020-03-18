package com.cybertek.tests.Day9_testNG_intro;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {
    //annotation is something special about the class
    @Test
    public void test1(){
        System.out.println("test one");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("test two");
    }

    @Test
    public void tets3(){
        System.out.println("test three");
    }


}
