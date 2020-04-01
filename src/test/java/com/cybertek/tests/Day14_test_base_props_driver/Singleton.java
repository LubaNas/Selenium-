package com.cybertek.tests.Day14_test_base_props_driver;

public class Singleton {
    //singleton design pattern is to share the same object between classes
    //make constructor private
    private Singleton(){


    }
    static String string;
    public static String getInstance(){
        if(string == null){
            string = "chrome";
        }
        return string;
    }
}
