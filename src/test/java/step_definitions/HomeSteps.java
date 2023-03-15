package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;
    public HomeSteps(){
        page = new HomePage();
    }

    @Then("I should see header as {string}")
    public void i_should_see_header(String string) {
        BrowserUtils.assertEquals(page.headerTitle.getText(), string);
    }


    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String btn) {
        switch (btn.toLowerCase()) {
            case "home": BrowserUtils.isDisplayed(page.navHomeBtn);
                break;
            case "calendar": BrowserUtils.isDisplayed(page.navCalendarBtn);
                break;
            case "user-mgt": BrowserUtils.isDisplayed(page.navUserMgtBtn);
                break;
            case "others": BrowserUtils.isDisplayed(page.navOthersBtn);
                break;
            case "tables": BrowserUtils.isDisplayed(page.navTablesBtn);
                break;
            default:
                System.out.println("Wrong button name");
                Assert.fail();
        }
    }
}
