package com.helper.driver;

import com.helper.config.ConfigFactory;
import com.helper.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class DriverFactory {

    private DriverFactory(){}

    public static WebDriver getDriver(String runmode,String browser){
        WebDriver driver = null;
        if(runmode.equalsIgnoreCase("local")) {
            driver=LocalDriverFactory.getLocalDriver(browser);
        }
        else if(runmode.equalsIgnoreCase("remote")){
            driver=RemoteDriverFactory.getRemoteDriver(browser);
        }
        return driver;
    }


}
