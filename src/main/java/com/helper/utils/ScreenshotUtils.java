package com.helper.utils;

import com.helper.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public final class ScreenshotUtils {
    private ScreenshotUtils(){}

    public static String getBase64Image(){
        return ((TakesScreenshot) DriverManager.get()).getScreenshotAs(OutputType.BASE64);
    }
}
