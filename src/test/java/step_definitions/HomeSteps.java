package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;
    public HomeSteps(){
        page = new HomePage();
    }
//    @Given("I navigate to homepage")
//    public void i_navigate_to_homepage() {
//        System.out.println("navigate step to homepage");
////        BrowserUtils.getDriver().get("https://google.com");
//        BrowserUtils.getDriver().get("http://automation.techleadacademy.io/#/home");
//    }

    @Then("I should see header as {string}")
    public void i_should_see_header(String string) {
        BrowserUtils.assertEquals(page.headerTitle.getText(), string);
        BrowserUtils.closeDriver();
    }


    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String btn) {
        System.out.println("Verify Home button is displayed");
        System.out.println("Verify Calendar button is displayed");
        System.out.println("Verify User-Mgt button is displayed");
        System.out.println("Verify Others button is displayed");
        System.out.println("Verify Tables button is displayed");
    }
}
