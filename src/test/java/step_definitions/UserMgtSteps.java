package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UserMgtPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class UserMgtSteps {
    UserMgtPage page;

    public UserMgtSteps(){
        page = new UserMgtPage();
    }

    @Then("Verify {string} input field is displayed")
    public void verifyInputFieldIsDisplayed(String inputField) {
        switch (inputField.toLowerCase()){
            case "first name":
                BrowserUtils.isDisplayed(page.firstNameInputField);
                break;
            case "last name":
                BrowserUtils.isDisplayed(page.lastNameInputField);
                break;
            case "phone number":
                BrowserUtils.isDisplayed(page.phoneInputField);
                break;
            case "e-mail":
                BrowserUtils.isDisplayed(page.emailInputField);
                break;
            case "role":
                BrowserUtils.isDisplayed(page.roleSelectOption);
                break;
            default:
                Assert.fail("Invalid Input field");
        }
    }


    @Then("Verify following input fields are displayed:")
    public void verifyFollowingInputFieldsAreDisplayed(List<String> fields) {
        for(String each: fields){
            switch (each.toLowerCase()){
                case "first name":
                    BrowserUtils.isDisplayed(page.firstNameInputField);
                    break;
                case "last name":
                    BrowserUtils.isDisplayed(page.lastNameInputField);
                    break;
                case "phone number":
                    BrowserUtils.isDisplayed(page.phoneInputField);
                    break;
                case "e-mail":
                    BrowserUtils.isDisplayed(page.emailInputField);
                    break;
                case "role":
                    BrowserUtils.isDisplayed(page.roleSelectOption);
                    break;
                default:
                    Assert.fail("Invalid Input field");
            }
        }
    }

    @Then("Verify button {string} is disabled")
    public void verifyButtonIsDisabled(String button) {
        switch (button.toLowerCase()){
            case "submit":
                BrowserUtils.isDisabled(page.userMgtSubmitBtn);
                break;
            default:
                Assert.fail("Invalid button name");
        }
    }

    @When("I fill out new user form with following data:")
    public void iFillOutNewUserFormWithFollowingData(Map<String, String> map) {
        for(String key: map.keySet()){
            switch (key.toLowerCase()){
                case "first name":
                    page.firstNameInputField.sendKeys(map.get(key));
                    break;
                case "last name":
                    page.lastNameInputField.sendKeys(map.get(key));
                    break;
                case "phone number":
                    page.phoneInputField.sendKeys(map.get(key));
                    break;
                case "e-mail":
                    page.emailInputField.sendKeys(map.get(key));
                    break;
                case "role":
                    page.roleSelectOption.sendKeys(map.get(key));
                    break;
                default:
                    Assert.fail("Invalid Input field");
            }
        }
    }
}
