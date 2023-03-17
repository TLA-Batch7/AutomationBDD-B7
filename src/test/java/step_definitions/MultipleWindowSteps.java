package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MultipleWindowPage;
import pages.UserMgtPage;
import utils.BrowserUtils;

import java.util.List;

public class MultipleWindowSteps {
    MultipleWindowPage page;
    UserMgtPage userMgtPage;

    public MultipleWindowSteps() {
        page = new MultipleWindowPage();
        userMgtPage = new UserMgtPage();
    }

    @Then("Verify {string} is enabled")
    public void verifyIsEnabled(String button) {
        switch (button.toLowerCase()){
            case "launch tla":
                BrowserUtils.isEnabled(page.launchTLABtn);
                break;
            case "launch google":
                BrowserUtils.isEnabled(page.launchGoogleBtn);
                break;
            case "launch facebook":
                BrowserUtils.isEnabled(page.launchFacebookBtn);
                break;
            case "submit":
                BrowserUtils.isEnabled(userMgtPage.userMgtSubmitBtn);
                break;
            default:
                Assert.fail("Invalid button name");
        }
    }

    @Then("Verify following buttons are enabled")
    public void verifyFollowingButtonsAreEnabled(List<String> buttons) {
        for (String each: buttons){
            switch (each.toLowerCase()){
                case "launch tla":
                    BrowserUtils.isEnabled(page.launchTLABtn);
                    break;
                case "launch google":
                    BrowserUtils.isEnabled(page.launchGoogleBtn);
                    break;
                case "launch facebook":
                    BrowserUtils.isEnabled(page.launchFacebookBtn);
                    break;
                default:
                    Assert.fail("Invalid button name");
            }
        }
    }
}
