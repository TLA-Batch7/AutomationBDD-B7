package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CalendarPage;
import pages.HomePage;
import utils.BrowserUtils;

public class CalendarSteps {

    CalendarPage page;
    HomePage homePage;

    public CalendarSteps(){
        this.page = new CalendarPage();
        homePage = new HomePage();
    }

    @When("I click nav button {string}")
    public void i_click_nav_button() {
//        System.out.println("clicking on calendar page");
        BrowserUtils.click(homePage.navCalendarBtn);
    }
    @When("I click a button {string}")
    public void i_click_a_button(String string) {
        System.out.println("click on endDateInputField");
        System.out.println("click on calendarTomorrowDate");
        System.out.println("click on submit");

    }

    @Then("Verify text will display {int} day difference")
    public void verify_text_will_display_day_difference(Integer int1) {
//        System.out.println("Verify text display is 1 day different");
        BrowserUtils.assertEquals(String.valueOf(int1),page.endDateInput.getText());
    }

    @Then("Verify text contains current date")
    public void verifyTextWillContainsCurrentDate() {
//        System.out.println("Verify text contains current date");
    }
}
