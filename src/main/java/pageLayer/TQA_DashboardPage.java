package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TQA_DashboardPage {

    private WebDriver driver;

    @FindBy(xpath = "//div[@class='category-cards']/div")
    WebElement listOfCategoryCards;

    @FindBy(xpath = "//h5[contains(text(),'Elements')]")
    public WebElement elementCard;
    @FindBy(xpath = "//h5[contains(text(),'Forms')]")
    public WebElement formCard;

    @FindBy(xpath = "//h5[contains(text(),'Alerts, Frame & Windows')]")
    public WebElement alertFrameWindowCard;

    @FindBy(xpath = "//h5[contains(text(),'Widgets')]")
    public WebElement widgetCard;

    @FindBy(xpath = "//h5[contains(text(),'Interactions')]")
    public WebElement interactionCard;

    @FindBy(xpath = "//h5[contains(text(),'Book Store Application')]")
    public WebElement bookStoreCard;

    public TQA_DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ElementPage clickOnElementCard(){
        elementCard.click();
        return new ElementPage();
    }

    public FormPage clickOnFormCard(){
        formCard.click();
        return new FormPage();
    }

    public AlertPage clickOnAlert(){
        alertFrameWindowCard.click();
        return new AlertPage();
    }

    public WidgetPage clickOnWidgets(){
        widgetCard.click();
        return new WidgetPage();
    }

    public InteractionPage clickOnInteractions(){
        interactionCard.click();
        return new InteractionPage();
    }

    public BookStorePage clickOnBookStore(){
        bookStoreCard.click();
        return new BookStorePage();
    }



}
