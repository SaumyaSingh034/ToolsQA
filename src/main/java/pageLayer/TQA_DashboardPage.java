package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TQA_DashboardPage {

    private WebDriver driver;
    private List<WebElement> cardList;
    private By cardListElement = By.xpath("//div[@class='avatar mx-auto white']");

    public TQA_DashboardPage(WebDriver driver){
        this.driver = driver;
        cardList = getListOfElements();
    }

    public ElementPage clickOnElementCard(){
        cardList.get(0).click();
        return new ElementPage();
    }

    public FormPage clickOnFormCard(){
        cardList.get(1).click();
        return new FormPage();
    }

    public AlertPage clickOnAlert(){
        cardList.get(2).click();
        return new AlertPage();
    }

    public WidgetPage clickOnWidgets(){
        cardList.get(3).click();
        return new WidgetPage();
    }

    public InteractionPage clickOnInteractions(){
        cardList.get(4).click();
        return new InteractionPage();
    }

    public BookStorePage clickOnBookStore(){
        cardList.get(5).click();
        return new BookStorePage();
    }

    public List<WebElement> getListOfElements(){
        cardList = driver.findElements(cardListElement);
        return cardList;
    }



}
