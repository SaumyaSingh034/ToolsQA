package appHooks;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

import java.util.Properties;

public class Hooks {

    DriverFactory factory;
    WebDriver driver;
    private ConfigReader config;
    Properties prop;
    String browserName;
    public String applicationURL;

    @Before(order = 0)
    public void setUpProperties() {
        config = new ConfigReader();
        prop = config.loadProperties();
        browserName = prop.getProperty("browser");
        applicationURL = prop.getProperty("url");

    }

    @Before(order = 1)
    public void setUp() {
        factory = new DriverFactory();
        driver = factory.initializeDriver(browserName);
        driver.manage().deleteAllCookies();

        driver.get(applicationURL);

        driver.manage().window().maximize();
    }

    @After(order = 0)
    public void closeBrowser() {
        driver.quit();
    }

    @After(order = 1)
    public void endTest(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }
}
