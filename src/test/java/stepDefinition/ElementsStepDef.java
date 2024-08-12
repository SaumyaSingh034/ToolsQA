package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageLayer.ElementPage;

public class ElementsStepDef extends DriverFactory {
    ElementPage elementPage = new ElementPage(driver);
    String actualHeadingName;


    @And("user gets the heading of the page")
    public void userGetsTheHeadingOfThePage() {
        actualHeadingName = elementPage.getHeader();
    }

    @Given("user is on the {string} Dashboard Page")
    public void userIsOnTheDashboardPage(String cardName) {
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @And("heading of the page should be {string}")
    public void headingOfThePageShouldBe(String headingName) {
        Assert.assertEquals(actualHeadingName, headingName);
    }

    @When("user clicks on {string} under Elements List")
    public void userClicksOnUnderElementsList(String elementName) {
        elementPage.clickOnElementsList(elementName);

        
    }

    @And("user enters fullName as {string}")
    public void userEntersFullNameAs(String fullName) {
        elementPage.enterFullName(fullName);
    }

    @And("user enters email as {string}")
    public void userEntersEmailAs(String userEmail) {
        elementPage.emailId(userEmail);
    }

    @And("user enters current address as {string}")
    public void userEntersCurrentAddressAs(String currentAdd) {
        elementPage.completeAddress(currentAdd);
    }

    @And("user enters permanent address as {string}")
    public void userEntersPermanentAddressAs(String permanentAdd) {
        elementPage.permanenetAddress(permanentAdd);
        
    }

    @And("user clicks on submit btn")
    public void userClicksOnSubmitBtn() {
        elementPage.submitBtn();
    }

    @Then("All the user data is shown below")
    public void allTheUserDataIsShownBelow() {
        elementPage.outputDisplayed();
    }

    @And("user expands {string}")
    public void userExpands(String text) {
        if(text.equalsIgnoreCase("home")){
            elementPage.expandHome();
        } else if (text.equalsIgnoreCase("Desktop")) {
            elementPage.expandDesktop();

        }


    }

    @And("user selects Desktop and Downloads")
    public void userSelectsDesktopAndDownloads() {
        elementPage.selectCheckBox();
    }
}
