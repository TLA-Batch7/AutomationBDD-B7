package step_definitions;

import io.cucumber.java.en.Then;
import pages.PopUpPage;
import utils.BrowserUtils;

public class PopUpSteps {
    PopUpPage page;

    public PopUpSteps() {
        page = new PopUpPage();
    }

    @Then("Verify header text of pop up window is {string}")
    public void verifyHeaderTextOfPopUpWindowIs(String expectedText) {
        switch (expectedText) {
            case "New message":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.popUpHeaderTxt), expectedText);
                break;
            case "BMI Calculator":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.getPopUpHeaderTxt_Bmi), expectedText);
                break;
        }
    }
}
