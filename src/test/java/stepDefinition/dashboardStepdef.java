package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageLayer.TQA_DashboardPage;

public class dashboardStepdef  {
    WebDriver driver;
    TQA_DashboardPage dashboardPage = new TQA_DashboardPage(driver;)
    @Given("user is on the Dashboard Page")
    public void userIsOnTheDashboardPage() {

    }

    @When("user gets the title of the page")
    public void userGetsTheTitleOfThePage() {

    }

    @Then("the title of page should be {string}")
    public void theTitleOfPageShouldBe(String arg0) {

    }

    @When("user clicks on the {string} Card")
    public void userClicksOnTheCard(String arg0) {

    }

    @Then("user should be navigated to {string} Dashboard Page")
    public void userShouldBeNavigatedToDashboardPage(String arg0) {
    }
}
