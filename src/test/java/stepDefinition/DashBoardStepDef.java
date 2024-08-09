package stepDefinition;

import appHooks.Hooks;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageLayer.*;

import java.util.List;

public class DashBoardStepDef extends DriverFactory {
    TQA_DashboardPage dashboardPage = new TQA_DashboardPage(driver);
    ElementPage element;
    FormPage form;
    AlertPage alert;
    WidgetPage widget;
    InteractionPage interaction;
    BookStorePage book;
    String pageTitle;

    @Given("user is on the Dashboard Page")
    public void userIsOnTheDashboardPage() {
        System.out.println("URL : " + driver.getCurrentUrl());
    }

    @When("user gets the title of the page")
    public void userGetsTheTitleOfThePage() {
        pageTitle = driver.getTitle();
        System.out.println("User get title of the Page: " + pageTitle);

    }

    @Then("the title of page should be {string}")
    public void theTitleOfPageShouldBe(String expectedTitle) {
        Assert.assertEquals(pageTitle, expectedTitle, "Page Title is not equal, Please check" + pageTitle);

    }

    @When("user clicks on the {string} Card")
    public void userClicksOnTheCard(String card) {
        if (card.equalsIgnoreCase("Elements"))
            element = dashboardPage.clickOnElementCard();
        else if (card.equalsIgnoreCase("Forms")) {
            form = dashboardPage.clickOnFormCard();
        } else if (card.equalsIgnoreCase("Alerts")) {
            alert = dashboardPage.clickOnAlert();
        } else if (card.equalsIgnoreCase("Widgets")) {
            widget = dashboardPage.clickOnWidgets();
        } else if (card.equalsIgnoreCase("Interactions")) {
            interaction = dashboardPage.clickOnInteractions();

        } else if (card.equalsIgnoreCase("Book Store Application")) {
            book = dashboardPage.clickOnBookStore();
        } else {
            System.out.println("Seems like you have input wrong card name, Please check the input Card Name: " + card);
        }



    }

    @Then("user should be navigated to {string} Dashboard Page")
    public void userShouldBeNavigatedToDashboardPage(String card) {
        System.out.println(driver.getTitle());
    }
}
