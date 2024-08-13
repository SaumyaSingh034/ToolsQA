package pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLDocument;

public class FormPage {
    WebDriver driver;
    Actions action;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "userEmail")
    private WebElement userEmail;

    @FindBy(xpath = "//input[@id='gender-radio-1']")
    private WebElement genderMale;
    @FindBy(xpath = "//input[@id='gender-radio-2']")
    private WebElement genderFemale;
    @FindBy(xpath = "//input[@id='gender-radio-3']")
    private WebElement genderOther;

    @FindBy(id = "userNumber")
    private WebElement mobileNo;

    @FindBy(id = "dateOfBirthInput")
    private WebElement calendar;

    @FindBy(id = "subjectsContainer")
    private WebElement subject;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']")
    private WebElement hobbies;

    @FindBy(id = "currentAddress")
    private WebElement address;

    @FindBy(xpath = "//*[text()='Select State']")
    private WebElement selectState;

    @FindBy(xpath = "//*[text()='Select City']")
    private WebElement selectCity;

    @FindBy(id = "hobbies-checkbox-1")
    private WebElement sports;

    @FindBy(id = "hobbies-checkbox-2")
    private WebElement reading;

    @FindBy(id = "hobbies-checkbox-3")
    private WebElement music;

    @FindBy(id="uploadPicture")
    private WebElement picture;

    public void entersFullName(String fName, String lName) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
    }

    public void enterEmail(String email) {
        userEmail.sendKeys(email);
    }

    public void clickOnRadioBtn(String gender) {
        if (gender.equalsIgnoreCase("Male"))
            genderMale.click();
        else if (gender.equalsIgnoreCase("Female")) {
            genderFemale.click();

        } else {
            genderOther.click();
        }
    }

    public void enterMobileNumber(String mobile) {
        mobileNo.sendKeys(mobile);
    }

    public void entersSubject(String subj) {
        subject.sendKeys(subj);
        action = new Actions(driver);
        action.keyDown(Keys.ARROW_DOWN).build().perform();

    }

    public void uploadPhotograph() {
        picture.sendKeys("src/main/java/resources/hello.txt");
    }

    public void hobbies(String hobby) {
        if (hobby.contains("Sports")) {
            sports.click();
            System.out.println("Checking sports is Selected" + sports.isSelected());

        }
        if (hobby.contains("Music")) {
            music.click();
            System.out.println("Checking music is Selected" + music.isSelected());

        }
        if (hobby.contains("Reading")) {
            reading.click();
            System.out.println("Checking reading is Selected" + reading.isSelected());

        }
    }


}
