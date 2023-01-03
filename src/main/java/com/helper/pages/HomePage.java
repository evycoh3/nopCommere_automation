package com.helper.pages;

import com.helper.pages.components.HomePageComponents;
import com.helper.utils.DynamicXpathUtils;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    HomePageComponents hpc;

    public HomePage(){
        hpc=new HomePageComponents();
    }


    public HomePage setSideNavBar(String menu,String submenu){
        String val1= DynamicXpathUtils.getXpath(hpc.getSideNavbar(),menu);
        click(By.xpath(val1),menu);
        setSubsideNavBar(submenu);
        return this;
    }
    public HomePage setSubsideNavBar(String submenu){
        String val=DynamicXpathUtils.getXpath(hpc.getSubSideNavBae(),submenu);
        click(By.xpath(val),submenu);
        return this;
    }
}
