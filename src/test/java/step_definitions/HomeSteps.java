package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.BrowserUtils;

public class HomeSteps {
    @Given("I navigate to homepage")
    public void i_navigate_to_homepage() {
        System.out.println("navigate step to homepage");
        BrowserUtils.getDriver().get("https://google.com");

        BrowserUtils.closeDriver();
    }

    @Then("I should see header as Automation with Selenium")
    public void i_should_see_header_as_automation_with_selenium() {
        System.out.println("testing header to be Automation with Selenium");
    }
}
