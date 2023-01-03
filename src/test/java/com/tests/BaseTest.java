package com.tests;

import com.helper.driver.Driver;
import com.helper.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    @BeforeMethod
    public void setup(){
        Driver.init();
    }
    @AfterMethod
    public void tearDown(){
        Driver.quit();
    }

}
