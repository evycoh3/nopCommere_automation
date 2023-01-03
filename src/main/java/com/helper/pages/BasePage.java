package com.helper.pages;

import com.helper.driver.DriverManager;
import com.helper.enums.WaitStrategy;
import com.helper.explicit.ExplicitWaitFactory;
import com.helper.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BasePage {



    protected void clear(By by,String fieldName){
        ExplicitWaitFactory.performExplicitWait(by,WaitStrategy.PRESENCE).clear();
        ExtentLogger.info("clear text from " +fieldName+" inputBox");
    }
    protected void sendKeys(By by, String value, String fieldName){
        ExplicitWaitFactory.performExplicitWait(by,WaitStrategy.PRESENCE).sendKeys(value);
        ExtentLogger.info("send keys to inputBox "+fieldName+":"+value);
    }
    protected void click(By by,String fieldName){
        ExplicitWaitFactory.performExplicitWait(by,WaitStrategy.CLICKABLE).click();
        ExtentLogger.info("clicked on "+fieldName +"Button");
    }
    protected String getText(By by,String fieldName){
       var text= ExplicitWaitFactory.performExplicitWait(by,WaitStrategy.VISIBLE).getText();
       ExtentLogger.info("Getting text from "+fieldName+":"+text);
       return text;
    }
    protected void selectByVisibleText(By by,String visibleText,String fieldName){
        Select select=new Select(ExplicitWaitFactory.performExplicitWait(by,WaitStrategy.CLICKABLE));
        select.selectByVisibleText(visibleText);
        ExtentLogger.info("Select "+visibleText+" from "+fieldName+" dropdown");
    }

}
