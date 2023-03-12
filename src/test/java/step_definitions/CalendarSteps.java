package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CalendarPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.Locale;

public class CalendarSteps {

    CalendarPage page;
    HomePage homePage;

    public CalendarSteps(){
        this.page = new CalendarPage();
        homePage = new HomePage();
    }

    @When("I click nav button {string}")
    public void i_click_nav_button(String navBtn) {
        switch (navBtn.toLowerCase()) {
            case "calendar" :
                BrowserUtils.click(homePage.navCalendarBtn);
                break;
            case "selectors" :
                BrowserUtils.click(homePage.navSelectorsBtn);
                break;
            default:
                System.out.println("Invalid Button");

        }
//        System.out.println("clicking on calendar page" + navBtn);
//        System.out.println("Click on nav button Selectors" + navBtn);
    }
    @When("I click a button {string}")
    public void i_click_a_button(String calendarBtn) {
        switch (calendarBtn.toLowerCase()) {
            case "endDateInput":
                BrowserUtils.click(page.endDateInput);
                break;
            case "calendarTomorrowDate":
                BrowserUtils.click(page.calendarTomorrowDate);
                break;
            case "submitCalendarButton":
                BrowserUtils.click(page.submitCalendarBtn);
                break;
            default:
                System.out.println("Invalid button");
        }

//        System.out.println("click on endDateInputField");
//        System.out.println("click on calendarTomorrowDate");
//        System.out.println("click on submit");

        BrowserUtils.click(page.endDateInput);

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
