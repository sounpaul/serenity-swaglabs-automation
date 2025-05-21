package com.swaglabs.automation.stepdef;

import com.swaglabs.automation.steps.SwagLabsSteps;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;

public class SwagLabsStepDef {

    @Steps
    SwagLabsSteps swagLabsSteps;

    @Given("user is on the Swag Labs login page")
    public void user_is_on_the_swag_labs_login_page() {
        swagLabsSteps.navigateToApp();
        swagLabsSteps.enterCredentialsAndLogin();
    }
    @When("user enters valid credentials and clicks login button")
    public void user_enters_valid_credentials_and_clicks_login_button() {

    }
    @Then("user should be redirected to the Swag Labs inventory page")
    public void user_should_be_redirected_to_the_swag_labs_inventory_page() {

    }

}
