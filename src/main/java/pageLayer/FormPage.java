package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    WebDriver driver;
    public FormPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="firstName")
    private WebElement firstName;

    @FindBy(id="lastName")
    private WebElement lastName;

    @FindBy(id="userEmail")
    private WebElement userEmail;

    @FindBy(xpath="//input[@id='gender-radio-1']")
    private WebElement genderMale;
    @FindBy(xpath="//input[@id='gender-radio-2']")
    private WebElement genderFemale;
    @FindBy(xpath="//input[@id='gender-radio-3']")
    private WebElement genderOther;

    @FindBy(id="userNumber")
    private WebElement mobileNo;

    @FindBy(id="dateOfBirthInput")
    private WebElement calendar;

    @FindBy(id="subjectsContainer")
    private WebElement subject;

    @FindBy(id="currentAddress")
    private WebElement address;

}
