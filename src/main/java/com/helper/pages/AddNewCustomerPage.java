package com.helper.pages;

import com.helper.pages.components.AddCustomerComponents;


public class AddNewCustomerPage extends BasePage{
    AddCustomerComponents adc;

    public AddNewCustomerPage(){
        adc=new AddCustomerComponents();
    }
    public AddNewCustomerPage clickCreateNewCustomerBtn(){
        click(adc.getAddNewCustomerBtn(),"create new customer ");
        return this;
    }
    public AddNewCustomerPage setEmail(String email){
        sendKeys(adc.getEmail_textbox(),email,"email");
        return this;
    }
    public AddNewCustomerPage setPassword(String password){
        sendKeys(adc.getPassword_textbox(),password,"password");
        return this;
    }
    public AddNewCustomerPage setFirstName(String firstName){
        sendKeys(adc.getFirstName_textbox(),firstName,"firstName");
        return this;
    }
    public AddNewCustomerPage setLastName(String lastName){
        sendKeys(adc.getLastName_textbox(),lastName,"lastName");
        return this;
    }
    public AddNewCustomerPage setGender(String gender){
        if(gender.equalsIgnoreCase("male")){
            click(adc.getMaleGender_checkbox(),"male gender");
        }
        else if(gender.equalsIgnoreCase("female")){
            click(adc.getFemaleGender_checkbox(),"female gender");
        }
        return this;
    }
    public AddNewCustomerPage setDateOFBirth(String dateOFBirth){
        sendKeys(adc.getDob_textbox(),dateOFBirth,"date of birth");
        return this;
    }
    public AddNewCustomerPage setCompanyName(String companyName){
        sendKeys(adc.getCompany_textbox(),companyName,"company");
        return this;
    }
    public AddNewCustomerPage setIsTaxExempt(boolean flag){
        if(flag){
            click(adc.getTaxExempt_checkbox(),"text exempt");
        }
        return this;
    }
    public AddNewCustomerPage setAdminComments(String adminComments){
        sendKeys(adc.getAdminComment_textbox(),adminComments,"admin comment");
        return this;
    }
    public AddNewCustomerPage clickSaveBtn(){
        click(adc.getSave_btn(),"save button");
        return this;
    }
    public String getSuccessTextMsg(){
        return getText(adc.getAddNewCustomer_success_msg(),"success msg");
    }
}
