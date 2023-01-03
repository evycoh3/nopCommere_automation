package com.helper.pages;

import com.helper.driver.DriverManager;
import com.helper.pages.components.AddNewDiscountComponents;
import org.openqa.selenium.Keys;

public class AddNewDiscountPage extends BasePage{
    private AddNewDiscountComponents adc;
    public AddNewDiscountPage(){
        adc=new AddNewDiscountComponents();
    }
    public AddNewDiscountPage clickAddNew(){
        click(adc.getAddNewDiscountBtn(),"add new button");
        return this;
    }
    public AddNewDiscountPage setDiscountName(String discountName){
        sendKeys(adc.getDiscountName(),discountName,"discount name");
        return this;
    }
    public AddNewDiscountPage selectDiscountType(String discountType){
        selectByVisibleText(adc.getDiscountType(),discountType,"discountType");
        return this;
    }

    public AddNewDiscountPage setDiscountCoupon(String couponID){
        click(adc.getCouponCodeCheckbox(),"coupon checkbox");
        sendKeys(adc.getCouponCodeTextbox(),couponID,"coupon code");
        return this;
    }
    public AddNewDiscountPage clickSaveButton(){
        click(adc.getSaveButton(),"save button");
        return this;
    }
    public String getSuccessTxtMsg(){
        return getText(adc.getAddNewDiscount_success_msg(),"response msg");
    }


}
