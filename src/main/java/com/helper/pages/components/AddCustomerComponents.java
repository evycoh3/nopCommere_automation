package com.helper.pages.components;

import org.openqa.selenium.By;

public final class AddCustomerComponents {
    private final By AddNewCustomerBtn= By.cssSelector("a.btn-primary");
    private final By email_textbox=By.id("Email");
    private final By password_textbox=By.id("Password");
    private final By firstName_textbox=By.id("FirstName");
    private final By lastName_textbox=By.id("LastName");
    private final By maleGender_checkbox=By.id("Gender_Male");
    private final By femaleGender_checkbox=By.id("Gender_Female");
    private final By dob_textbox=By.id("DateOfBirth");
    private final By company_textbox=By.id("Company");
    private final By taxExempt_checkbox=By.id("IsTaxExempt");
    private final By newsLetter_dropdown=By.id("SelectedNewsletterSubscriptionStoreIds");
    private final By adminComment_textbox=By.id("AdminComment");
    private final By save_btn=By.name("save");
    private final By addNewCustomer_success_msg=By.cssSelector(".alert-success");

    public By getAddNewCustomerBtn() {
        return AddNewCustomerBtn;
    }

    public By getDob_textbox() {
        return dob_textbox;
    }

    public By getAdminComment_textbox() {
        return adminComment_textbox;
    }

    public By getCompany_textbox() {
        return company_textbox;
    }

    public By getEmail_textbox() {
        return email_textbox;
    }

    public By getFemaleGender_checkbox() {
        return femaleGender_checkbox;
    }

    public By getFirstName_textbox() {
        return firstName_textbox;
    }

    public By getLastName_textbox() {
        return lastName_textbox;
    }

    public By getMaleGender_checkbox() {
        return maleGender_checkbox;
    }

    public By getNewsLetter_dropdown() {
        return newsLetter_dropdown;
    }

    public By getPassword_textbox() {
        return password_textbox;
    }

    public By getTaxExempt_checkbox() {
        return taxExempt_checkbox;
    }

    public By getSave_btn() {
        return save_btn;
    }

    public By getAddNewCustomer_success_msg() {
        return addNewCustomer_success_msg;
    }
}
