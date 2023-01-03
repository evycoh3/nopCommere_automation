package com.helper.pages.components;

import org.openqa.selenium.By;

public final class LoginPageComponents {
    private final By emailTextbox= By.id("Email");
    private final By passwordTextbox=By.id("Password");
    private final By loginBtn=By.cssSelector("button[type='submit']");

    public By getEmailTextbox() {
        return emailTextbox;
    }

    public By getPasswordTextbox() {
        return passwordTextbox;
    }

    public By getLoginBtn() {
        return loginBtn;
    }
}
