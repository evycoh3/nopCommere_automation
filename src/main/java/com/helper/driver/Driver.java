package com.helper.driver;

import com.helper.config.ConfigFactory;

import java.time.Duration;
import java.util.Objects;

public final class Driver {

    private Driver(){}

    public static void init(){
        if(Objects.isNull(DriverManager.get())){
            DriverManager.set(DriverFactory.getDriver(ConfigFactory.getConfig().runmode(),ConfigFactory.getConfig().browser()));
            DriverManager.get().manage().window().maximize();
            DriverManager.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getConfig().implicitTime()));
            DriverManager.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ConfigFactory.getConfig().explicitTime()));
            DriverManager.get().get(ConfigFactory.getConfig().url());
        }
    }


    public static void quit(){
        if(Objects.nonNull(DriverManager.get())){
            DriverManager.get().quit();
            DriverManager.remove();
        }
    }
}
