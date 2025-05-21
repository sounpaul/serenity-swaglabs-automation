package com.swaglabs.automation.steps;

import com.swaglabs.automation.pages.LoginPage;
import com.swaglabs.automation.pages.ProductPage;
import com.swaglabs.automation.pages.Sidebar;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

@Slf4j
public class SwagLabsSteps extends ScenarioSteps {

    private LoginPage loginPage;
    private ProductPage productPage;
    private Sidebar sidebar;

    EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    public SwagLabsSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void navigateToApp() {
        String url = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
        loginPage.openAt(url);
        getDriver().manage().window().maximize();
        log.info("SauceLabs URL launched : {}", url);
    }

    @Step
    public void enterCredentialsAndLogin() {
        System.setProperty("username",EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("username"));
        System.setProperty("password",EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("password"));
        loginPage.typeCredentials();
        loginPage.clickOnLoginBtn();
    }

}
