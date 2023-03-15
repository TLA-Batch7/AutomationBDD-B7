package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class PopUpPage {
    public PopUpPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Message']")
    public WebElement messageBtn;

    @FindBy(xpath = "//button[text()='BMI Calculator']")
    public WebElement bmiCalculatorBtn;

    @FindBy(tagName = "h5")
    public WebElement popUpHeaderTxt;

    @FindBy(id = "staticBackdropLabel")
    public WebElement getPopUpHeaderTxt_Bmi;
}
