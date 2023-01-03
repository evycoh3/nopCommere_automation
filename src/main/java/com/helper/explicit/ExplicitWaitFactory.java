package com.helper.explicit;

import com.helper.config.ConfigFactory;
import com.helper.driver.DriverManager;
import com.helper.enums.WaitStrategy;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class ExplicitWaitFactory {

    private ExplicitWaitFactory(){}

    public static WebElement performExplicitWait(By by, WaitStrategy waitStrategy){
        WebElement element = null;
        if(waitStrategy==WaitStrategy.CLICKABLE){
            element=getWait().until(ExpectedConditions.elementToBeClickable(by));
        }
        else if(waitStrategy==WaitStrategy.VISIBLE){
            element=getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        else if(waitStrategy==WaitStrategy.PRESENCE){
            element=getWait().until(ExpectedConditions.presenceOfElementLocated(by));
        }
        else if(waitStrategy==WaitStrategy.NONE){
            element=DriverManager.get().findElement(by);
        }
        return element;
    }

    private static WebDriverWait getWait(){
        WebDriverWait wait=new WebDriverWait(DriverManager.get(), Duration.ofSeconds(ConfigFactory.getConfig().explicitTime()));
        wait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class);
        return wait;
    }
}
