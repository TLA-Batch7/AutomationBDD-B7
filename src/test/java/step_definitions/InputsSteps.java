package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.InputsPage;
import utils.BrowserUtils;

import java.util.Map;

public class InputsSteps {
    InputsPage page;

    public InputsSteps() {
        page = new InputsPage();
    }

    @When("I fill out contact us form with following details:")
    public void i_fill_out_contact_us_form_with_following_details(Map<String, String> map) {
        for (String key : map.keySet()) {
            if (key.equalsIgnoreCase("state")) {
                BrowserUtils.selectByVisibleText(page.state, map.get(key));
            } else {
                BrowserUtils.sendKeys(
                        BrowserUtils.getDriver().findElement(By.name(key)), map.get(key)
                );
            }
        }

    }

    @Then("Verify text {string} is displayed")
    public void verify_text_is_displayed(String txt) {
        switch (txt.toLowerCase()) {
            case "thanks for contacting us, we will get back to you shortly.":
                BrowserUtils.isDisplayed(page.thankYouText);
                break;
            default:
                System.out.println("text not displayed");
                Assert.fail();
        }
    }
}
