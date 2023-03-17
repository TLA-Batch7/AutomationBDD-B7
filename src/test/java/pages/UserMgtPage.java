package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class UserMgtPage {
    public UserMgtPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(id = "Firstname")
    public WebElement firstNameInputField;

    @FindBy(id = "Lastname")
    public WebElement lastNameInputField;

    @FindBy(id = "Phonenumber")
    public WebElement phoneInputField;

    @FindBy(id = "Email")
    public WebElement emailInputField;

    @FindBy(id = "Select-role")
    public WebElement roleSelectOption;

    @FindBy(id="submit-btn")
    public WebElement userMgtSubmitBtn;

    public void fillNewUserForm(String fName, String lName, String phone, String emailInput, String roleInput){
        firstNameInputField.sendKeys(fName);
        lastNameInputField.sendKeys(lName);
        phoneInputField.sendKeys(phone);
        emailInputField.sendKeys(emailInput);
        roleSelectOption.sendKeys(roleInput);
        userMgtSubmitBtn.click();
    }
}
