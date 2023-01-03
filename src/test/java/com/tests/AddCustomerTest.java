package com.tests;

import com.github.javafaker.Faker;
import com.helper.annotation.FrameworkAnnotation;
import com.helper.pages.AddNewCustomerPage;
import com.helper.pages.HomePage;
import com.helper.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.Map;




public class AddCustomerTest extends BaseTest {

    @FrameworkAnnotation(author = "evy",category = "regression")
    @Test(description = "add new customer")
    public void tc_addCustomer(Map<String,String> map) {
        Faker faker = new Faker();
        HomePage homePage = new LoginPage().doLogin(map.get("email"),map.get("password"));
        homePage.setSideNavBar("Customers", " Customers");
        String responseMessage = new AddNewCustomerPage()
                .clickCreateNewCustomerBtn()
                .setEmail(faker.internet().emailAddress())
                .setPassword(faker.internet().password())
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setGender(faker.demographic().sex())
                .setDateOFBirth(new SimpleDateFormat("MM/dd/yyyy").format(faker.date().birthday()))
                .setCompanyName(faker.company().name())
                .setIsTaxExempt(faker.random().nextBoolean())
                .setAdminComments(faker.expression("admin comments "))
                .clickSaveBtn()
                .getSuccessTextMsg();
        Assert.assertTrue(responseMessage.contains("The new customer has been added successfully."));


    }




}
