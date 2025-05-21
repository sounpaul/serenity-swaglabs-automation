package com.swaglabs.automation.pages;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@Slf4j
public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    WebElementFacade username;

    @FindBy(id = "password")
    WebElementFacade password;

    @FindBy(id = "login-button")
    WebElementFacade loginButton;

    public void typeCredentials() {
        username.type(System.getProperty("username"));
        password.type(System.getProperty("password"));
        log.info("Username & Password send to respective text boxes");
    }

    public void clickOnLoginBtn() {
        loginButton.waitUntilClickable().click();
        log.info("Clicked on Login Btn");
    }


}
