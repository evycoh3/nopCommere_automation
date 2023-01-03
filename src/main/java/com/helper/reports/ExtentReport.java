package com.helper.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.helper.constants.FrameworkConstants;

import java.awt.*;
import java.io.File;
import java.util.Objects;

public final class ExtentReport {

    private ExtentReport(){}
    private static ExtentReports extent;
    private static ExtentTest test;

    public static void initReport(){
        if(Objects.isNull(extent)){
            extent=new ExtentReports();
            ExtentSparkReporter spark=new ExtentSparkReporter(FrameworkConstants.getReporterFilePath());
            spark.config().setDocumentTitle("nopCommerce Title");
            spark.config().setReportName("nopeCommerce Report");
            spark.config().setTheme(Theme.DARK);
            extent.attachReporter(spark);
        }
    }

    public static void flushReport(){
        if(Objects.nonNull(extent)){
            extent.flush();
        }
        try{
            Desktop.getDesktop().browse(new File(FrameworkConstants.getReporterFilePath()).toURI());
        }catch (Exception e){
            e.printStackTrace();
        }
        ExtentManager.remove();
    }
    public static void createTest(String testName){
        test=extent.createTest(testName);
        ExtentManager.set(test);
    }
    public static void assignAuthor(String author){
        ExtentManager.get().assignAuthor(author);
    }
}
