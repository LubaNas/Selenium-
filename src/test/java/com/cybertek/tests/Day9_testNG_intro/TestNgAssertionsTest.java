package com.cybertek.tests.Day9_testNG_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertionsTest {
    @Test
    public void test1(){
        String expected = "one";
        String actual = "one";

        Assert.assertEquals(actual, expected);
        //if not printing anything, it means that its passing
        Assert.assertEquals(1,1); //method overload but params should be same type;
        Assert.assertEquals(false, false);
        System.out.println("test 1 complete");

    }

    @Test
    public void test2() {
        String expected = "one";
        String actual = "two";
        System.out.println("starting to ocmpare");
        Assert.assertEquals(actual, expected);
        System.out.println("test 2 complete");

    }

    @Test
    public void test3() {
        String expected = "one";
        String actual = "two";

        Assert.assertNotEquals(expected, actual);


    }

    @Test
    public void test4(){
        String expected = "one";
        String actual = "one";

        Assert.assertTrue(expected.equalsIgnoreCase(actual));

        int e = 100;
        int a = 200;
        Assert.assertTrue(a>e);
    }

    @Test
    public void test5(){
        String expected = "https://mvnrepository.com/artifact/org.testng/testng/7.1.0";
        String actual = "https://mvnrepository.com/artifact/org.testng/testng/7.1.0";
        Assert.assertEquals(expected,actual);

        //verify that title starts with java

        String expected1 = "java";
        String actual1 = "java - Google Search";

        Assert.assertTrue(actual1.contains(expected1));
    }



}
