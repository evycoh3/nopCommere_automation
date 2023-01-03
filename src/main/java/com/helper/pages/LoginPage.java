package com.helper.pages;

import com.helper.pages.components.LoginPageComponents;

public class LoginPage extends BasePage {
    LoginPageComponents lpc;

    public LoginPage() {
        lpc = new LoginPageComponents();
    }

    public LoginPage setEmail(String email) {
        clear(lpc.getEmailTextbox(),"email");
        sendKeys(lpc.getEmailTextbox(),email,"email");
        return this;
    }

    public LoginPage setPassword(String password) {
        clear(lpc.getPasswordTextbox(),"password");
        sendKeys(lpc.getPasswordTextbox(),password,"password");
        return this;
    }

    public HomePage clickLoginBtn() {
        click(lpc.getLoginBtn(),"login btn");
        return new HomePage();
    }

    public HomePage doLogin(String em, String pw) {
        setEmail(em);
        setPassword(pw);
        clickLoginBtn();
        return new HomePage();
    }

}
