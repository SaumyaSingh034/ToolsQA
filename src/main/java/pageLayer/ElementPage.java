package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ElementPage {

    private WebDriver driver;

    public ElementPage(WebDriver driver) {
        this.driver = driver;
    }

    private String heading;
    private By header = By.id("Ad.Plus-970x250-1");
    private By textBox = By.id("item-0");
    private By checkbox = By.id("item-1");
    private By radioBtn = By.id("item-2");
    private By webTable = By.id("item-3");
    private By butn = By.id("item-4");
    private By link = By.id("item-5");
    private By brokenLkn = By.id("item-6");
    private By upload = By.id("item-7");
    private By dynamicProperties = By.id("item-8");
    private By fullName = By.id("userName");
    private By emailID = By.id("userEmail");
    private By cAdd = By.id("currentAddress");

    private By pAdd = By.id("permanentAddress");
    private By submitButton = By.xpath("//button[@id='submit']");

    private By output = By.id("output");

    private By expandHome = By.xpath("//button[@aria-label='Toggle']");

    public String getHeader() {
        return driver.findElement(header).getText();
    }

    public void clickOnElementsList(String elementName) {
        if (elementName.equalsIgnoreCase("Text Box"))
            driver.findElement(textBox).click();
        else if (elementName.equalsIgnoreCase("Check Box"))
            driver.findElement(checkbox).click();

    }

    public void enterFullName(String name) {
        driver.findElement(fullName).sendKeys(name);
    }

    public void emailId(String email) {
        driver.findElement(emailID).sendKeys(email);
    }

    public void completeAddress(String address) {
        driver.findElement(cAdd).sendKeys(address);

    }

    public void permanenetAddress(String pAddress) {
        driver.findElement(pAdd).sendKeys(pAddress);

    }

    public void submitBtn() {
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
        driver.findElement(submitButton).click();
    }

    public void outputDisplayed(){
        driver.findElement(output).isDisplayed();
        System.out.println(driver.findElement(output).getText());
    }

public void expandHome(){
        driver.findElement(expandHome).click();
}

}
