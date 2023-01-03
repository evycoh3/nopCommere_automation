package com.helper.driver;

import com.helper.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getRemoteDriver(String browser){
        WebDriver driver=null;
        DesiredCapabilities dc=new DesiredCapabilities();
        if (browser.equalsIgnoreCase("chrome")) {
            dc.setBrowserName("chrome");

        } else if (browser.equalsIgnoreCase("firefox")) {
            dc.setBrowserName("firefox");
        }
        else{
            throw new RuntimeException("browser is not et properly");
        }
        try {
            driver=new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteurl()),dc);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return driver;


    }
}
