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
    String applicationURL;

    @Before(order = 0)
    public void setUpProperties(){
        config = new ConfigReader();
        prop = config.loadProperties();
        browserName = prop.getProperty("browser");
        applicationURL = prop.getProperty("url");

    }
    @Before(order=1)
    public void setUp(){
        factory = new DriverFactory();
        factory.initializeDriver(browserName);
    }

    @After
    public void endTest(Scenario sc){
        final byte[] screenshot =  ((TakesScreenshot)DriverFactory.driver).getScreenshotAs(OutputType.BYTES);
        DriverFactory.driver.quit();
    }
}
