package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public WebDriver initializeDriver(String browser){
        if(browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            Wait wait = new FluentWait(driver).withTimeout(20,TimeUnit.SECONDS)
//                    .pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

        }
        return driver;
    }

}
