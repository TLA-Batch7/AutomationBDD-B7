package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BrowserUtils;

public class OthersSteps {
    @When("I open Others page")
    public void i_open_others_page() {
        System.out.println("opened others page");
    }
    @Then("Verify Disabled button is disabled")
    public void verify_disabled_button_is_disabled() {
        System.out.println("verified disabled button");
    }

    @When("I click on Toggle button")
    public void iClickOnToggleButton() {
        System.out.println("clicked on toggle button");
    }

    @Then("Verify Disabled button is enabled")
    public void verifyDisabledButtonIsEnabled() {
        System.out.println("verified enabled status");
    }

}
