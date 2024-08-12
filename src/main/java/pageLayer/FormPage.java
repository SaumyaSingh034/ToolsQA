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

    @FindBy(xpath = "//div[@id='hobbiesWrapper']")
    private WebElement hobbies;

    @FindBy(id="currentAddress")
    private WebElement address;

    @FindBy(xpath="//*[text()='Select State']")
    private WebElement selectState;

    @FindBy(xpath = "//*[text()='Select City']")
    private WebElement selectCity;

    public void entersFullName(String fName, String lName){
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
    }

    public void enterEmail(String email){
        userEmail.sendKeys(email);
    }



}
