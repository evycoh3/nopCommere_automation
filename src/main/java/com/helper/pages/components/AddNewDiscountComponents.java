package com.helper.pages.components;

import org.openqa.selenium.By;

public class AddNewDiscountComponents {
    private final By addNewDiscountBtn= By.cssSelector("a.btn-primary");
    private final By discountName=By.id("Name");
    private final By discountType=By.name("DiscountTypeId");
    private final By couponCodeCheckbox=By.id("RequiresCouponCode");
    private final By couponCodeTextbox=By.id("CouponCode");
    private final By saveButton=By.cssSelector("button[name='save']");
    private final By addNewDiscount_success_msg=By.cssSelector(".alert-success");
    public By getAddNewDiscountBtn() {
        return addNewDiscountBtn;
    }

    public By getDiscountName() {
        return discountName;
    }

    public By getDiscountType() {
        return discountType;
    }


    public By getCouponCodeCheckbox() {
        return couponCodeCheckbox;
    }

    public By getCouponCodeTextbox() {
        return couponCodeTextbox;
    }

    public By getSaveButton() {
        return saveButton;
    }

    public By getAddNewDiscount_success_msg() {
        return addNewDiscount_success_msg;
    }


}
