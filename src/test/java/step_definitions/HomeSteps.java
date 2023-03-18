package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.junit.Assert;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.Locale;

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
            case "inputs": BrowserUtils.isDisplayed(page.navInputsBtn);
                break;
            default:
                System.out.println("Wrong button name");
                Assert.fail();
        }
    }

    @When("I click link text {string}")
    public void iClickLinkText(String linkText) {
        switch(linkText){
            case "PHP Travels": BrowserUtils.click(page.phpTravelsLink);
            break;
            case "Mercury tours": BrowserUtils.click(page.mercuryToursLink);
            break;
            case "Internet": BrowserUtils.click(page.internetLink);
            break;
            case "E-commerce": BrowserUtils.click(page.eCommerceLink);
            break;
            case "Passion Tea Company": BrowserUtils.click(page.passionTeaCompLink);
            break;
            case "Saucedemo" : BrowserUtils.click(page.sauceDemoLink);
            break;
            case "Shopping Cart": BrowserUtils.click(page.shoppingCartLink);
            break;
            default:
                Assert.fail("Invalid Link");
        }
        
    }

    @Then("Verify destination window has url as {string}")
    public void verifyDestinationWindowHasUrlAs(String URL) {
        BrowserUtils.switchToNewWindow();
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(),URL);
    }
}
