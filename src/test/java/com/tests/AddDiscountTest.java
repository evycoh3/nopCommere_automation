package com.tests;

import com.helper.annotation.FrameworkAnnotation;
import com.helper.pages.AddNewDiscountPage;
import com.helper.pages.HomePage;
import com.helper.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class AddDiscountTest extends BaseTest {

    @FrameworkAnnotation(author = "evy", category = "regression")
    @Test(description = "add new DISCOUNT")
    public void tc_addDiscount(Map<String, String> map) throws InterruptedException {
        HomePage homePage = new LoginPage().doLogin(map.get("email"), map.get("password"));
        homePage.setSideNavBar("Promotions", " Discounts");
        String msg = new AddNewDiscountPage()
                .clickAddNew()
                .setDiscountName("evy discount")
                .selectDiscountType("Assigned to products")
                .setDiscountCoupon("12345")
                .clickSaveButton()
                .getSuccessTxtMsg();
        Assert.assertTrue(msg.contains("The new discount has been added successfully."));

    }
}
