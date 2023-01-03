package com.helper.driver;

import org.openqa.selenium.WebDriver;

public  final class DriverManager {
    private DriverManager(){}

    private static ThreadLocal<WebDriver>threadLocalDriver=new ThreadLocal<>();

    public static void set(WebDriver driver){
        threadLocalDriver.set(driver);
    }
    public static WebDriver get(){
        return threadLocalDriver.get();
    }
    public static void remove(){
        threadLocalDriver.remove();
    }
}
