package com.helper.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    private ExtentManager(){}

    private static ThreadLocal<ExtentTest>extentTestThreadLocal=new ThreadLocal<>();

    public static void set(ExtentTest test){
        extentTestThreadLocal.set(test);
    }
    public  static ExtentTest get(){
        return extentTestThreadLocal.get();
    }
    public static void remove(){
        extentTestThreadLocal.remove();
    }
}
