package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementPage {

    private WebDriver driver;
    TQA_DashboardPage dashboardPage;

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

    public void getHeader(){
        heading = driver.findElement(header).getText();
    }

}
