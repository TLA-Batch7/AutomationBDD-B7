package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {

    public HomePage() { PageFactory.initElements(BrowserUtils.getDriver(), this);}

    @FindBy(id = "title")
    public WebElement headerTitle;

    @FindBy(xpath = "//a[text()='Calendar']")
    public WebElement navCalendarBtn;

    @FindBy(xpath ="//a[text()='Selectors']")
    public WebElement navSelectorsBtn;

    @FindBy(xpath ="//a[text()='Others']")
    public WebElement navOthersBtn;
}
