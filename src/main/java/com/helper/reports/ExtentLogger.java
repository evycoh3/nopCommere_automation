package com.helper.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.helper.utils.ScreenshotUtils;

public final class ExtentLogger {
    private ExtentLogger(){}

    public static void info(String msg){
        ExtentManager.get().info(msg);
    }
    public static void fail(String msg){
        ExtentManager.get().fail(msg);
    }
    public static void pass(String msg){
        ExtentManager.get().pass(msg);
    }
    public static void skip(String msg){
        ExtentLogger.skip(msg);
    }
    public static void fail(String msg,boolean screenshot){
        if(screenshot){
            ExtentManager.get().fail(msg, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
        }
    }
}
